/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.clienteModel;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author lay's
 */
public class clienteDao {
    
    private ConexaoBanco conexao;
        
    public clienteDao(){
        this.conexao = new ConexaoBanco();
    }
    
    public clienteModel inserirCliente(){
        clienteModel novoCliente;
        
        String sql = "INSERT INTO Cliente VALUES (?,?,?,?)";
        
        
        
        return novoCliente;
    }
    
    public ArrayList<clienteModel> clienteExibir(){
        String sql = "SELECT *, Cidade.Nome FROM Cliente INNER JOIN Cidade ON Cliente.cidadeId = Cidade.cidadeId";
        
        ArrayList<clienteModel> listaClientes = new ArrayList<>();
        
        try
        {
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                ResultSet resultadoSentenca = sentenca.executeQuery();
                
                while(resultadoSentenca.next()){
                    clienteModel cadastro = new clienteModel();
                    cadastro.setClienteId(resultadoSentenca.getInt("clienteId"));
                    cadastro.setNome(resultadoSentenca.getString("nome"));
                    cadastro.setRua(resultadoSentenca.getString("rua"));
                    cadastro.setBairro(resultadoSentenca.getString("bairro"));
                    cadastro.setCidadeId(resultadoSentenca.getInt("cidadeId"));
                    
                    listaClientes.add(cadastro);
                }
                sentenca.close();
                this.conexao.getConnection().close();
            }
            
                return listaClientes;
                
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
                

    }
}

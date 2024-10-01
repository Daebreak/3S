/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.clienteModel;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author lay's
 */
public class clienteDao {
    
    private ConexaoBanco conexao;
        
    public clienteDao(){
        this.conexao = new ConexaoBanco();
    }
    
    public ArrayList<clienteModel> clienteExibir(){
        String sql = "SELECT *, Cidade.Nome FROM Cliente INNER JOIN Cidade ON Cliente.cidadeId = Cidade.cidadeId";
        
        try
        {
            if(this.conexao.conectar()){
                PreparedStatement sentenca = this.conexao.getConnection().prepareStatement(sql);
                
                
                
            }
        } catch(SQLException ex) {
            
        }
                
        return true;
    }
}

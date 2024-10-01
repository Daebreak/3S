/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lay's
 */
public class clienteModel {

    private int clienteId;
    private String nome;
    private String rua;
    private String bairro;
    private String cep;
    private int cidadeId;
    
    
    public int getClienteId() {
        return clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getCidadeId() {
        return cidadeId;
    }

    public void setCidadeId(int cidadeId) {
        this.cidadeId = cidadeId;
    }

    public clienteModel(String nome, String rua, String bairro, String cep, int cidadeId){
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidadeId = cidadeId;
    }
    
    public clienteModel(int clienteId, String nome, String rua, String bairro, String cep, int cidadeId){
        this.clienteId = clienteId;
        this.nome = nome;
        this.rua = rua;
        this.bairro = bairro;
        this.cep = cep;
        this.cidadeId = cidadeId;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_1_workcollege_lpoo;

/**
 *
 * @author Lucas Morel
 */
public class Cliente {
    
    private String nomeCompleto;

    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    
    public void Construa_Cliente(String nomeCompleto){
		this.nomeCompleto = nomeCompleto;
	}
}
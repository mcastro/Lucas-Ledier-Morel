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
public class Nota_Fiscal_Eletronica {
    

	//ESTOU COM DIFICULDADE DE FAZER A HERANÇA QUE O SENHOR PEDIU PARA SER FEITO NO TÓPICO 11 AO 13 NÃO ESTOU CONSEGUINDO RESOLVER.
    
// extends não é utilizado aqui e sim na definição da classe 
    public .Nota_Fiscal_Eletronica extends Nota_Fiscal {
	// ^ tem um ponto aqui que não existe

	    // atenção com os blocos 
    public Nota_Fiscal_Eletronica (String _codigo, double _Valor_Total, Cliente _cliente){
            super(_codigo, _Valor_Total, _cliente)
    }
    
}

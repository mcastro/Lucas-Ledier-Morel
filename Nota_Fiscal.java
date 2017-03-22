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
public class Nota_Fiscal {
    
    private String codigo;
    private double Valor_Total;

    public String getCodigo() {
        return codigo;
    }

    public double getValor_Total() {
        return Valor_Total;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setValor_Total(double Valor_Total) {
        this.Valor_Total = Valor_Total;
    }
    
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void Construa_Nota_Fiscal(String codigo, double Valor_Total, Cliente cliente){
		this.Valor_Total = Valor_Total;
                this.codigo = codigo;
                this.cliente = cliente;
                }

    public static final long CODIGO_MUNICIPAL = 12;
    
    public Nota_Fiscal(String _codigo, double _Valor_Total, Cliente _cliente) {
		this.codigo = _codigo;
		this.Valor_Total = _Valor_Total;
		this.cliente = _cliente;
	}
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodecaso02;

/**
 *
 * @author 202212030052
 */
public class Lance {
    private Pessoa licitante;
    private double valor;

    public Lance(Pessoa licitante, double valor) {
this.licitante = licitante;
this.valor = valor;
}

    public Pessoa getLicitante() {
return licitante;
}

    public double getValor() {
return valor;
}

}

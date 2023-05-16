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
public class Lote {
    

    private int numero;
    private String descricao;
    private Lance maiorLance;
    private double valorMin;
    
    public Lote(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }
    

public int getNumero() {
return this.numero;
}

public String getDescricao() {
return this.descricao;
}

public Lance getMaiorLance() {
return this.maiorLance;
}

public double getValorMin(){
    return this.valorMin;
}

public void setMaiorLance(Lance maiorLance) {
this.maiorLance = maiorLance;
}

}

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
public class Interface {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Fulano");
        Pessoa p2 = new Pessoa("Ciclano");
        
        Leilao meuLeilao = new Leilao();
        
        meuLeilao.adicionaLote("Madu");
        meuLeilao.adicionaLote("Gabriel");
        meuLeilao.adicionaLote("Rafael");
        
        meuLeilao.mostraLotes();
        
        
    }
}

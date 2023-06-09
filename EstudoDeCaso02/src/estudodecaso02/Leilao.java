/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodecaso02;

import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author 202212030052
 */
public class Leilao {
    private ArrayList<Lote> lotes;
    private int numeroProxLote;
    
    
    public Leilao(){
        this.lotes = new ArrayList<>();
        this.numeroProxLote = 1;        
    }
    
    public void adicionaLote(String descricao) {
this.lotes.add(new Lote(this.numeroProxLote, descricao));
this.numeroProxLote++;
}
    
public void mostraLotes() {
    Iterator<Lote> it = this.lotes.iterator();
    while (it.hasNext()) {
        Lote lote = it.next();
        System.out.println(lote.getNumero() + ": " + lote.getDescricao());
        Lance melhorLance = lote.getMaiorLance();

        if (melhorLance != null) {
        System.out.println(" Lance:" + melhorLance.getValor());
        } else {
            System.out.println(" (Nenhum Lance)");
        }
    }
}

public void lancePara(final Pessoa licitante, final double valor, int numero) {
    Lote lote = this.getLote(numeroProxLote - 1);
        if ((lote.getMaiorLance() == null || lote.getMaiorLance().getValor() < valor) && valor > lote.getValorMin()) {
            lote.setMaiorLance(new Lance(licitante, valor));
        }
        else {
            System.out.println("Lote no: " + lote.getNumero() + "(" + lote.getDescricao() + ") Atualmente tem um lance de: " + lote.getMaiorLance().getValor());
        }
    }

public Lote getLote(int numero) {
    if ((numero >= 1) && (numero < this.numeroProxLote)) {
        Lote loteSelecionado = this.lotes.get(numero - 1);
        if (loteSelecionado.getNumero() != numero) {
            System.out.println("Erro!!");
        }
        return loteSelecionado;
        } else {
    // System.out.println("Lote numero " + numero + "não existe");
        return null;
        }
    }

public void removeLote(){
    
}


public boolean close(){
    Iterator<Lote> it = this.lotes.iterator();
    while(it.hasNext()) {
        Lote lote = it.next();
        
            Lance maiorLance = lote.getMaiorLance();
        
            if (maiorLance != null) {
                Pessoa arrematador = maiorLance.getLicitante();
                double valorLance = maiorLance.getValor();
                return true;
            }      
    }
    return false;
}

}

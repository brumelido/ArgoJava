package Argo;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> listaContato = new ArrayList<>();


    public void adiconarContato(Contato cont){
        listaContato.add(cont);
    }

    public String listarContato(){
        String saida = "";
        for(Contato cont: listaContato){
            saida += cont.Imprimir();
        }
        return saida;
    }

    public String listarContato2(){
        String saida = "";
        for(Contato cont: listaContato){
            saida += cont.Imprimir2();
        }
        return saida;
    }
    
}
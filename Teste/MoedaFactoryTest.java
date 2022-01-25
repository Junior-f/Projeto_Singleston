package Projeto_Singleton.Teste;

import Projeto_Singleton.Moeda;
import Projeto_Singleton.MoedaFactory;
import Projeto_Singleton.Pais;

public class MoedaFactoryTest {

    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.EUA);
        System.out.println(moeda.getSimbolo());
    }
    
}

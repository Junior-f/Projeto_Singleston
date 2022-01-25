package Projeto_Singleton.Teste;

import Projeto_Singleton.AviaoSingletonEnum;

public enum AviaoSingletonEnumTest{

    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAssento("1A");
        AviaoSingletonEnum.agendarAssento("1A");
    }
    
}

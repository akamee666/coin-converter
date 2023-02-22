package br.com.moraes.Models;

public class Coin {
    private String name;
    private String bid;

    public Coin(String name,String bid) {
        this.name = name;
        this.bid = bid;
    }
 
    public String getBid() {
        return bid;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nome: " + name + " Valor Atual: " + bid;
    }

    public void buscaCoin() { // preciso saber quais parametros esse metodo precisa receber para fazer a
                              // chamada
    }
}

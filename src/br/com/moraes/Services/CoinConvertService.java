package br.com.moraes.Services;

import br.com.moraes.Models.Coin;

public class CoinConvertService {
    private Double coinValue;
    private Object selectedValueToConv;

    public Double Convert(Double coinValue) throws Exception {
        String coin = "USD-BRL";
        CoinService coinService = new CoinService();
        Coin valueCoin = coinService.buscaCoin(coin);
        
        System.out.println(valueCoin.getBid());
        System.out.println(valueCoin.getName());
        

        return null;
    }
    
    public static void main(String[] args) {
        CoinConvertService test = new CoinConvertService();
        try {
            test.Convert(90.9);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

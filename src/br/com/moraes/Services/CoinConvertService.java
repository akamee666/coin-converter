package br.com.moraes.Services;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import br.com.moraes.Models.Coin;

/**
 * Essa classe é responsavel pelos metodos de conversao de Moedas.
 */

public class CoinConvertService {
    
    public Double ConvertCoin(Double coinValue, String selectedValueToConv) throws Exception {
        CoinService coinService = new CoinService();
        
        Coin selectedCoin = coinService.buscaCoin(selectedValueToConv);
        String valueCoin = selectedCoin.getBid();
        Double valueCoinDouble = Double.parseDouble(valueCoin);
        
        Double convertedCoin =  coinValue * valueCoinDouble;
        
        return convertedCoin;
    }

    //check
    public void brlToUsd(Double coinValue) throws Exception {
        String selectedValueToConv = "BRL-USD";
        Double convertedValue = ConvertCoin(coinValue, selectedValueToConv);
        System.out.println(convertedValue);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + "$");
    }

    //check
    public void usdToBrl(Double coinValue) throws Exception {
        String selectedValueToConv = "USD-BRL";
        Double convertedValue = ConvertCoin(coinValue, selectedValueToConv);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + "$" );
    }
    //check
    public void brlToEur(Double coinValue) throws Exception {
        String selectedValueToConv = "BRL-EUR";
        Double convertedValue = ConvertCoin(coinValue, selectedValueToConv);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + "$");
    }
    //check
    public void eurToBrl(Double coinValue) throws Exception {
        String selectedValueToConv = "EUR-BRL";
        Double convertedValue = ConvertCoin(coinValue, selectedValueToConv);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + "$");
    }
    //check
    public void brlToGbp(Double coinValue) throws Exception {
        String selectedValueToConv = "BRL-GBP";
        Double convertedValue = ConvertCoin(coinValue, selectedValueToConv);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + "$");
    }
    //check
    public void gbpToBrl(Double coinValue) throws Exception {
        String selectedValueToConv = "GBP-BRL";
        Double convertedValue = ConvertCoin(coinValue, selectedValueToConv);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + "$");
    }
    //check
    public void brlToArs(Double coinValue) throws Exception {
        String selectedValueToConv = "BRL-ARS";
        Double convertedValue = ConvertCoin(coinValue, selectedValueToConv);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + "$");
    }
    //check
    public void arsToBrl(Double coinValue) throws Exception {
        String selectedValueToConv = "ARS-BRL";
        Double convertedValue = ConvertCoin(coinValue, selectedValueToConv);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + "$");
    }
    //check
    public void brlToClp(Double coinValue) throws Exception {
        String selectedValueToConv = "BRL-CLP";
        Double convertedValue = ConvertCoin(coinValue, selectedValueToConv);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + "$");
    }
    //check
    public void clpToBrl(Double coinValue) throws Exception {
        String selectedValueToConv = "CLP-BRL";
        Double convertedValue = ConvertCoin(coinValue, selectedValueToConv);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + "$");
    }
}

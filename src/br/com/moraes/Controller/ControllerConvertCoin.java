package br.com.moraes.Controller;

import br.com.moraes.Services.CoinConvertService;
import br.com.moraes.View.ConversorFrameView;

public class ControllerConvertCoin {
    ConversorFrameView view = new ConversorFrameView();
    CoinConvertService convert = new CoinConvertService();

    public void Convert(Double valor) throws Exception {
        String selectedCoinToConv = view.opcoesConversaoView();

        switch (selectedCoinToConv) {
            case "De Real para Dolar":
                convert.brlToUsd(valor);
                break;
            case "De Dolar para Real":
                convert.usdToBrl(valor);
                break;
            case "De Real para Euro":
                convert.brlToEur(valor);
                break;
            case "De Euro para Real":
                convert.eurToBrl(valor);
                break;
            case "De Real para Peso Argentino":
                convert.brlToArs(valor);
                break;
            case "De Peso Argentino para Real":
                convert.arsToBrl(valor);
                break;
            case "De Real para Libra Esterlina":
                convert.brlToGbp(valor);
                break;
            case "De Libra Esterlina para Real":
                convert.gbpToBrl(valor);
                break;
            case "De Real para Peso Chileno":
                convert.brlToClp(valor);
                break;
            case "De Peso Chileno para Real":
                convert.clpToBrl(valor);
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        ControllerConvertCoin con = new ControllerConvertCoin();
        con.Convert(10.0);
    }
}

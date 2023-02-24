package br.com.moraes.Controller;

import br.com.moraes.Services.CoinConvertService;
import br.com.moraes.View.ConversorFrameView;

/**
 * A classe ControllerConvertCoin é responsavel por fazer a conversao desejada.
 * Tem apenas um metodo "Convert", que recebe o valor que deve ser convertido e a moeda selecionada da conversao.
 * Dentro do metodo é usado o switch para verificar qual moeda será convertida e em cada case,ele chama o metodo correspondente a moeda da classe CoinConvertService
 */

public class ControllerConvertCoin {
    ConversorFrameView view = new ConversorFrameView();
    CoinConvertService convert = new CoinConvertService();

    public void Convert(Double valor,String selectedCoinToConv) throws Exception {

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
}

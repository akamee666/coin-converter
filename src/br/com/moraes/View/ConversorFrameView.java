package br.com.moraes.View;

import javax.swing.JOptionPane;

public class ConversorFrameView {

    private Object opcoesConversao() {
        Object[] moedas = {"De Real para Dólar", 
        "De Dólar para Real", 
        "De Real para Peso Argentino", 
        "De Peso Argentino para Real",
        "De Real para Euro",
        "De Euro para Real",
        "De Real para Libra Estelina",
        "De Libra Estelina para Real",
        "De Real para Peso Chileno",
        "De Peso Chileno para Real"};

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha o tipo da conersao!",
                "Escolha a moeda desejada",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                moedas,
                moedas[0]);

        return selectedValue;
    }


    private void view() {
        Object[] opcoes = { "Conversor de Moedas", "Convesor de Temperaturas" };

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha um Conversor!",
                "Escolha o Conversor",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        //dividir
        if (selectedValue == "Conversor de Moedas" || selectedValue == "Conversor de Temperaturas") {

            int i = JOptionPane.showConfirmDialog(null,
                    "Voce escolheu o " + selectedValue + " deseja Continuar?", "Confirmaçao",
                    JOptionPane.OK_CANCEL_OPTION);
            //dividir 
            if (i == JOptionPane.OK_OPTION) {
                double valor = 0;
                String inputValue = JOptionPane.showInputDialog(null, "Digite o valor para a conversao");
                inputValue = inputValue.replace(',', '.');
                try {
                    valor = Double.parseDouble(inputValue);
                    opcoesConversao();

                } catch(NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Número Invalido!");
                    view();
                };
                
            }

            if (i == JOptionPane.CANCEL_OPTION) {
                view();
            }

        }

    }

    public static void main(String[] args) {
        ConversorFrameView caixa = new ConversorFrameView();
        caixa.view();

    }
}

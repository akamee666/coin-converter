package br.com.moraes.View;

import javax.swing.JOptionPane;

public class ConversorFrameView {

    private Object selectedValueConversor;
    // 0 == OK and 2 == Cancel
    private Integer selectedValueConfirmacao;
    private Double valueMoeda;

    private Object escolhaConversorView() {
        Object[] opcoes = { "Conversor de Moedas", "Convesor de Temperaturas" };

        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um Conversor!", "Escolha o Conversor",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        return this.selectedValueConversor = selectedValue;
    }

    private int escolhaConfirmacaoView() {
        if (selectedValueConversor == "Conversor de Moedas" || selectedValueConversor == "Convesor de Temperaturas") {
            int i = JOptionPane.showConfirmDialog(null,
                    "Voce escolheu o " + selectedValueConversor + " deseja Continuar?", "Confirmaçao",
                    JOptionPane.OK_CANCEL_OPTION);
            this.selectedValueConfirmacao = i;
        }
        return selectedValueConfirmacao;
    }

    private void escolhaValorView() {
        if (selectedValueConfirmacao == 0) { // OK >> preciso de um input para o valor!

            double valueMoedaInput = 0;
            String inputValue = JOptionPane.showInputDialog(null, "Digite o valor para a conversao",
                    JOptionPane.OK_OPTION);
            inputValue = inputValue.replace(',', '.');
            try {
                valueMoedaInput = Double.parseDouble(inputValue);
                if (valueMoedaInput == 0.0) {
                    throw new NumberFormatException();
                }
                this.valueMoeda = valueMoedaInput;
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Número Invalido!");
                viewTotal();
            }
        }

        if (selectedValueConfirmacao == 2) {
            viewTotal();
        }
    }

    // private void view() {

    // } catch (NumberFormatException n) {
    // JOptionPane.showMessageDialog(null, "Número Invalido!");
    // view();
    // }
    // ;

    // }

    // if (i == JOptionPane.CANCEL_OPTION) {
    // view();
    // }

    // }

    private Object opcoesConversao() {
        Object[] moedas = { "De Real para Dólar",
                "De Dólar para Real",
                "De Real para Peso Argentino",
                "De Peso Argentino para Real",
                "De Real para Euro",
                "De Euro para Real",
                "De Real para Libra Estelina",
                "De Libra Estelina para Real",
                "De Real para Peso Chileno",
                "De Peso Chileno para Real" };

        Object selectedValue = JOptionPane.showInputDialog(null,
                "Escolha o tipo da conersao!",
                "Escolha a moeda desejada",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                moedas,
                moedas[0]);

        return selectedValue;
    }

    private void viewTotal() {
        escolhaConversorView();
        escolhaConfirmacaoView();
        escolhaValorView();
        System.out.println(valueMoeda);
    }

    public static void main(String[] args) {
        ConversorFrameView caixa = new ConversorFrameView();
        caixa.viewTotal();
    }
}

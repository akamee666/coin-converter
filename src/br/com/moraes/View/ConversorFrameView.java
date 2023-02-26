package br.com.moraes.View;

import javax.swing.JOptionPane;

import br.com.moraes.Controller.ControllerConvertCoin;

public class ConversorFrameView {
    static Object[] moedas = { "De Real para Dolar",
            "De Dolar para Real",
            "De Real para Peso Argentino",
            "De Peso Argentino para Real",
            "De Real para Euro",
            "De Euro para Real",
            "De Real para Libra Esterlina",
            "De Libra Esterlina para Real",
            "De Real para Peso Chileno",
            "De Peso Chileno para Real" };

    public void RunApp() {
        escolhaConversorView();
    }

    public void escolhaConversorView() {
        Object[] opcoes = { "Conversor de Moedas", "Convesor de Temperaturas" };

        String selectedValue = (String) JOptionPane.showInputDialog(null, "Escolha um Conversor!",
                "Escolha o Conversor",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        escolhaConfirmacaoView(selectedValue);
    }

    public void escolhaConfirmacaoView(String conversorSelectedKey) {
        if (conversorSelectedKey == "Conversor de Moedas" || conversorSelectedKey == "Convesor de Temperaturas") {
            int i = JOptionPane.showConfirmDialog(null,
                    "Voce escolheu o " + conversorSelectedKey + " deseja Continuar?", "Confirmaçao",
                    JOptionPane.OK_CANCEL_OPTION);

            //AQUI VAI VIM A VERIFICAÇAO DO CONVERSOR DE TEMPERATURAS

            if (i == 0) {
                opcoesConversaoMoeda();
            } else {
                escolhaConversorView();
            }
        }
    }

    public void opcoesConversaoMoeda() {
        String selectedOpcao = (String) JOptionPane.showInputDialog(
                null,
                "Escolha o tipo da conversao!",
                "Escolha a moeda desejada",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                moedas,
                moedas[0]);

        if(selectedOpcao != null) {
            escolhaValorMoeda(selectedOpcao);
        }
    }

    public void escolhaValorMoeda(String coinSelectedToConv) {
        double valueMoedaInput = 0;
        String inputValue = JOptionPane.showInputDialog(null, "Digite o valor para a conversao",
                JOptionPane.OK_OPTION);
        inputValue = inputValue.replace(',', '.');
        try {
            valueMoedaInput = Double.parseDouble(inputValue);
            ControllerConvertCoin controller = new ControllerConvertCoin();
            controller.Convert(valueMoedaInput, coinSelectedToConv);

            if (valueMoedaInput == 0.0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Número Invalido!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

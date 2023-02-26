package br.com.moraes.Services;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class TempConvertService {
    // check
    public void celsiusToFahrenheit(Double valorTC) {
        // TC/5 = (TF – 32)/9 ou TF = TC x 1,8 + 32
        Double convertedValue;
        Double TFConverted = (valorTC * 1.8) + 32;

        DecimalFormat df = new DecimalFormat("###,##0.00");
        convertedValue = TFConverted;

        JOptionPane.showMessageDialog(null,
                "O valor Convertido é de: " + df.format(convertedValue) + " graus Fahrenheit");
    }

    // check
    public void celsiusToKelvin(Double valorTC) {
        // TC = TK - 273 ou TK = TC + 273
        Double convertedValue;
        Double TKConverted = valorTC + 273;

        DecimalFormat df = new DecimalFormat("###,##0.00");
        convertedValue = TKConverted;

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + " graus Kelvin");

    }

    // check
    public void fahrenheitToCelsius(Double valorTF) {
        Double convertedValue;
        Double TCConverted = (valorTF - 32) / 1.8;

        DecimalFormat df = new DecimalFormat("###,##0.00");
        convertedValue = TCConverted;

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + " graus Celsius");
    }

    public void fahrenheitToKelvin(Double valorTF) {
        // K = (y °F + 459,67) x 5/9

        Double convertedValue;
        Double TKConverted = (valorTF + 459.67) * 5 / 9;

        DecimalFormat df = new DecimalFormat("###,##0.00");
        convertedValue = TKConverted;

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + " graus Kelvin");
    }

    public void kelvinToCelsius(Double valorTK) {
        // TC = TK - 273
        Double convertedValue;
        Double TCConverted = valorTK - 273;

        DecimalFormat df = new DecimalFormat("###,##0.00");
        convertedValue = TCConverted;

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + " graus Celsius");
    }

    public void kelvinToFahrenheit(Double valorTK) {
        // F = 1.8 x (K - 273) + 32
        Double convertedValue;
        Double TFConverted = 1.8 * (valorTK - 273) + 32;

        DecimalFormat df = new DecimalFormat("###,##0.00");
        convertedValue = TFConverted;

        JOptionPane.showMessageDialog(null, "O valor Convertido é de: " + df.format(convertedValue) + " graus Fahrenheit");
    }
}

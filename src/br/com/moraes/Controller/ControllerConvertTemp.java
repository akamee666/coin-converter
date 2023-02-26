package br.com.moraes.Controller;

import br.com.moraes.Services.TempConvertService;

public class ControllerConvertTemp {
    TempConvertService convert = new TempConvertService();

    public void Convert(Double valor, String tempSelectedToConv) {
        switch (tempSelectedToConv) {
            case "Converter de Celsius a Fahrenheit":
                convert.celsiusToFahrenheit(valor);
                break;
            case "Converter de Celsius a Kelvin":
                convert.celsiusToKelvin(valor);
                break;
            case "Converter de Fahrenheit a Kelvin":
                convert.fahrenheitToKelvin(valor);
                break;
            case "Converter de Fahrenheit a Celsius":
                convert.fahrenheitToCelsius(valor);
                break;
            case "Converter de Kelvin a Celsius":
                convert.kelvinToCelsius(valor);
                break;
            case "Converter de Kelvin a Fahrenheit":
                convert.kelvinToFahrenheit(valor);
                break;
        }

    }
}

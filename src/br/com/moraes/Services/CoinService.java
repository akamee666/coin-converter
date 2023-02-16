package br.com.moraes.Services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CoinService {
    //define a url da api
    static String webService = "https://economia.awesomeapi.com.br/json/";
    //codigo de sucesso na chamada
    static int sucesso = 200;

    public static void buscaCoin(String coin) throws Exception {
        String urlParaChamada = webService + coin;

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            if(con.getResponseCode() != sucesso) {
                throw new RuntimeException("Http error code" + con.getResponseCode());
            }

            InputStreamReader inputStreamReader =  new InputStreamReader(con.getInputStream());
            BufferedReader resposta = new BufferedReader(inputStreamReader);

            String co = "";
            System.out.println(co);
            List<String> jsonCoin = new ArrayList<String>();

            while((co = resposta.readLine())!= null) {
                jsonCoin.add(co);
            }

            String singleString = jsonCoin.toString().replaceAll("[\\[\\]]", "");

            System.out.println(singleString);
            
            
        } catch(Exception e ) {
            throw new Exception(e.getMessage());
        }       
    }

    public static void main(String[] args) throws Exception {
        buscaCoin("EUR-BRL");
    }

}



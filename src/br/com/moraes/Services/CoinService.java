package br.com.moraes.Services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import br.com.moraes.Models.Coin;


/**
 * Essa classe é a responsavel por buscar o valor da moeda selecionada consumindo uma API.
 * 
 * é definido 2 atributos estaticos,um contendo o url e outro definindo o codigo caso haja sucesso na operaçao.
 * depois disso temos o metodo buscaCoin,que recebe como parametro o nome da moeda,assim, adicionando ao url para fazer a chamada da moeda correta.
 * 
 * Dentro do try acontece uma instacia tipo url e abrimos uma conexao usando HttpURLConnection(con), depois é preciso um if para fazer a verificaçao com o codigo e saber se a conexao foi estabelecida,caso nao for, é lançada uma RunTimeException.
 * 
 * Usando o inputStream para ser possivel ler os dados que recebemos da API e poder trata-los da maneira desejada, é criada uma instancia de BufferedReader passando o inputStream que recebemos como parametro.
 * 
 * Iniciamos uma String chamada 'co' vazia,para logo apos atribuirmos os dados a ela.
 * È iniciado tambem um ArrayList que recebe apenas Strings para que caso tenha mais de uma linha de dados,podemos adicionar e ler todas as linhas que recebemos.
 * 
 * Após isso tem um while,onde tem duas condiçoes,primeiro eh definir a String vazia como o valor que recebemos do bufferedReader,readLine() e caso nao seja null,ou seja, é uma verificaçao para saber se realmente existe uma outra linha, entramos no laço e adicionamos o valor que foi atribuido a variavel 'co' dentro do ArrayList de Strings.
 * 
 * depois é feito um casting usando replaceALL para retirar os '[]' e podermos usarmos todos os dados do array com o tipo String.
 */

public class CoinService {
    static String webService = "https://economia.awesomeapi.com.br/json/";
    static int sucesso = 200;

    public Coin buscaCoin(String coin) throws Exception {
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

            Coin resultCoin = new Gson().fromJson(singleString, Coin.class);

            Coin valueCoin = new Coin(resultCoin.getName(),resultCoin.getBid());

            System.out.println(valueCoin);
            
            return valueCoin;
        } catch(Exception e ) {
            throw new Exception(e.getMessage());
        }       
    }

    public static void main(String[] args) throws Exception {
        CoinService coinService = new CoinService();
        coinService.buscaCoin("USD-BRL"); //so preciso inverter 

    }

}



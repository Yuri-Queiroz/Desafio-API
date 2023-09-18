package client;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.enableLoggingOfRequestAndResponseIfValidationFails;

public abstract class BaseClient {

    public static void configuracoesIniciais(){
        baseURI = "http://vemser-dbc.dbccompany.com.br:39000/vemser/dbc-pessoa-api/";
        enableLoggingOfRequestAndResponseIfValidationFails();
    }
}

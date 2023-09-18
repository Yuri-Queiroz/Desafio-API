package client;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.Login;

import static io.restassured.RestAssured.given;

public class LoginClient extends BaseClient{

    private static String LOGIN = "/auth";

    public LoginClient(){
        BaseClient.configuracoesIniciais();
    }

    public Response logar(Login login){

        return
                given()
                        .contentType(ContentType.JSON)
                        .body(login)
                        .when()
                        .post(LOGIN)
                ;
    }
}

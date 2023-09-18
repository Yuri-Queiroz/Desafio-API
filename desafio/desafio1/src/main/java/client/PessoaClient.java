package client;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import model.Pessoa;
import util.Logar;

import static io.restassured.RestAssured.given;

public class PessoaClient extends BaseClient{

    private static String token = Logar.token();
    private static String PESSOA = "/pessoa";

    public PessoaClient(){
        BaseClient.configuracoesIniciais();
    }

    public Response cadastrarPessoa(Pessoa pessoa){
        return
                given()
                        .header("Authorization", token)
                        .contentType(ContentType.JSON)
                        .log().all()
                        .body(pessoa)
                        .when()
                        .post(PESSOA)
                ;
    }
}

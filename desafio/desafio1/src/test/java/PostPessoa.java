import client.PessoaClient;
import dataFactory.PessoaDataFactory;
import model.Pessoa;
import model.PessoaResponse;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PostPessoa {

    private PessoaClient pessoaClient = new PessoaClient();

    @Test
    public void testCadastrarPessoaComSucesso(){

        Pessoa pessoa = PessoaDataFactory.pessoaValida();

        Pessoa pessoaResponse = pessoaClient.cadastrarPessoa(pessoa)
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Pessoa.class)
                ;

        Assertions.assertEquals(pessoa.getNome(), pessoaResponse.getNome());
    }

    @Test
    public void testCadastrarPessoaComNomeVazio(){

        Pessoa pessoa = PessoaDataFactory.pessoaValida();
        pessoa.setNome(" ");

        PessoaResponse pessoaResponse = pessoaClient.cadastrarPessoa(pessoa)
                .then()
                .log().all()
                .statusCode(HttpStatus.SC_BAD_REQUEST)
                .extract()
                .as(PessoaResponse.class)
                ;

        Assertions.assertEquals( "nome: must not be blank", pessoaResponse.getErrors());
    }
}

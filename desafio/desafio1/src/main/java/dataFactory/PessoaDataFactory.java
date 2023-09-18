package dataFactory;

import model.Pessoa;
import net.datafaker.Faker;

import java.util.Locale;

public class PessoaDataFactory {

    private static Faker faker = new Faker(new Locale("PT-BR"));

    public static Pessoa pessoaValida(){
        return novaPessoa();
    }

    private static Pessoa novaPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(faker.name().nameWithMiddle());
        pessoa.setEmail(faker.internet().emailAddress());
        pessoa.setCpf("12345678912");
        pessoa.setDataNascimento("1996-10-08");

        return pessoa;
    }
}

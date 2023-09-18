package util;

import client.LoginClient;
import model.Login;

public class Logar {

    private static final LoginClient loginCLient = new LoginClient();

    public static String token(){

        Login loginAdm = new Login(
                Manipulation.getProp().getProperty("login"),
                Manipulation.getProp().getProperty("senha")
        );

        return loginCLient.logar(loginAdm)
                .then()
                .extract().asString()
                ;
    }
}

package br.com.dbccompany.factory.data;

import br.com.dbccompany.dto.LoginDto;
import br.com.dbccompany.util.DataFakerGeneretor;

public class LoginData {

    DataFakerGeneretor dataFakerGeneretor = new DataFakerGeneretor();

    public LoginDto loginDadosValidos() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("vs7843@gmail.com");
        loginDto.setSenha("123456789");

        return loginDto;
    }

    public LoginDto loginEmailInvalido() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("emailinvalido@@..");
        loginDto.setSenha(dataFakerGeneretor.senhaFaker());

        return loginDto;
    }

    public LoginDto loginSenhaInvalida() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("vs7843@gmail.com");
        loginDto.setSenha("12");

        return loginDto;
    }

    public LoginDto loginUsuarioSemEndereco() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("vs7843@gmail.com");
        loginDto.setSenha("123456789");

        return loginDto;
    }

    public LoginDto loginUsuarioComEndereco() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail("estudio.rustico21@gmail.com");
        loginDto.setSenha("123456");

        return loginDto;
    }

    public LoginDto loginDadosDinamicos() {
        LoginDto loginDto = new LoginDto();
        loginDto.setEmail(dataFakerGeneretor.emailFaker());
        loginDto.setSenha(dataFakerGeneretor.senhaFaker());

        return loginDto;
    }

}

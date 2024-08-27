package br.com.dbccompany.factory.data;

import br.com.dbccompany.dto.ForgotPasswordDto;
import br.com.dbccompany.util.DataFakerGeneretor;

public class ForgotPasswordData {
    DataFakerGeneretor dataFakerGeneretor = new DataFakerGeneretor();

    public ForgotPasswordDto forgotPasswordEmailValido() {
        ForgotPasswordDto forgotPasswordDto = new ForgotPasswordDto();
        forgotPasswordDto.setEmailAdress("vs7843@gmail.com");

        return forgotPasswordDto;
    }

    public ForgotPasswordDto forgotPasswordEmailInvalido() {
        ForgotPasswordDto forgotPasswordDto = new ForgotPasswordDto();
        forgotPasswordDto.setEmailAdress("vs7843@gmail.comAh5aP1");

        return forgotPasswordDto;
    }

    public ForgotPasswordDto forgotPasswordEmailNaoCadastrado() {
        ForgotPasswordDto forgotPasswordDto = new ForgotPasswordDto();
        forgotPasswordDto.setEmailAdress(dataFakerGeneretor.emailFaker());

        return forgotPasswordDto;
    }

    public ForgotPasswordDto forgotPasswordEmailEmBranco() {
        ForgotPasswordDto forgotPasswordDto = new ForgotPasswordDto();
        forgotPasswordDto.setEmailAdress("");

        return forgotPasswordDto;
    }
}

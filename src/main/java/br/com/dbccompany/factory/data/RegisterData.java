package br.com.dbccompany.factory.data;

import br.com.dbccompany.dto.RegisterDto;
import br.com.dbccompany.util.DataFakerGeneretor;

public class RegisterData {

    DataFakerGeneretor dataFakerGeneretor = new DataFakerGeneretor();

    public RegisterDto registroDadosValidos() {
        RegisterDto registerDto = new RegisterDto();
        registerDto.setEmail(dataFakerGeneretor.emailFaker());
        registerDto.setTitle("Mr.");
        registerDto.setFirstName(dataFakerGeneretor.firstNameFaker());
        registerDto.setLastName(dataFakerGeneretor.lastNameFaker());
        registerDto.setPassword(dataFakerGeneretor.senhaFaker());
        registerDto.setDayOfBirth("1  ");
        registerDto.setMonthOfBirth("January ");
        registerDto.setYearOfBirth("2001  ");
        registerDto.setSignUpNewsletter(false);

        return registerDto;
    }

    public RegisterDto registroEmailInvalido() {
        RegisterDto registerDto = new RegisterDto();
        registerDto.setEmail("emailinvalido@@..");

        return registerDto;
    }

    public RegisterDto registroSenhaInvalida() {
        RegisterDto registerDto = new RegisterDto();
        registerDto.setEmail(dataFakerGeneretor.emailFaker());
        registerDto.setTitle("Mr.");
        registerDto.setFirstName(dataFakerGeneretor.firstNameFaker());
        registerDto.setLastName(dataFakerGeneretor.lastNameFaker());
        registerDto.setPassword("12");
        registerDto.setDayOfBirth("1  ");
        registerDto.setMonthOfBirth("January ");
        registerDto.setYearOfBirth("2001  ");
        registerDto.setSignUpNewsletter(false);

        return registerDto;
    }

    public RegisterDto registroEmailExistente() {
        RegisterDto registerDto = new RegisterDto();
        registerDto.setEmail("vs7843@gmail.com");

        return registerDto;
    }

}

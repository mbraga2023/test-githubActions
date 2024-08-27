package br.com.dbccompany.factory.data;

import br.com.dbccompany.dto.ContactUsDto;
import br.com.dbccompany.util.DataFakerGeneretor;
import com.github.javafaker.Faker;

import java.io.File;

public class ContactUsData {

    DataFakerGeneretor dataFakerGeneretor = new DataFakerGeneretor();
    Faker faker = new Faker();

    public ContactUsDto ContactUsDadosValidos() {
        ContactUsDto contactUsDto = new ContactUsDto();
        contactUsDto.setEmailAddress(dataFakerGeneretor.emailFaker());
        contactUsDto.setOrderReference("Marketing");
        String filePath = new File("src/main/resources/Arquivo.txt").getAbsolutePath();
        contactUsDto.setFile(new File(filePath));
        contactUsDto.setMessage(faker.lorem().toString());
        return contactUsDto;
    }

    public ContactUsDto ContactUsComEmailInvalido() {
        ContactUsDto contactUsDto = new ContactUsDto();
        contactUsDto.setEmailAddress("XX.com");
        contactUsDto.setOrderReference("Marketing");
        String filePath = new File("src/main/resources/Arquivo.txt").getAbsolutePath();
        contactUsDto.setFile(new File(filePath));
        contactUsDto.setMessage(faker.lorem().toString());
        return contactUsDto;
    }

    public ContactUsDto ContactUsComMensagemVazia() {
        ContactUsDto contactUsDto = new ContactUsDto();
        contactUsDto.setEmailAddress(dataFakerGeneretor.emailFaker());
        contactUsDto.setOrderReference("Marketing");
        String filePath = new File("src/main/resources/Arquivo.txt").getAbsolutePath();
        contactUsDto.setFile(new File(filePath));
        contactUsDto.setMessage("");
        return contactUsDto;
    }

    public ContactUsDto ContactUsComOrderReferenceVazio() {
        ContactUsDto contactUsDto = new ContactUsDto();
        contactUsDto.setEmailAddress(dataFakerGeneretor.emailFaker());
        contactUsDto.setOrderReference("");
        String filePath = new File("src/main/resources/Arquivo.txt").getAbsolutePath();
        contactUsDto.setFile(new File(filePath));
        contactUsDto.setMessage(faker.lorem().toString());
        return contactUsDto;
    }

    public ContactUsDto ContactUsSemArquivoAnexado() {
        ContactUsDto contactUsDto = new ContactUsDto();
        contactUsDto.setEmailAddress(dataFakerGeneretor.emailFaker());
        contactUsDto.setOrderReference("Marketing");
        String filePath = new File("").getAbsolutePath();
        contactUsDto.setFile(new File(""));
        contactUsDto.setMessage(faker.lorem().toString());
        return contactUsDto;
    }
}

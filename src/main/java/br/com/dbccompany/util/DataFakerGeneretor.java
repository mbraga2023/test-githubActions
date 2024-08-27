package br.com.dbccompany.util;

import com.github.javafaker.Faker;

public class DataFakerGeneretor {

    private static final Faker faker = new Faker();

    public String firstNameFaker() {
        return faker.name().firstName();
    }

    public String lastNameFaker() {
        return faker.name().lastName();
    }

    public String emailFaker() {
        return faker.internet().emailAddress();
    }

    public String senhaFaker() {
        return faker.internet().password(5, 10);
    }


}

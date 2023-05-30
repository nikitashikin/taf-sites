package by.itacademy.shikinnikita.taf.sites;

import com.github.javafaker.Faker;

public class Util {
    static Faker faker = new Faker();

    public static String generateEmail() {
        String email = faker.internet().emailAddress();
        return email;
    }

    public static String generatePassword() {
        String password = faker.internet().password();
        return password;
    }
}
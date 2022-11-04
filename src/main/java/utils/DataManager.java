package utils;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

import java.util.Date;
import java.util.Locale;

public class DataManager {


    static DataManager instance = null;

    public static DataManager getInstance() {

        if (instance == null) {
            instance = new DataManager();
        }
        return instance;

    }
    Faker faker = new Faker();

    public String getRandomFullName() {
        return this.faker.name().fullName();
    }

    public String getRandomName() {
        return this.faker.name().firstName();
    }

    public String getRandomLastName() {
        return this.faker.name().lastName();
    }

    public String getRandomFullAddress() {
        return this.faker.address().fullAddress();
    }

    public String getRandomCity() {
        return this.faker.address().cityName();
    }

    public String getRandomZipCode() {
        return this.faker.address().zipCode().toLowerCase(Locale.ROOT);
    }

    public String getRandomEmail() {
        return this.faker.internet().emailAddress();
    }

    public String getRandomJobTitle() {
        return this.faker.job().title();
    }

    public String getRandomJobPosition() {
        return this.faker.job().position();
    }

    public String getRandomPassword(int min, int max) {
        return this.faker.internet().password(min, max);
    }

    public String getRandomNumber(int size) {
        return this.faker.number().digits(size);
    }

    public long getRandomRangeNumber(long min, long max) {
        return this.faker.number().numberBetween(min, max);
    }

    public String getCreditCard() {
        return this.faker.finance().creditCard();
    }

    public String getRandomCreditCardMastercard() {
        return this.faker.finance().creditCard(CreditCardType.MASTERCARD);
    }

    public String getRandomCreditCardVisa() {
        return this.faker.finance().creditCard(CreditCardType.VISA);
    }

    public Date getRandomDateBetween(Date min, Date max) {
        return this.faker.date().between(min, max);
    }

    public String getRandomText(int size) {
        return this.faker.lorem().characters(size);
    }

    public String getRandomCompanyName() {
        return this.faker.company().name();
    }
}







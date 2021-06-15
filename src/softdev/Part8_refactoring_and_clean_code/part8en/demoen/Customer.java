package softdev.Part8_refactoring_and_clean_code.part8en.demoen;

import java.util.Date;

public class Customer {
    private final String name;
    private final Date birthday;
    private final String street;
    private final String city;

    public Customer(String name, Date birthday, String street, String city) {
        this.name = name;
        this.birthday = birthday;
        this.street = street;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}

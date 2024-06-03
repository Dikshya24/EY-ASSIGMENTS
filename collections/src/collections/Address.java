package collections;

import java.util.Objects;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        Address address = (Address) obj;
        return street.equals(address.street) && city.equals(address.city) && state.equals(address.state) && zip.equals(address.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, state, zip);
    }
}

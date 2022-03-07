package Beginner.OOP.hw1;

public class Address {



    private int index;
    private String country;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public Address(int index, String country, String city, String street, String house, String apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }


    @Override
    public String toString() {
        return "Your address: " + '\n'+
                "Index - " + index +'\n'+
                "Country - " + country + '\n' +
                "City - " + city + '\n' +
                "Street - " + street + '\n' +
                "House - " + house + '\n' +
                "Apartment - " + apartment;
    }
}

package academy.devdojo.maratonajava.javacore.Hinheritance.domain;

public class Person {
    protected String name;
    protected String socialSecurityNumber;
    protected Address address;

    public Person(String name, String socialSecurityNumber, Address address) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.address = address;
    }

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Social Security Number: " + this.socialSecurityNumber);
        if (this.address != null) {
            System.out.println("Address: " + this.address.getStreet());
            System.out.println("Zipcode: " + this.address.getZipcode());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

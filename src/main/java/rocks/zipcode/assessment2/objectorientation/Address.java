package rocks.zipcode.assessment2.objectorientation;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 28/11/2018.
 */
public class Address {
    String addressLine1 = "";
    String addressLine2 = "";
    String city = "";
    String state = "";
    String zipcode = "";

    public Address() {

    }

    /**
     * @param addressLine1 - first address line
     * @param addressLine2 - second address line
     * @param city - city of location
     * @param state - state of city
     * @param zipcode - zipcode of region
     */
    public Address(String addressLine1, String addressLine2, String city, String state, String zipcode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String toString (){

       return "Address{addressLine1=" +"'" +getAddressLine1() + "',"+ " " + "addressLine2=" + "'" +getAddressLine2() +"'," + " " + "city="+"'" + getCity() + "'," + " " +"state=" + "'" + getState() + "'," + " " +"zipcode=" + "'" + getZipcode() + "'" + "}";
    }
    //Correct this
    @Override
    public boolean equals(Object o) {
       if(  Comparator.comparing(Address::getAddressLine1).thenComparing(Address::getAddressLine2).thenComparing(Address::getCity).thenComparing(Address:: getState).thenComparing(Address::getZipcode).compare((Address) o,this)  == 0){return true;}
    return false;
    }

}

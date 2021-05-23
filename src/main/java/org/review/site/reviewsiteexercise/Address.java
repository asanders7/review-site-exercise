package org.review.site.reviewsiteexercise;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Collection;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private String addressLine1;
    private String addressLine2;
    private String aptNum;
    private String city;
    private String state;
    private String zip;
    private String zipPlus4;
    private String county;
    private String country;
    protected Address(){}


    public Address(String addressLine1, String addressLine2, String aptNum, String city, String state, String zip, String zipPlus4, String county, String country) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.aptNum = aptNum;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.zipPlus4 = zipPlus4;
        this.county = county;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAptNum() {
        return aptNum;
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

    public String getZipPlus4() {
        return zipPlus4;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }


}

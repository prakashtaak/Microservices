package com.store.customer.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;


@Embeddable
public class Address {

    @Column
    @NotNull(message = "error.address.string")
    private String addressString;

    @Column
    @NotNull(message = "error.city")
    private String city;

    @Column
    @NotNull(message = "error.pincode")
    private Long pinCode;

    @Column
    @NotNull(message = "error.state")
    private String state;

    @Column
    @NotNull(message = "error.country")
    private String countryName;

    @Column
    @NotNull(message="error.phoneNumber")
    private Long phoneNumber;


    public Address() {
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddressString() {
        return addressString;
    }

    public void setAddressString(String addressString) {
        this.addressString = addressString;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPinCode() {
        return pinCode;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}

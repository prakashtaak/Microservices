package com.store.customer.entitties;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
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
    private String State;

    @Column
    @NotNull(message = "error.country")
    private String country;

    public Address() {
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
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        country = country;
    }
}

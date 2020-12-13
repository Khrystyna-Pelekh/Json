package com.json;

public class Company {
    private String address;
    private String state;
    private String phone;

    public Company() {
    }

    public Company(String address, String state, String phone) {
        this.address = address;
        this.state = state;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Company [address = " + address
                + ", state = " + state
                + ", phone = " + phone + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return (obj.getClass()).equals(Company.class) &&
                address.equals(((Company) obj).address) &&
                state.equals(((Company) obj).state) &&
                phone.equals(((Company) obj).phone);
    }
}

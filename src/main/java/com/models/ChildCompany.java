package com.models;

public class ChildCompany {

    private String address;
    private String phone;
    private String state;

    public ChildCompany() {
    }

    public ChildCompany(String address, String phone, String state) {
        this.address = address;
        this.phone = phone;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChildCompany that = (ChildCompany) o;

        if (!address.equals(that.address)) return false;
        if (!phone.equals(that.phone)) return false;
        return state.equals(that.state);
    }

    @Override
    public String toString() {
        return "ChildCompany{" +
                "address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

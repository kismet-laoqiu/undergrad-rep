package com.example.demo.entity;

public class Person_information {
    private String identification;
    private double total_amount;
    private double loan_amount;
    private Integer servicenum;

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public double getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(double loan_amount) {
        this.loan_amount = loan_amount;
    }

    public Integer getServicenum() {
        return servicenum;
    }

    public void setServicenum(Integer servicenum) {
        this.servicenum = servicenum;
    }
}

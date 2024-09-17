package com.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Insurer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int insurerId;

    private String policyName;

    private String policyInsurer;

    private double premium;

    public Insurer() {

    }

    public Insurer(int insurerId, String policyName, String policyInsurer, double premium) {
        this.insurerId = insurerId;
        this.policyName = policyName;
        this.policyInsurer = policyInsurer;
        this.premium = premium;
    }

    public int getInsurerId() {
        return insurerId;
    }

    public void setInsurerId(int insurerId) {
        this.insurerId = insurerId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyInsurer() {
        return policyInsurer;
    }

    public void setPolicyInsurer(String policyInsurer) {
        this.policyInsurer = policyInsurer;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }
}

package com.test.exception;

public class InsurancePolicyRejected extends RuntimeException {
    public InsurancePolicyRejected(String message) {
        super(message);
    }
}

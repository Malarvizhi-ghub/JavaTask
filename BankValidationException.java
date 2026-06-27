package com.wipro.bank.exception;

public class BankValidationException extends Exception {

    public String message;

    public BankValidationException() {
        message = "Invalid Data";
    }

    @Override
    public String toString() {
        return message;
    }
}
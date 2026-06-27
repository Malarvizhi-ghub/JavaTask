package com.wipro.bank.main;

import java.util.Scanner;
import com.wipro.bank.service.BankService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tenure;
        float principal;
        int age;
        String gender;

        System.out.println("Enter Tenure (5 or 10 Years): ");
        tenure = sc.nextInt();

        System.out.println("Enter Principal Amount: ");
        principal = sc.nextFloat();

        System.out.println("Enter Age: ");
        age = sc.nextInt();

        System.out.println("Enter Gender (Male/Female): ");
        gender = sc.next();

        BankService service = new BankService();

        service.calculate(principal, tenure, age, gender);

        sc.close();
    }
}
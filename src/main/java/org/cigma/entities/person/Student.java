package org.cigma.entities.person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student extends Person {
    private String identifier;
    private String email;

    public String getIdentifier() {
        return identifier;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String phoneNumber;

    public Student(String firstName, String lastName,
                   Integer age, Gender gender, String cin, String email,
                   String phoneNumber) {
        super(firstName, lastName, age, gender, cin);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.cin = cin;
    }


    @Override
    public String identifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(String code) {
        this.identifier = code;
    }


    @Override
    public String toString() {
        return "Student{" +
                "identifier='" + identifier + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static boolean isEmailAdress(String email) {
        String emailRegex = "^[A - Za - z]*@[A - Za - z]*.[A - Za - z]{\n" +
                "            2, 3\n" +
                "        } ";
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email.toUpperCase());
        return m.matches();
    }

    public static boolean isname(String email) {
        String nameRegex = "^[A - Za - z]";
        Pattern p = Pattern.compile(nameRegex);
        Matcher m = p.matcher(email.toUpperCase());
        return m.matches();
    }

    public static boolean isphone(String email) {
        String phoneRegex = "+212"+"^[0-9]{10}";
        Pattern p = Pattern.compile(phoneRegex);
        Matcher m = p.matcher(email.toUpperCase());
        return m.matches();
    }

}

package ru.itis.inform.gwt.models;

/**
 * Created by Galiullin_ko on 10/04/16.
 */
public class User {
    private int userId;
    private String name;
    private String surname;
    private String patronymic;
    private String seriesOfThePassport;
    private String numberOfThePassport;
    private String phoneNumber;
    private String email;

    public User(int userId, String name, String surname, String patronymic, String seriesOfThePassport, String numberOfThePassport, String phoneNumber, String email) {
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.seriesOfThePassport = seriesOfThePassport;
        this.numberOfThePassport = numberOfThePassport;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getSeriesOfThePassport() {
        return seriesOfThePassport;
    }

    public void setSeriesOfThePassport(String seriesOfThePassport) {
        this.seriesOfThePassport = seriesOfThePassport;
    }

    public String getNumberOfThePassport() {
        return numberOfThePassport;
    }

    public void setNumberOfThePassport(String numberOfThePassport) {
        this.numberOfThePassport = numberOfThePassport;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", seriesOfThePassport='" + seriesOfThePassport + '\'' +
                ", numberOfThePassport='" + numberOfThePassport + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

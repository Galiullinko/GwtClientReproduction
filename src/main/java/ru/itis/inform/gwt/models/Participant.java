package ru.itis.inform.gwt.models;

/**
 * Created by Galiullin_ko on 09/04/16.
 */
public class Participant {
    private int participantId;
    private int userId;
    private boolean isIE;
    private String nameOfEntity;
    private String idOfTaxpayer;
    private String location;
    private String mainStateRegistrationNumber;
    private String nameOfIE; //IE - индивидуальный предприниматель
    private String surnameOfIE;
    private String patronymicOfIE;

    public Participant(int participantId, int userId, boolean isIE, String nameOfEntity, String idOfTaxpayer, String location, String mainStateRegistrationNumber, String nameOfIE, String surnameOfIE, String patronymicOfIE) {
        this.participantId = participantId;
        this.userId = userId;
        this.isIE = isIE;
        this.nameOfEntity = nameOfEntity;
        this.idOfTaxpayer = idOfTaxpayer;
        this.location = location;
        this.mainStateRegistrationNumber = mainStateRegistrationNumber;
        this.nameOfIE = nameOfIE;
        this.surnameOfIE = surnameOfIE;
        this.patronymicOfIE = patronymicOfIE;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public String getNameOfEntity() {
        return nameOfEntity;
    }

    public void setNameOfEntity(String nameOfEntity) {
        this.nameOfEntity = nameOfEntity;
    }

    public String getIdOfTaxpayer() {
        return idOfTaxpayer;
    }

    public void setIdOfTaxpayer(String idOfTaxpayer) {
        this.idOfTaxpayer = idOfTaxpayer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMainStateRegistrationNumber() {
        return mainStateRegistrationNumber;
    }

    public void setMainStateRegistrationNumber(String mainStateRegistrationNumber) {
        this.mainStateRegistrationNumber = mainStateRegistrationNumber;
    }

    public String getNameOfIE() {
        return nameOfIE;
    }

    public void setNameOfIE(String nameOfIE) {
        this.nameOfIE = nameOfIE;
    }

    public String getSurnameOfIE() {
        return surnameOfIE;
    }

    public void setSurnameOfIE(String surnameOfIE) {
        this.surnameOfIE = surnameOfIE;
    }

    public String getPatronymicOfIE() {
        return patronymicOfIE;
    }

    public void setPatronymicOfIE(String patronymicOfIE) {
        this.patronymicOfIE = patronymicOfIE;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int user) {
        this.userId = user;
    }

    public boolean isIE() {
        return isIE;
    }

    public void setIE(boolean IE) {
        isIE = IE;
    }


    @Override
    public String toString() {
        if (isIE) {
            return "Participant{" +
                    "NameOfIE='" + nameOfIE + '\'' +
                    ", surnameOfIE='" + surnameOfIE + '\'' +
                    ", patronymicOfIE='" + patronymicOfIE + '\'' +
                    ", idOfTaxpayer='" + idOfTaxpayer + '\'' +
                    ", location='" + location + '\'' +
                    '}';
        } else {
            return "Participant{" +
                    "nameOfEntity='" + nameOfEntity + '\'' +
                    ", idOfTaxpayer='" + idOfTaxpayer + '\'' +
                    ", location='" + location + '\'' +
                    ", mainStateRegistrationNumber='" + mainStateRegistrationNumber + '\'' +
                    '}';
        }
    }
}

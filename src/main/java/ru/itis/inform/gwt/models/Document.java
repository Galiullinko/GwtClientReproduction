package ru.itis.inform.gwt.models;

import java.util.Date;

/**
 * Created by Galiullin_ko on 07/04/16.
 */
public class Document {

    private int documentId;
    private int participantId;
    private int yearOfWorks;
    private String goal;
    private Date dateOfEndOfTheWork;
    private String stateOfCreature;
    private String typeOfCreature;
    private int numberOfCreatures;
    private String nameOfWorkLocation;
    private int averegePieceOfWaterResources;
    private int weightOfCreatures;
    private String sourceOfResources;
    private Date dateOfFillingTheDocument;

    public Document(int documentId, int participantId, int yearOfWorks, String goal, Date dateOfEndOfTheWork, String stateOfCreature, String typeOfCreature, int numberOfCreatures, String nameOfWorkLocation, int averegePieceOfWaterResources, int weightOfCreatures, String sourceOfResources, Date dateOfFillingTheDocument) {
        this.documentId = documentId;
        this.participantId = participantId;
        this.yearOfWorks = yearOfWorks;
        this.goal = goal;
        this.dateOfEndOfTheWork = dateOfEndOfTheWork;
        this.stateOfCreature = stateOfCreature;
        this.typeOfCreature = typeOfCreature;
        this.numberOfCreatures = numberOfCreatures;
        this.nameOfWorkLocation = nameOfWorkLocation;
        this.averegePieceOfWaterResources = averegePieceOfWaterResources;
        this.weightOfCreatures = weightOfCreatures;
        this.sourceOfResources = sourceOfResources;
        this.dateOfFillingTheDocument = dateOfFillingTheDocument;
    }

    public int getYearOfWorks() {
        return yearOfWorks;
    }

    public void setYearOfWorks(int yearOfWorks) {
        this.yearOfWorks = yearOfWorks;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public Date getDateOfEndOfTheWork() {
        return dateOfEndOfTheWork;
    }

    public void setDateOfEndOfTheWork(Date dateOfEndOfTheWork) {
        this.dateOfEndOfTheWork = dateOfEndOfTheWork;
    }

    public String getStateOfCreature() {
        return stateOfCreature;
    }

    public void setStateOfCreature(String stateOfCreature) {
        this.stateOfCreature = stateOfCreature;
    }

    public String getTypeOfCreature() {
        return typeOfCreature;
    }

    public void setTypeOfCreature(String typeOfCreature) {
        this.typeOfCreature = typeOfCreature;
    }

    public int getNumberOfCreatures() {
        return numberOfCreatures;
    }

    public void setNumberOfCreatures(int numberOfCreatures) {
        this.numberOfCreatures = numberOfCreatures;
    }

    public String getNameOfWorkLocation() {
        return nameOfWorkLocation;
    }

    public void setNameOfWorkLocation(String nameOfWorkLocation) {
        this.nameOfWorkLocation = nameOfWorkLocation;
    }

    public int getAveregePieceOfWaterResources() {
        return averegePieceOfWaterResources;
    }

    public void setAveregePieceOfWaterResources(int averegePieceOfWaterResources) {
        this.averegePieceOfWaterResources = averegePieceOfWaterResources;
    }

    public int getWeightOfCreatures() {
        return weightOfCreatures;
    }

    public void setWeightOfCreatures(int weightOfCreatures) {
        this.weightOfCreatures = weightOfCreatures;
    }

    public String getSourceOfResources() {
        return sourceOfResources;
    }

    public void setSourceOfResources(String sourceOfResources) {
        this.sourceOfResources = sourceOfResources;
    }

    public Date getDateOfFillingTheDocument() {
        return dateOfFillingTheDocument;
    }

    public void setDateOfFillingTheDocument(Date dateOfFillingTheDocument) {
        this.dateOfFillingTheDocument = dateOfFillingTheDocument;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int document_id) {
        this.documentId = document_id;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participant) {
        this.participantId = participant;
    }

    @Override
    public String toString() {
        return "Document{" +
                "document_id=" + documentId +
                ", participant_id=" + participantId +
                ", yearOfWorks=" + yearOfWorks +
                ", goal=" + goal +
                ", dateOfEndOfTheWork=" + dateOfEndOfTheWork +
                ", stateOfCreature='" + stateOfCreature + '\'' +
                ", typeOfCreature='" + typeOfCreature + '\'' +
                ", numberOfCreatures=" + numberOfCreatures +
                ", nameOfWorkLocation='" + nameOfWorkLocation + '\'' +
                ", averegePieceOfWaterResources=" + averegePieceOfWaterResources +
                ", weightOfCreatures=" + weightOfCreatures +
                ", sourceOfResources='" + sourceOfResources + '\'' +
                ", dateOfFillingTheDocument=" + dateOfFillingTheDocument +
                '}';
    }
}

package com.model.dto;

import java.sql.Date;

public class MemDTO implements java.io.Serializable {

    private String memberCode;
    private String memberName;
    private String memberGender;
    private String birthDate;
    private String divisionCode;
    private String memberAddress;
    private String contact;
    private String gradeCode;
    private String activeStatus;

    public MemDTO(){

    }

//    public MemDTO(String memberCode, String memberName, String memGender, String birthDate, String divisionCode, String memberAddress, String concat, String gradeCode, String activeStatus) {
//        this.memberCode = memberCode;
//        this.memberName = memberName;
//        this.memberGender = memGender;
//        this.birthDate = birthDate;
//        this.divisionCode = divisionCode;
//        this.memberAddress = memberAddress;
//        this.contact = contact;
//        this.gradeCode = gradeCode;
//        this.activeStatus = activeStatus;
//    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memGender) {
        this.memberGender = memGender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "MemDTO{" +
                "memberCode='" + memberCode + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberGender='" + memberGender + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", divisionCode='" + divisionCode + '\'' +
                ", memberAddress='" + memberAddress + '\'' +
                ", concat='" + contact + '\'' +
                ", gradeCode='" + gradeCode + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }
}

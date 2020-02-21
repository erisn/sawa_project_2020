package com.sawaproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trainee")
public class Trainee {

	private static final long serialVersionUID = 1701325902333490974L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	@Column(name="firstname")
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;
	private String placeOfBirth;
	private String mobokelAdi;
	private String mebokelAdiZoba;
	private String mebokelAdiSubzoba;
	private String maritalStatus;
	private String education;
	private String profession;
	private String fatherFirstName;
	private String fatherMiddleName;
	private String fatherLastName;
	private String fatherDateOfBirth;
	private String fatherPlaceOfBirth;
	private String motherFirstName;
	private String motherMiddleName;
	private String motherLastName;
	private String motherDateOfBirth;
	private String motherPlaceOfBirth;
	private String zoba;
	private String subZoba;
	private String mimhdar;
	private String registrationDate;
	private String round;
	private String ahadu;
	private String height;
	private String weight;
	private String milkit;

	
	public Trainee() {
	
	}

	public Trainee(String firstName, String middleName, String lastName, String dateOfBirth) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public Trainee(String firstName, String middleName, String lastName, String dateOfBirth, String placeOfBirth,
			String mobokelAdi, String mebokelAdiZoba, String mebokelAdiSubzoba, String maritalStatus, String education,
			String profession, String fatherFirstName, String fatherMiddleName, String fatherLastName,
			String fatherDateOfBirth, String fatherPlaceOfBirth, String motherFirstName, String motherMiddleName,
			String motherLastName, String motherDateOfBirth, String motherPlaceOfBirth, String zoba, String subZoba,
			String mimhdar, String registrationDate, String round, String ahadu, String height, String weight,
			String milkit) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.mobokelAdi = mobokelAdi;
		this.mebokelAdiZoba = mebokelAdiZoba;
		this.mebokelAdiSubzoba = mebokelAdiSubzoba;
		this.maritalStatus = maritalStatus;
		this.education = education;
		this.profession = profession;
		this.fatherFirstName = fatherFirstName;
		this.fatherMiddleName = fatherMiddleName;
		this.fatherLastName = fatherLastName;
		this.fatherDateOfBirth = fatherDateOfBirth;
		this.fatherPlaceOfBirth = fatherPlaceOfBirth;
		this.motherFirstName = motherFirstName;
		this.motherMiddleName = motherMiddleName;
		this.motherLastName = motherLastName;
		this.motherDateOfBirth = motherDateOfBirth;
		this.motherPlaceOfBirth = motherPlaceOfBirth;
		this.zoba = zoba;
		this.subZoba = subZoba;
		this.mimhdar = mimhdar;
		this.registrationDate = registrationDate;
		this.round = round;
		this.ahadu = ahadu;
		this.height = height;
		this.weight = weight;
		this.milkit = milkit;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getMobokelAdi() {
		return mobokelAdi;
	}

	public void setMobokelAdi(String mobokelAdi) {
		this.mobokelAdi = mobokelAdi;
	}

	public String getMebokelAdiZoba() {
		return mebokelAdiZoba;
	}

	public void setMebokelAdiZoba(String mebokelAdiZoba) {
		this.mebokelAdiZoba = mebokelAdiZoba;
	}

	public String getMebokelAdiSubzoba() {
		return mebokelAdiSubzoba;
	}

	public void setMebokelAdiSubzoba(String mebokelAdiSubzoba) {
		this.mebokelAdiSubzoba = mebokelAdiSubzoba;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getFatherFirstName() {
		return fatherFirstName;
	}

	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}

	public String getFatherMiddleName() {
		return fatherMiddleName;
	}

	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}

	public String getFatherLastName() {
		return fatherLastName;
	}

	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}

	public String getFatherDateOfBirth() {
		return fatherDateOfBirth;
	}

	public void setFatherDateOfBirth(String fatherDateOfBirth) {
		this.fatherDateOfBirth = fatherDateOfBirth;
	}

	public String getFatherPlaceOfBirth() {
		return fatherPlaceOfBirth;
	}

	public void setFatherPlaceOfBirth(String fatherPlaceOfBirth) {
		this.fatherPlaceOfBirth = fatherPlaceOfBirth;
	}

	public String getMotherFirstName() {
		return motherFirstName;
	}

	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}

	public String getMotherMiddleName() {
		return motherMiddleName;
	}

	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}

	public String getMotherLastName() {
		return motherLastName;
	}

	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}

	public String getMotherDateOfBirth() {
		return motherDateOfBirth;
	}

	public void setMotherDateOfBirth(String motherDateOfBirth) {
		this.motherDateOfBirth = motherDateOfBirth;
	}

	public String getMotherPlaceOfBirth() {
		return motherPlaceOfBirth;
	}

	public void setMotherPlaceOfBirth(String motherPlaceOfBirth) {
		this.motherPlaceOfBirth = motherPlaceOfBirth;
	}

	public String getZoba() {
		return zoba;
	}

	public void setZoba(String zoba) {
		this.zoba = zoba;
	}

	public String getSubZoba() {
		return subZoba;
	}

	public void setSubZoba(String subZoba) {
		this.subZoba = subZoba;
	}

	public String getMimhdar() {
		return mimhdar;
	}

	public void setMimhdar(String mimhdar) {
		this.mimhdar = mimhdar;
	}

	public String getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getRound() {
		return round;
	}

	public void setRound(String round) {
		this.round = round;
	}

	public String getAhadu() {
		return ahadu;
	}

	public void setAhadu(String ahadu) {
		this.ahadu = ahadu;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getMilkit() {
		return milkit;
	}

	public void setMilkit(String milkit) {
		this.milkit = milkit;
	}

	
	@Override
	public String toString() {
		return "Trainee [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", placeOfBirth=" + placeOfBirth + ", mobokelAdi=" + mobokelAdi
				+ ", mebokelAdiZoba=" + mebokelAdiZoba + ", mebokelAdiSubzoba=" + mebokelAdiSubzoba + ", maritalStatus="
				+ maritalStatus + ", education=" + education + ", profession=" + profession + ", fatherFirstName="
				+ fatherFirstName + ", fatherMiddleName=" + fatherMiddleName + ", fatherLastName=" + fatherLastName
				+ ", fatherDateOfBirth=" + fatherDateOfBirth + ", fatherPlaceOfBirth=" + fatherPlaceOfBirth
				+ ", motherFirstName=" + motherFirstName + ", motherMiddleName=" + motherMiddleName
				+ ", motherLastName=" + motherLastName + ", motherDateOfBirth=" + motherDateOfBirth
				+ ", motherPlaceOfBirth=" + motherPlaceOfBirth + ", zoba=" + zoba + ", subZoba=" + subZoba
				+ ", mimhdar=" + mimhdar + ", registrationDate=" + registrationDate + ", round=" + round + ", ahadu="
				+ ahadu + ", height=" + height + ", weight=" + weight + ", milkit=" + milkit + "]";
	}

	
	

}

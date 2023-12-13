package com.surveybank.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class SurveyWork {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int survey_Id;
	@Column(length=20)
private String surveyType;
	@Column(length=20)
private String surveyOutput;
	@Column(length=20)
private int surveyPrice;
public int getSurvey_Id() {
	return survey_Id;
}
public void setSurvey_Id(int survey_Id) {
	this.survey_Id = survey_Id;
}
public String getSurveyType() {
	return surveyType;
}
public void setSurveyType(String surveyType) {
	this.surveyType = surveyType;
}
public String getSurveyOutput() {
	return surveyOutput;
}
public void setSurveyOutput(String surveyOutput) {
	this.surveyOutput = surveyOutput;
}
public int getSurveyPrice() {
	return surveyPrice;
}
public void setSurveyPrice(int surveyPrice) {
	this.surveyPrice = surveyPrice;
}
@Override
public String toString() {
	return "SurveyWork [survey_Id=" + survey_Id + ", surveyType=" + surveyType + ", surveyOutput=" + surveyOutput
			+ ", surveyPrice=" + surveyPrice + "]";
}


}

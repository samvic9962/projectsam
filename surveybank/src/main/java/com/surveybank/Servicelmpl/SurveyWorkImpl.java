package com.surveybank.Servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.surveybank.Exception.ResourceNotFoundException;
import com.surveybank.Repository.SurveyWorkRepo;
import com.surveybank.entity.SurveyWork;

public class SurveyWorkImpl {
	@Autowired
	SurveyWorkRepo surveyWorkRepo;
	
	
	public SurveyWork addSurveyWork(SurveyWork surveyWork) {
		return  surveyWorkRepo.save(surveyWork);
	}

	public SurveyWork updateDb(int surveyid,SurveyWork surveyWork) {
		
		
		SurveyWork s1 = surveyWorkRepo.findBySurveyId(surveyid);
		
		if(s1!=null) {   
			s1.setSurveyType(surveyWork.getSurveyType());
			s1.setSurveyOutput(surveyWork.getSurveyOutput());
			s1.setSurveyPrice(surveyWork.getSurveyPrice());

		return surveyWorkRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void delete(int surveyid) {
	
		
		SurveyWork s2 = surveyWorkRepo.findBySurveyId(surveyid);
		
		if(s2!=null) {
			surveyWorkRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}



}

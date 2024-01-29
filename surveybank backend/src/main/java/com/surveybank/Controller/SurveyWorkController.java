package com.surveybank.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.surveybank.Service.SurveyWorkService;
import com.surveybank.entity.SurveyWork;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class SurveyWorkController {
	@Autowired
	SurveyWorkService surveyWorkService;
	@PostMapping("/postsurveyWork")
	public SurveyWork addSurveyWork(@RequestBody SurveyWork surveyWork) {
		
		return surveyWorkService.addSurveyWork(surveyWork);
	}
	
	@PutMapping("/updatesurveyWork")
	public SurveyWork update(@RequestHeader int survey_Id , @RequestBody SurveyWork SurveyWork ) {
		
		return surveyWorkService.updateDb(survey_Id,SurveyWork);
	}
	@DeleteMapping("/deletesurveyWork")
	public String delete(@RequestHeader int survey_Id) {
		surveyWorkService.delete(survey_Id);
		return "data deleted";
	}

	
	

}

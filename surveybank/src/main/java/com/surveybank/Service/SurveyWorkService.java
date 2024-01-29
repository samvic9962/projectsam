package com.surveybank.Service;

import com.surveybank.entity.SurveyWork;

public interface SurveyWorkService {


	SurveyWork addSurveyWork(SurveyWork surveyWork);

	SurveyWork updateDb(int survey_Id,SurveyWork surveyWork);

	void delete(int survey_Id);
}

package com.surveybank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.surveybank.entity.SurveyWork;

@Repository
public interface SurveyWorkRepo extends JpaRepository<SurveyWork, Integer> {

	@Query(value =  "select * from SurveyWork where survey_Id =?" , nativeQuery = true)
	SurveyWork findBySurveyId(int survey_Id);

}

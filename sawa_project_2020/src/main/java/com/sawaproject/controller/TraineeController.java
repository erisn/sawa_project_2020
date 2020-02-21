package com.sawaproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TraineeController {
	

	
	@RequestMapping(method = RequestMethod.GET, value = "/saveTrainee")
	public String  SaveTrainee() {
	    return "Success";
    }


}

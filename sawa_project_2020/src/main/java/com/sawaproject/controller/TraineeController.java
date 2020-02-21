package com.sawaproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sawaproject.entity.Trainee;
import com.sawaproject.repository.TraineeRepository;

import antlr.collections.List;

@RestController

public class TraineeController {
	
    @Autowired 
    private TraineeRepository  traineeRepository;
	
	@RequestMapping(method = RequestMethod.POST, value = "/savetrainee")
	public Trainee  SaveTrainee(@RequestBody Trainee trainee) {
		Trainee traineeLoc = traineeRepository.save(trainee);
	    return traineeLoc;
    }
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/savetrainee")
	public Iterable<Trainee>  getAllTrainees() {
		Iterable<Trainee> traineeLocs = traineeRepository.findAll();
	    return traineeLocs;
    }
	


}

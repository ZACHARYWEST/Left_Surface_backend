package com.capstone.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DiveFormulas {

	@RequestMapping(value="/calculateMMP", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<Double> calculateMMP(@RequestParam double depth, @RequestParam double obp) {
		double mmp = (depth*.445)+obp;
		return new ResponseEntity<Double>(mmp, HttpStatus.OK);
	}
	
	@RequestMapping(value="/calculateGasRequirementLP", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<Double> calculateGasRequirementLP(@RequestParam double ata, @RequestParam double acfm, @RequestParam double num) {
		double scfm = ata*acfm*num;
		return new ResponseEntity<Double>(scfm, HttpStatus.OK);
	}
	
	@RequestMapping(value="/calculateGasRequirementHP", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<Double> calculateGasRequirementHP(@RequestParam double ata, @RequestParam double acfm, @RequestParam double num, @RequestParam double time) {
		double scf = ata*acfm*num*time;
		return new ResponseEntity<Double>(scf, HttpStatus.OK);
	}
	
	@RequestMapping(value="/calculateATAWithDepth", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<Double> calculateATAwithDepth(@RequestParam double depth) {
		double ata1 = depth + 33;
		double ata2 = ata1/33;
		return new ResponseEntity<Double>(ata2, HttpStatus.OK);
	}
	
	@RequestMapping(value="/calculateATAWithPSIG", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@ResponseBody private ResponseEntity<Double> calculateATAwithPSIG(@RequestParam double psig) {
		double ata1 = psig + 14.7;
		double ata2 = ata1/14.7;
		return new ResponseEntity<Double>(ata2, HttpStatus.OK);
	}
	
}

package com.operation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.operation.pojo.CsvBean;
import com.operation.service.CsvService;

@Controller
public class CsvController {
	@Autowired
	CsvService csvService;
	@RequestMapping("/get/{id}")
	@ResponseBody
	/**
	 * 
	 * getDetailsApi is an API of type CsvBean which takes value (id) as parameter and return
	 * the associated key with it
	 */
	public CsvBean getDetailsApi(@PathVariable("id") int id)
	{
		return csvService.getCsvDetails(id);
	}

}

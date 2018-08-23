package com.operation.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import com.operation.pojo.CsvBean;
import com.operation.util.CsvUtil;

@Service
public class CsvService {

	private List<CsvBean> csvArray = new ArrayList<CsvBean>();
	@Autowired
	private ResourceLoader resourceLoader;
	public CsvService() {};
	/**
	 * using PostConstruct annotation to load the init method as the constructor of bean gets 
	 * created
	 */
	@PostConstruct
	public void init()
	{
		Resource resource = resourceLoader.getResource("classpath:"+"assets/csv/corpus.csv");
		try {
			csvArray = CsvUtil.loadCSVFile(resource.getInputStream());	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public CsvBean getCsvDetails(int id)
	{
		CsvBean c1 = new CsvBean();
		for(int i=0;i<csvArray.size();i++)
		{
			if(csvArray.get(i).getValue()==id)
			{
				c1.setKey(csvArray.get(i).getKey());
				c1.setValue(csvArray.get(i).getValue());
				break;
			}
		}
		return c1;
	}

}

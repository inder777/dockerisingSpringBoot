package com.operation.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.operation.pojo.CsvBean;

public class CsvUtil {

	public static List<CsvBean> loadCSVFile(InputStream is){
		List<CsvBean> ctr = new ArrayList<>();
		BufferedReader r = new BufferedReader(new InputStreamReader(is));
		try {
			int i=0;
			String line;
			String keyVal[]=new String[2];
			r.readLine();
			while((line=r.readLine())!=null)
			{
				keyVal = line.split(",");
				ctr.add(new CsvBean(keyVal[0],Integer.valueOf(keyVal[1])));
				keyVal[0]="";
				keyVal[1]="";
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return ctr;
	}
}

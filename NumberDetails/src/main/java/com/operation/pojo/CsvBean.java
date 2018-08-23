package com.operation.pojo;

/**
 * 
 * @author Inderjeet Singh
 * CsvBean is a pojo class which uses key as String and value as Integer
 *
 */
public class CsvBean {
	private String key;
	private int value;
	public CsvBean(String key, int value) {
		super();
		this.key = key;
		this.value = value;
	}
	public CsvBean()
	{

	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString()
	{
		return key;
	}

}

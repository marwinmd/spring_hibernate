package com.wiechert.springdemo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private LinkedHashMap<String, String> countryOptions;
	private ArrayList<String> operatingSystems;

	public Student() {
		countryOptions = new LinkedHashMap<>();
		getCountryOptions().put("BR", "Brazil");
		getCountryOptions().put("FR", "France");
		getCountryOptions().put("DE", "Germany");
		getCountryOptions().put("IN", "India");
		getCountryOptions().put("US", "United States");
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public ArrayList<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(ArrayList<String> favoriteOperatingSystem) {
		for (String string : favoriteOperatingSystem) {
			System.out.println(string);
		}
		this.operatingSystems = favoriteOperatingSystem;
	}

}

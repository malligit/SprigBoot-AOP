package com.malli.vo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class User {

	String name;
	String email;
	String org;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the org
	 */
	public String getOrg() {
		return org;
	}
	/**
	 * @param org the org to set
	 */
	public void setOrg(String org) {
		this.org = org;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	String city;
	
}

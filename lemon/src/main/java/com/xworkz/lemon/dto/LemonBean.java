package com.xworkz.lemon.dto;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

public class LemonBean {
	
	private String mantravaadi;
	private String location;
	
	int[] nums;
	
	ArrayList<String> mantravaadis;
	Map<String, String> magicians;
	
	Properties mantravettas;
	
	public String getMantravaadi() {
		return mantravaadi;
	}
	public void setMantravaadi(String mantravaadi) {
		this.mantravaadi = mantravaadi;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void maataMantra() {
		System.out.println("Details of MaataMantra");
		
		System.out.println("mantravaadi is available");
		
		System.out.println(mantravaadis);
		System.out.println("mantravaadi home no");
		System.out.println(magicians);
		System.out.println("mantravaadiiiii");
	}
	
	
	
}
	

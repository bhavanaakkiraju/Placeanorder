package com.capgemini.service;

import java.util.HashMap;

import com.capgemini.dao.OrderDAO;
import com.capgemini.dto.DDbean;

public class Serviceimpl {
	
public  HashMap<Integer,DDbean> addData( DDbean p) {
	
	//System.out.println(p);
	OrderDAO o=new OrderDAO();
	o.storeValue(p);
	return null;
	
	
}
}

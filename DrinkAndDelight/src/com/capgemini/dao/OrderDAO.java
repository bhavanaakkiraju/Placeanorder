package com.capgemini.dao;

import java.util.HashMap;

import com.capgemini.dto.DDbean;

public class OrderDAO {
	private static final Integer SupplierId = null;

	public HashMap<Integer,DDbean> storeValue(DDbean a) {
		//HashMap<Integer,DDbean>
		DDbean dd=new DDbean();
	HashMap<Integer,DDbean> p=new HashMap<Integer,DDbean>();
	p.put(SupplierId,a);
	//p.put(SupplierId,dd);
System.out.println(a.getName());
System.out.println(a.getPrice_per_unit());
System.out.println(a.getQuanityunit());
System.out.println(a.getQuantityValue());
System.out.println("Your order is placed sucessfully ");
	
	return null;
	
	
	
	
		
	}

}

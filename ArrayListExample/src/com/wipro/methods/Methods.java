package com.wipro.methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.wipro.user.User;


public class Methods {

	public static ArrayList<Object> list = new ArrayList();
	public static User userObj = new User();
	
	
	public static void main(String[] args) {
		Methods methodsObj = new Methods();
		methodsObj.addElements();
		
		System.out.println(list.get(0)+"BITSX DCOHNE");
		User user =new User();
		user.employee_id="1111";
		user.employee_name="kite";
		user.roll_no="44";
		user.occupation="minister";
		user.salary="35000";
		User us = new User(user);
		list.add(us);
		System.out.println("Complete List is Displayed \n:"+ list);
		
		List<String> newList = new ArrayList<String>();
		newList.add("Be Happy");
		list.addAll(newList);
		
		newList.clear();
		System.out.println("List Contains : "+list.contains(us));
		System.out.println(list.containsAll(newList));
		System.out.println("newList = "+newList);
		System.out.println("list.equals :"+list.equals(newList));
		
		System.out.println("Index of employee name-Kite :"+list.indexOf(us));
		
		Iterator<Object> it = list.iterator();
		while(it.hasNext()){
	System.out.println(it.next()+"  ");
	System.out.println(""
		+ "Retain All on newList \n"+newList.retainAll(list));
	System.out.println(
		"Remove All on newList \n:"+newList.removeAll(list));
	System.out.println(
		"the sublist is as follows\n"+list.subList(2,4));
	System.out.println(list.size());
	newList.add("Hi how are you");
	((ArrayList) newList).trimToSize();
				//Trims the capacity to its current size
		System.out.println("List after it is  trimmed :\n"+list);
		
		}
		}
		
		
	
	public void addElements(){
		String id [][] = {{"1234"},{"2134"},{"0134"},{"0555"},{"0123"},{"0987"},{"5675"}
		,{"4567"},{"3245"},{"1243"}};
		String name [][] = {{"ram"},{"sam"},{"tom"},{"jon"},{"sony"},{"jerry"}
		,{"rony"},{"tony"},{"popiye"},{"olive"}};
		String roll_no [][] ={{"4"},{"3"},{"5"},{"7"},{"6"},{"9"},{"8"},{"16"},{"13"},{"15"}};
		String occupation [][] = {{"peon"},{"doctor"},{"engineer"},{"steno"},{"manager"},
				{"pilot"},{"co-pilot"},{"anchor"},{"teacher"},{"student"},{"director"}};
		String salary [][] = {{"10000"},{"8000"},{"15000"},{"20000"},{"14000"},{"5000"}
		,{"12000"},{"6000"},{"90000"},{"5000"}};
		for(int i=0;i<10;i++){
			User userBean = new User();
			userBean.setEmployee_id(id[i][0]);
			userBean.setEmployee_name(name[i][0]);
			userBean.setRoll_no(roll_no[i][0]);
			userBean.setOccupation(occupation[i][0]);
			userBean.setSalary(salary[i][0]);
			list.add(userBean);
			
		}
	}
	
}

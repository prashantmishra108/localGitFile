package Oracke;

import java.io.Serializable;

public class studentinfo implements Serializable 
	{
 	  String name;
	  int rid;
	  String contact;
	  studentinfo sinfo;
	 studentinfo(String n, int r, String c,studentinfo sinfo)
	 {
	  this.name = n;
	  this.rid = r;
	  this.contact = c;
	  this.sinfo=sinfo;
	 }
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public static String getContact() {
		return contact;
	}
	public static void setContact(String contact) {
		studentinfo.contact = contact;
	}
*/
 }

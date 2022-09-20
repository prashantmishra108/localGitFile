package chap7;

import java.util.ArrayList;
import java.util.List;

public class wrapping {
public static void main(String[] args) {
	List <? extends Object> objects = new ArrayList<Object>();
	class Instru extends Object{}
	List<Instru >instru1 = new ArrayList<Instru>();
	List<? extends Instru> instru2 = new ArrayList<Instru>(); 
	List<?> myobjects = null;
	myobjects = objects;
	myobjects = instru1;
	myobjects = instru2;
	objects = myobjects;
	List<? extends Object>intt = new ArrayList<Object>();
	List<? extends wrapping>vintt = new ArrayList<wrapping>();
	List<? extends Object>dvintt =  new ArrayList<wrapping>();
	//wrong Base o = new wrapping();
	List<Object>dvinttn = new ArrayList<? extends Object>();
	
}
}
class Base extends wrapping{}
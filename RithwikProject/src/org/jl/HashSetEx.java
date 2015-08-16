package org.jl;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class HashSetEx {

	
	
	public static void main(String args[]){
		
		
		StudentTo s1 = new StudentTo(1,"Rithwik");
		StudentTo s2 = new StudentTo(1,"Rithwik");
		
		
		if(s1.equals(s2)){
			
			System.out.println("True ");
		}else{
			
			System.out.println("False ");
		}
		
		
		Set hs = new HashSet();
		hs.add(s1);
		hs.add(s2);
		
		iterateSet(hs);
		
		
		
	}
	private static void iterateSet(Set s ){
		Iterator it = s.iterator();
		while(it.hasNext()){
			
			StudentTo st = (StudentTo )it.next();
			System.out.println(st);
			
		}
	}
	
}

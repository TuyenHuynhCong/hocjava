package ued.HCTUYEN.model;

import java.util.Scanner;

public class Teacher implements Comparable<Teacher>{
	    String name;
	    int age;
	 
	    public Teacher(){
	 
	    }
	 
	    public Teacher(String n, int a){
	        this.name = n;
	        this.age = a;
	    }
	 
	    public String getName(){
	        return this.name;
	    }
	    public int getAge(){
	        return this.age;
	    }
	 

	    @Override
	    public String toString(){
	        return " Ten: "+this.name+", Tuoi: "+this.age;
	    }
	    private String usName(Teacher s){
	        String vnName = s.getName();
	        String firstName = vnName.substring(vnName.lastIndexOf(" ")+1);
	        String lastName = vnName.substring(0, vnName.lastIndexOf(" ")-1);
	        return firstName+" "+lastName;
	    }
	 
	 
	    public int compareTo(Teacher st){
	        if(usName(this).compareTo(usName(st)) == 0){
	            return this.getAge() - st.getAge();
	        }
	        else
	            return usName(this).compareTo(usName(st));
	    }
	    
	}
	 


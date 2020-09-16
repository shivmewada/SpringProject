package com.shiv.MavenExample1;

public class App {
   private int rollNo;
   private String fname;
   private String lname;
   private String email;
   
   App(int roll,String fName,String lName,String mail)
   {
	   rollNo=roll;
	   fname=fName;
	   lname=lName;
	   email=mail;
   }
   void display()
   {
	   System.out.println(rollNo+" "+fname+" "+lname+" "+email);
   }
   public static void main(String args[])
   {
	   App s=new App(101,"Ajay","Mewada","ajay@gmail.com");
	   s.display();
   }
}

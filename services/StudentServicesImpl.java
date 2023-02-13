package com.svk.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.svk.models.Student;

public class StudentServicesImpl implements StudentServices {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>();
	String name,city;
	long num,id,dob,anum;
	
	{
		list.add(new Student(1001,739618325,201, "krishna", "vizag",230800));
		list.add(new Student(1002,873827323,202, "haritha", "sklm",170800));
		list.add(new Student(1003,728731879,203, "satya", "vzm", 131000));
}
	
public void menu() {
		
		int choice;

		do {
				System.out.println("======STUDENT REGISTRATION SYSTEM=======");
				System.out.println("1.Add Records");
				System.out.println("2.Guardian Record");
				//System.out.println("3.Course Details");
				System.out.println("4.Student Details ");
				System.out.println("5.Exit");
				System.out.println("ENTER YOUR OPTION");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					addRecords();
					break;
				case 2:
					guardianRecord();
					break;
//				case 3:
//					courseDetails();
//					break;
				case 4:
					studentDetails();
					break;
				case 5:
					System.out.println("THANK YOU FOR REGISTERATION !!");
					break;
				default:
					System.err.println("Invalid input!!");
					break;	
				}
			
		} while (choice!=5);
	
		
		
				
	}

@Override
public void addRecords() {
	// TODO Auto-generated method stub
	System.out.println("======STUDENT'S DETAILS======");
	System.out.println("ENTER STUDENT'S NAME: ");
	name = sc.next();
	System.out.println("ENTER STUDENT'S ID: ");
	id = sc.nextInt();
	System.out.println("ENTER STUDENT'S ADDRESS");
	city = sc.next();
	System.out.println("ENTER STUDENT'S DOB");
	dob = sc.nextInt();
	System.out.println("ENTER STUDENT'S CONTACT NUMBER");
	num = sc.nextInt();
	Student ac = new Student(anum,id, num, name,city, dob);
	list.add(ac);
	System.err.println("Your registration has been created successfully");
	System.err.println("Your registration Number is :" + ac.getAnum());
}

@Override
public void guardianRecord() {
	// TODO Auto-generated method stub
	System.out.println("======PARENT DETAILS======");
	System.out.println("ENTER PARENT NAME: ");
	name = sc.next();
	System.out.println("ENTER PARENT CONTACT NUMBER: ");
	num = sc.nextInt();
}

//@Override
////public void courseDetails() {
//	// TODO Auto-generated method stub
//	System.out.println("ENTER YOUR COURSE");
//	name=sc.next();
//}

@Override
public void studentDetails() {
	// TODO Auto-generated method stub
	for(Student ac : list ) {
		System.out.println(ac);
	}
}
}

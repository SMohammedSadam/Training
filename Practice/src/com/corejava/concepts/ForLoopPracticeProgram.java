package com.corejava.concepts;

import java.util.Scanner;

public class ForLoopPracticeProgram {

	public static void main(String[] args) {
		int numberOfStudent;
		int distinctStudentsCount=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many students Details wants to store");
		numberOfStudent=scanner.nextInt();
		String[] studentNames=new String[numberOfStudent];
		int[] studentTotalMarks=new int[numberOfStudent];
		System.out.println("Please enter "+numberOfStudent+" student details");
		
		//To Store Student details in arrays
		for(int i=0;i<=numberOfStudent-1;i++)
		{
			System.out.println("Please enter  student name of:"+(i+1));
			studentNames[i]=scanner.next();
			System.out.println("Please enter  student total mark of:"+(i+1));
			studentTotalMarks[i]=scanner.nextInt();
		}
		
		//To check Distinct Student Details
		System.out.println("Distinct students details");
		for(int i=0;i<=numberOfStudent-1;i++)
		{
			if(studentTotalMarks[i]>=800&studentTotalMarks[i]<=1200)
			{
				System.out.println(studentNames[i]);
				System.out.println(studentTotalMarks[i]);
				distinctStudentsCount++;
			}
		}
		
		//To Show distinct student count
		if(distinctStudentsCount>=0)
		System.out.println(distinctStudentsCount+" Distinct students");
			
		//To check invalid total or below distince mark of student details
		if(distinctStudentsCount!=numberOfStudent){
		System.out.println("invalid total or below distince mark of student details");
		for(int i=0;i<=numberOfStudent-1;i++)
		{
			if(!(studentTotalMarks[i]>=800&studentTotalMarks[i]<=1200))
			{
				System.out.println(studentNames[i]);
				System.out.println(studentTotalMarks[i]);
			}
		}
		}
	}

}

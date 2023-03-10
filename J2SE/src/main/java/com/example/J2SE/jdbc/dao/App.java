package com.example.J2SE.jdbc.dao;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		int i, id;
		StudentDao sDao = new StudentDao();
		char choice;
		do {
			System.out.println("------MENU------");
			System.out.println("1. Insert a new Student");
			System.out.println("2. Find a Student");
			System.out.println("3. View all Students");
			System.out.println("4. Update a Student");
			System.out.println("5. Delete a Stduent");
			System.out.println("Choice: ");
			choice  = sc.next().charAt(0);
			switch(choice) {
			case '1':
				sc.nextLine();
				System.out.println("Name: ");
				st.setName(sc.nextLine());
				System.out.println("Email: ");
				st.setEmail(sc.nextLine());
				System.out.println("Active(y/n): ");
				st.setActive(sc.next().charAt(0)=='y'?true:false);
				i = sDao.save(st);	
				if(i==1) {
					System.out.println("Student added to the database!");
				}
				break;
			case '2':
				System.out.println("Enter the id of the student: ");
				id=sc.nextInt();
				st = sDao.getOne(id);
				System.out.println(st);
				break;
			case '3':
				sDao.getAll().forEach(System.out::println);
				break;
			case '4':
				System.out.println("Id: ");
				st.setId(sc.nextInt());
				sc.nextLine();
				System.out.println("Name: ");
				st.setName(sc.nextLine());
				System.out.println("Email: ");
				st.setEmail(sc.nextLine());
				System.out.println("Active(y/n): ");
				st.setActive(sc.next().charAt(0)=='y'?true:false);
				i = sDao.update(st);
				if(i==1) {
					System.out.println("Student updated in the database!");
				}
				break;
			case '5':
				System.out.println("Enter the id of the student: ");
				id=sc.nextInt();
				st = sDao.getOne(id);
				System.out.println(st);
				do {
					System.out.println("Confirm Delete(y/n)?");
					choice=sc.next().charAt(0);
				}while(!(choice=='y'||choice=='n'));
				if(choice=='y') {
					i = sDao.delete(id);
					if(i==1) {
						System.out.println("Student deleted from the database!");
					}
				}
				else {
					System.out.println("Delete Cancelled!");
				}
				break;
			default:
				System.out.println("Invalid Choice!");
			}
			
			do {
				System.out.println("Do you want to continue(y/n)?");
				choice=sc.next().charAt(0);
			}while(!(choice=='y'||choice=='n'));
		}while(choice=='y');
		
		
	}
}

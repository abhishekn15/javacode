package StudentData;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.TreeSet;
public class StudentRecord {
	public class StudentRecord {
		public static void main(String[] args) {
		String sName;
		String fName;
		int eId;
		int hindi;
		int math;
		int english;
		int physics;
		int bio;
		int computer;
		TreeSet a = new TreeSet();
		TreeSet d = new TreeSet(new StudentProfile());
		a.add(new StudentProfile("Name-abhishek", "ab", 101, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-bhuvan", "bv", 102, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-animesh", "an", 103, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-dinesh", "dn", 104, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-danish", "da", 105, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-alok", "ak", 106, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-girish", "gi", 107, 60, 50, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-nitin", "ni", 108, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-yogesh", "yo", 109, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-ramesh", "ra", 110, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-suresh", "su", 111, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-swastik", "sw", 112, 60, 66, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-addhar", "ad", 113, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-ankit", "an", 114, 76, 61, 62, 63, 64, 69));
		a.add(new StudentProfile("Name-sumit", "su", 115, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-saket", "sa", 116, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-pankaj", "pa", 117, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-ajay", "aj", 118, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-rakesh", "ra", 119, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-suraj", "su", 121, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-tirth", "ti", 122, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-anuj", "an", 123, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-ankita", "ank", 124, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-amit", "am", 125, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-animesh", "anm", 126, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-pankaj", "pa", 127, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-atal", "at", 128, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-danish", "da", 129, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-deepak", "de", 130, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-anjali", "an", 131, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-adarsh", "ad", 132, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-kamal", "ka", 133, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-sunil", "su", 134, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-rajeev", "ra", 135, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-raman", "ram", 136, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-ritesh", "rit", 137, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-rounak", "rou", 138, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-sudhir", "su", 139, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-ritu", "ri", 140, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-anuraj", "an", 141, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-aditi", "ad", 142, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-amit", "am", 143, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-harsh", "h", 144, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-ashish", "as", 145, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-pranay", "pr", 146, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-nikunj", "nk", 147, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-nilesh", "nl", 148, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-nidhi", "nd", 149, 60, 61, 62, 63, 64, 65));
		a.add(new StudentProfile("Name-aushutosh", "ast", 150, 60, 61, 62, 63, 64, 65));
		System.out.println(">>>Ascending order records>>>");
		System.out.println(" ");
		for (Object object : a) {
		System.out.println(object);
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("<<<Descending order records<<<");
		System.out.println(" ");
		for (Object object : d) {
		System.out.println(object);
		}
		}
		}
		
	
	
	


package job;
import java.util.Scanner;


import java.util.ArrayList;
import java.util.Scanner;
class Testing {
public static void main(String[] args) {
String opt;
float ten, twelth, graduate;
ArrayList al = new ArrayList();
boolean check = true;
do {

Scanner sc = new Scanner(System.in);
System.out.println("Enter your name");
String name = sc.nextLine();
System.out.println("Enter your age");
int age = sc.nextInt();
System.out.println("Enter your mobile no");
long mobile = sc.nextLong();
System.out.println("Enter the 10th percentage");
float per10 = sc.nextFloat();
System.out.println("Enter the 12th percentage");
float per12 = sc.nextFloat();
System.out.println("Enter the graduation percentage");
float perGrads = sc.nextFloat();
Candidate cc = new Candidate(name, age, mobile, per10, per12, perGrads);
for (Object obj : al) {
Candidate ca = (Candidate) obj;
if (ca.toString().equals(cc.toString())) {
check = false;
}
}
if (check == true) {
al.add(cc);
} else if (check == false) {
System.out.println(" Candidate duplicate data not allowded");
}
System.out.println("Whether want to enter new entries y/n..");
opt = sc.next();
} while (opt.equalsIgnoreCase("y"));
Scanner job = new Scanner(System.in);
ArrayList jobadd = new ArrayList();
System.out.println("Enter the details of job profile");
System.out.println("Enter the 10th pecentage");
ten = job.nextFloat();

System.out.println("Enter the 12th percentage");
twelth = job.nextFloat();
System.out.println("Enter the graduation percentage");
graduate = job.nextFloat();
for (Object obj : al) {
Candidate can = (Candidate) obj;
if (can.per10 >= ten && can.per12 >= twelth && can.perGrads >= graduate) {
jobadd.add(can);
}
}
System.out.println("Eligible candidates are");
for (Object obd : jobadd) {
System.out.println(obd);
}
}
}
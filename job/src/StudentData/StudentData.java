package StudentData;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
public class StudentProfile implements Comparable,Comparator{
String sName;
String fName;
int eId;
int hindi;
int math;
int english;
int physics;
int bio;
int computer;
int total;
@Override
public int compareTo(Object ob) {
StudentProfile sp1 = (StudentProfile) ob;
return this.total - sp1.total;
}
public StudentProfile(String sName, String fName, int eId, int hindi, int math, int english, int physics,
int bio,int computer) {
this.sName = sName;
this.fName = fName;
this.eId = eId;
this.hindi = hindi;
this.math = math;
this.english = english;
this.physics = physics;
this.bio = bio;
this.computer = computer;
this.total = hindi + math + english + physics + bio + computer;
}
@Override
public String toString() {
return sName + ", FNAME- " + fName + ", Eid-" + eId + ", [ HIN-" + hindi + ", MATH-" + math + ", ENG-" + english + ", PHY-" + physics + ", BIO-" + bio + ", COMP-" + computer + "] -" + " Total=" + total;
}
public StudentProfile() {
//STUDENT_PROFILE
}
@Override
public int compare(Object ob1, Object ob2) {
StudentProfile s1 = (StudentProfile) ob1;
StudentProfile s2 = (StudentProfile) ob2;
return -(s1.total - s2.total);
}

}

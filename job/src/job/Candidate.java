package job;
import java.util.ArrayList;

import java.util.Scanner;
class Candidate {
String name;
int age;
long mobile;
float per10, per12, perGrads;
public Candidate(String name, int age, long mobile, float per10, float per12, float perGrads) {
super();
this.name = name;
this.age = age;
this.mobile = mobile;
this.per10 = per10;
this.per12 = per12;
this.perGrads = perGrads;
}
@Override
public String toString() {
return "name=" + name + ", age=" + age + ", mobile=" + mobile + ", per10=" + per10 + ", per12=" +per12+ ", perGrads=" + perGrads;

}
}
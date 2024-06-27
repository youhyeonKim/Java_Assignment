package Inheritance;

public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;
public static void main(String args[]){
	Student stu = new Student("차은우", "jspprogram",500000);
	stu.calcReturnFee();
	stu.print();
}
public Student(String name, String subject, int fee){
		this.name = name;
		this.subject = subject;
		this.fee = fee;
}
public void calcReturnFee(){
	if(subject.equals("javaprogram"))
		returnFee = fee*0.75;
	else if (subject.equals("jspprogram"))
		returnFee = fee * 0.8;
	else {
		System.out.println("그런 과정명은 없습니다.");
	}
}
public void print(){
	System.out.printf("%s씨의 과정명은 %s이고 교육비는 %d이며 환급금은 %.1f입니다.", name, subject,fee,returnFee);
}
}  
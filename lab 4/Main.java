import java.util.*;
class Person {
	private String str;
	private int age;
	public Person() {

	}
	public Person(String str,int age) {
		this.str=str;
		this.age=age;
	}
	public void setName(String str) {
		this.str=str;
	}
	public String getName() {
		return str;
	}

	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
}
class Student extends Person {
	private int rollNo;
	public Student() {

	}
	public Student(String name,int age, int rollNo) {
		super(name,age);
		this.rollNo=rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo=rollNo;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String toString(){
		return "[["+getName()+","+getRollNo()+","+getAge()+"]]";
	}
}
class Main {
	public static void main(String[] args) {
		Student student1=new Student("Ali",19,66);
		Student student2=new Student("Jabbar",20,64);
		Student student3=new Student("Inayat",19,61);
		Student student4=new Student("Jawad",19,63);
		Student student5=new Student("Sheraz",19,67);

		ArrayList<Student> list=new ArrayList<Student>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf(student4));
        System.out.println( list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.clone());
        list.remove(1);
        list.set(2, student4);
        System.out.println(list.subList(1,3));
        list.clear();
        list.add(student5);
        System.out.println(list);
	}
}
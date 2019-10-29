class Employee{
    int salary,perDay;
    public void getInfo(int  isalary,int  iperDay){
        salary=isalary;
        perDay=iperDay;
System.out.println("Salary of the Employeer\n"+salary+"$");
System.out.println("Numbers of hours of work  per day  Employeer\n"+perDay+"hour");
    }
    public void  AddSalary(){
if(salary>500){
    int result =salary+10;
    System.out.println("Salary Bonus\n"+result+"$");
}
else {
    System.out.println("Salary is less than 500");
}
}
public void workHourBonus(){
    if(perDay>5){
        int res=salary+5;
        System.out.println("Hour Bonus \n"+res+"$");
    }
    else {
        System.out.println("Work per hour ");
    }

}
}
class Main{
    public static void main(String [ ]args){
        Employee e=new Employee();
        e.getInfo(600, 6);
        e.AddSalary();
        e.workHourBonus();
    }
}
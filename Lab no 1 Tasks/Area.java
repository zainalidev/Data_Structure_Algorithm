import java.util.*;
class Area{
int length;
int breath;
Area(int l,int b){
    length=l;
    breath=b;
}
 int returnArea(){
    return length*breath;
}
}
class Main{
    public static void main(String[]args){
 Scanner sc=new Scanner (System.in);
 System.out.println("Enter length");
 int l=sc.nextInt();
 System.out.println("Enter breath");
 int b=sc.nextInt();
 Area a=new Area(l,b);
 System.out.println("Area of Rectangle "+a.returnArea());
    }
}
class Shape{
    int length;
    int base;
    int height;
}
class Square extends Shape{
    public void drawShape(int length){
        this.length=length;
       int area =length*length;
       System.out.println("Area is "+area);

    }
    public void eraseShape(int length){
        this.length=length;
        int para=4*length;
        System.out.println("Parameter is"+para);

    }
}
class Traingle extends Shape{
    public void drawShape(int base,int height){
this.base=base;
this.height=height;
int areas=(1/2)*(base*height);
System.out.println("Area of traingle is"+areas);
    }
    public void eraseShape(){

    }

}
class Main{
    public static void main(String[]args){
        Square obj=new Square ();
        obj.drawShape(2);
        obj.eraseShape(3);
        Traingle sc=new Traingle();
        sc.drawShape(2,3);
        //sc.eraseShape();
        s
    }
}

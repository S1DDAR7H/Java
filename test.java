package rect;

public class test{
    int length, breadth;
    public void setDimension(int a, int b){
        length = a;
        breadth = b;
    }
    public int peri(){
       int perimeter = 2*(this.length+this.breadth); 
       return perimeter;
    }
    public int area(){
        int a = (this.length*this.breadth);
        return a;
    }
    public void display(){
        System.out.println("Area : "+area());
        System.out.println("Perimeter : "+peri());
    } 
}
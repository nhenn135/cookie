import java.util.Scanner;

abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here

class Square extends Shape {
    Square(int x) {
        width = x;
    }
    void area() {
        System.out.println(width * width);
    }
}

class Circle extends Shape {
    Circle(int y){
        width = y;
    }

    public void area(){
        System.out.println(Math.PI*width*width);
    }
}

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}

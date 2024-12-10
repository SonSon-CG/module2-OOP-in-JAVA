import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 he so cua phuong trinh");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        if (q.getDiscriminant() < 0){
            System.out.println("phuong trinh vo nghiem");
        } else if  (q.getDiscriminant() == 0) {
            System.out.println("phuong trinh co 1 nghiem" + q.getRoot1());
        }else{
            System.out.println("phuong trinh co 2 nghiem"+ q.getRoot2()+ "va"+ q.getRoot1());
        }
    }
}

class QuadraticEquation{
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.c = c;
        this.b = b;
    }

//    tinh DELTA
    public double getDiscriminant() {
        return (b*b - 4*a*c);
    }
    public double getRoot1(){
        return (-b + Math.pow(this.getDiscriminant(),0.5))/(2*a);
    }
    public double getRoot2(){
        return (-b - Math.pow(this.getDiscriminant(),0.5))/(2*a);
    }



}
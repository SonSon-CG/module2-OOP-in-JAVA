import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rectangle h1 = new Rectangle(3, 5);
        Rectangle h2 = new Rectangle(4, 6);

        int s1 = h1.getArea();
        int s2 = h2.getArea();
        int p1 = h1.getPerimeter();
        int p2 = h2.getPerimeter();

        System.out.println(h1.display());
        System.out.println(h2.display());
    }
}

class Rectangle{
    int width;
    int height;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return width * height;
    }
    public int getPerimeter(){
        return 2 * (width + height);
    }
    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


}
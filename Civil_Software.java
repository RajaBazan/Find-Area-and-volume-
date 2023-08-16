package hello.com;
class Rectangle1{
    public int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    Rectangle1(){
//        System.out.println("I'm the parameter of rectangle");
    }
    Rectangle1(int l, int h, int w){
//        System.out.println("I'm the parameter of Rectangle");
        this.length = l;
        this.height = h;
        this.width = w;
    }
    public double area(){
        System.out.println("Here the area of Rectangle: ");
        return this.length * this.width;

    }
    public double volume(){
        System.out.println("Here the volume of Rectangle: ");
        return this.length * this.height * this.width;
    }
}
class Cuboid extends Rectangle1{
public double area(){
    System.out.println("Here the area of Cuboid: ");
    return 2 * (this.length * this.width) + 2 * (this.length * this.height) + 2 * (this.height * this.width);
}
public double volume(){
    System.out.println("Here the volume of Cuboid: ");
    return this.length * this.height * this.width;
}
}
public class Civil_Software {
    public static void main(String[] args) {
        Rectangle1 rec = new Rectangle1();
        // Here I'm finding the area of rectangle by getter and setter
        rec.getLength();
        rec.setLength(10);
        rec.getWidth();
        rec.setWidth(10);
        System.out.println(rec.area());
        //Here I'm finding the volume of rectangle by getter and setter
        rec.getHeight();
        rec.setHeight(10);
        System.out.println(rec.volume());
//        here we are implement second class
        Cuboid cui = new Cuboid();
//        Here I'm finding the area of cuboid by getter and setter
        cui.getLength();
        cui.setLength(10);
        cui.getHeight();
        cui.setHeight(10);
        cui.getWidth();
        cui.setWidth(10);
        System.out.println(cui.volume());
//        Here I'm finding the volume of cuboid by getter and setter
        System.out.println(cui.area());

    }
}

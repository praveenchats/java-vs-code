import java.io.*;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;

abstract class Shape {
  abstract public void calc_area();

  abstract public void calc_volume();
}

class Cube extends Shape {
  double h, r, area, volume, a;

  public void accept() throws IOException {
    System.out.println("Enter radius and height of the Cube: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    r = Double.parseDouble(br.readLine());
    h = Double.parseDouble(br.readLine());
    a = Double.parseDouble(br.readLine());
  }

  public void calc_area() {

    area = 6 * a * a;
  }

  public void calc_volume() {
    volume = a * a * a;
  }

  public void display() {
    calc_area();
    calc_volume();
    System.out.println("The area of Cube is: " + area);
    System.out.println("The volume of Cube is: " + volume);
  }
}

class Cylinder extends Shape {
  double r, h, area, volume;
  public int pi;

  public void accept() throws IOException {
    System.out.println("Enter radius and height of the Cylinder: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    r = Double.parseDouble(br.readLine());
    h = Double.parseDouble(br.readLine());
  }

  public void calc_area() {
    area = (2 * pi * r * h) + (2 * pi * r * r);
  }

  public void calc_volume() {
    volume = pi * r * r * h;
  }

  public void display() {
    calc_area();
    calc_volume();
    System.out.println("The area of Cylinder is: " + area);
    System.out.println("The volume of Cylinder is: " + volume);
  }
}

class cuboid extends Shape {
  double l, b, h, area, volume;

  public void accept() throws IOException {
    System.out.println("Enter length, breadth and height of the cuboid: ");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    l = Double.parseDouble(br.readLine());
    b = Double.parseDouble(br.readLine());
    h = Double.parseDouble(br.readLine());
    area = Double.parseDouble(br.readLine());
  }

  public void calc_area() {
    area = (2 * l * b) + (2 * b * h) + (2 * l * h);
  }

  public void calc_volume() {
    volume = l * b * h;
  }

  public void display() {
    calc_area();
    calc_volume();
    System.out.println("The area of cuboid is: " + area);
    System.out.println("The volume of cuboid is: " + volume);
  }
}

public class sa2 {
  public static void main(String[] args) throws IOException {
    Cube cu = new Cube();
    cu.accept();
    cu.display();
    Cylinder cy = new Cylinder();
    cy.accept();
    cy.display();
    cuboid b = new cuboid();
    b.accept();
    b.display();
  }
}
import java.util.Scanner;

class TwoD {
    double length;
    double width;

    public void setDimensions() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of sheet (in ft): ");
        length = sc.nextDouble();
        System.out.print("Enter width of sheet (in ft): ");
        width = sc.nextDouble();
        sc.close();
    }

    public double calculateCost() {
        return length * width * 40;
    }
}

class ThreeD extends TwoD {
    double height;

    public void setDimensions() {
        super.setDimensions();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height of box (in ft): ");
        height = sc.nextDouble();
        sc.close();
    }

    public double calculateCost() {
        return super.calculateCost() + length * width * height * 60;
    }
}

public class Main {
    public static void main(String[] args) {
        ThreeD obj = new ThreeD();
        obj.setDimensions();
        double cost = obj.calculateCost();
        System.out.println("Total cost of plastic: Rs " + cost);
    }
}

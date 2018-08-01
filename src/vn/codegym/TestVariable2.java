package vn.codegym;
import java.util.Scanner;

public class TestVariable2 {
    public static void main(String[] args) {
        float width;
        float height;
        float area;

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scn.nextFloat();

        System.out.println("Enter height: ");
        height = scn.nextFloat();

        area = width * height;

        System.out.println("Area is: " + area);
    }
}

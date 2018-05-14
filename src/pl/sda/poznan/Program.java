package pl.sda.poznan;

import pl.sda.poznan.math.MathHelper;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number to compute: ");
        Integer number = sc.nextInt();
        Integer result = MathHelper.factorialRecursive(number);
        System.out.println(String.format("For %s! result is: %d", number, result));
    }
}

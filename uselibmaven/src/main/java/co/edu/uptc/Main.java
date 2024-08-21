package co.edu.uptc;

import co.edu.uptc.models.Calculate;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        System.out.println(calculate.sum(12, 3));
    }
}
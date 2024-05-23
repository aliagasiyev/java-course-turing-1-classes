package az.edu.turing.module02.part02.lesson05;

import java.util.ArrayList;
import java.util.Random;

public class Practic {
    public static void main(String[] args) {
        int n = 20;
        int interval = 10;
        int count;

        for (int i = 0; i <= n; i += interval) {
            count = 0;
            for (int j = i; j < i + interval && j <= n; j++) {
                count++;
            }
            System.out.println("0 dan " + i + "ya qeder olan reqemlerin sayi:" + count);
        }
    }
}




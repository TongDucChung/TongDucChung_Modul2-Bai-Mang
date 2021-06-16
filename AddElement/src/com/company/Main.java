package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] Array2 = new int[Array.length + 1];
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao phan tu can them");
        int a = input.nextInt();
        System.out.println("Nhap vao vi tri can them");
        int b = input.nextInt();

        if (b <= 1 || b >= Array.length) {
            System.out.println("Khong chen duoc phan tu vao mang");
        }
        for (int i = 0; i < b; i++) {
           Array2[i]=Array[i];
        }
        Array2[b]=a;
        for (int i =b; i <Array.length ; i++) {
            Array2[i+1]=Array[i];
        }
        for (int x:
             Array2) {
            System.out.println(x+"");
            
        }
    }
}

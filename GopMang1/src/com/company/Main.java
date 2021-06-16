package com.company;

public class Main {

    public static void main(String[] args) {
	int[] Array1={1,2,3,4,5,6,7,7,8};
	int[] Array2={1,2,3,4,5};
	int[] Array3=new int[Array1.length+ Array2.length];
        for (int i = 0; i < Array1.length; i++) {
            Array3[i]=Array1[i];
        }
        for (int i = 0; i < Array2.length ; i++) {
            Array3[Array1.length+i] = Array2[i];
        }
        for (int i = 0; i < Array3.length; i++) {
            System.out.println(Array3[i]);
        }
    }
}

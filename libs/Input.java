package com.dark.libs;

import java.util.Scanner;


public class Input {

    public static String Data;

    public static void main(String[] args) {

    }
    //All Funcations

    public static void GiveResult(String GiveHint) {
        Scanner input = new Scanner(System.in);
        System.out.println(GiveHint);

        Data = input.nextLine();
        System.out.println(Data);

    }
}

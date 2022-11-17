package stepik.javapracticeautotest.block3;

import java.util.Scanner;

public class AgentPass {
    final static int PASSWORD = 133976;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        if (pass == PASSWORD) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}

/*
Напишите программу, которая:
запрашивает на вход число-пароль
если оно равно секретному числу, программа выводит: "Hello, Agent"
в противном случае печатает: "Access denied".
Секретный пароль хранится в final static int password.

Sample Input:
133976

Sample Output:
Hello, Agent
 */
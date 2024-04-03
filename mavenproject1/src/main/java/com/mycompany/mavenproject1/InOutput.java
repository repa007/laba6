/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

// Суперкласс для ввода арифметической операции и вывода результата
public class InOutput {
    public String getOperationFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите арифметическую операцию (+, -, *, /): ");
        return scanner.nextLine();
    }
}
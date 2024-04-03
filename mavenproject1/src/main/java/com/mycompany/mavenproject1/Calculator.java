/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author repat
 */
import java.util.Scanner;


// Подкласс, наследующий суперкласс и реализующий интерфейсы
public class Calculator extends InOutput{
    private double area1;
    private double area2;
    
    public Calculator(double area1, double area2) {
        this.area1 = area1;
        this.area2 = area2;
    }
    
    
    public double calculateArea(Scanner scanner) {
        
        return area1 * area2;
    }
    
    
  
    public void performOperation() {
        String operation = getOperationFromUser();
        
        switch (operation) {
            case "+":
                System.out.println("Сумма площадей: " + (area1 + area2) + "\n");
                break;
            case "-":
                System.out.println("Разность площадей: " + (area1 - area2) + "\n");
                break;
            case "*":
                System.out.println("Результат умножения площадей: " + (area1 * area2) + "\n");
                break;
            case "/":
                if (area2 != 0) {
                    System.out.println("Результат деления площадей: " + (area1 / area2) + "\n");
                } else {
                    System.out.println("Деление на ноль недопустимо!" + "\n");
                }
                break;
            default:
                System.out.println("Неправильная арифметическая операция!\n");
        }
    }
    
}

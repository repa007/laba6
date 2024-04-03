
package com.mycompany.mavenproject1;

/**
 *
 * @author Salov Dmitriy
 */
import java.util.Scanner;


public class Mavenproject1 {
    public static void main(String[] args) {
        // доступ через объектную переменную абстрактного суперкласса
        Figure triangle1 = new Triangle("красный", 3, 4, 5);
        Figure square1 = new Square("синий", 5);
        Figure circle1 = new Circle("зеленый", 7);

        System.out.println("Треугольник №1:");
        System.out.println("Цвет: " + triangle1.getColor());
        System.out.println("Площадь: " + triangle1.getArea());
        System.out.println("Периметр: " + triangle1.getPerimeter());

        System.out.println("\nКвадрат №1:");
        System.out.println("Цвет: " + square1.getColor());
        System.out.println("Площадь: " + square1.getArea());
        System.out.println("Периметр: " + square1.getPerimeter());

        System.out.println("\nКруг №1:");
        System.out.println("Цвет: " + circle1.getColor());
        System.out.println("Площадь: " + circle1.getArea());
        System.out.println("Длина окружности: " + circle1.getPerimeter());
        
        // Создание объекта производного класса и доступ к нему через объектную переменную подкласса
        Triangle triangle2 = new Triangle("фиолетовый", 3, 5, 6);
        Square square2 = new Square("чёрный", 10);
        Circle circle2 = new Circle("жёлтый", 8);
        
        System.out.println("\nТреугольник №2:");
        System.out.println("Цвет: " + triangle2.getColor());
        System.out.println("Площадь: " + triangle2.getArea());
        System.out.println("Периметр: " + triangle2.getPerimeter());

        System.out.println("\nКвадрат №2:");
        System.out.println("Цвет: " + square2.getColor());
        System.out.println("Площадь: " + square2.getArea());
        System.out.println("Периметр: " + square2.getPerimeter());

        System.out.println("\nКруг №2:");
        System.out.println("Цвет: " + circle2.getColor());
        System.out.println("Площадь: " + circle2.getArea());
        System.out.println("Длина окружности: " + circle2.getPerimeter());
        
        //демонстрация работы интерфейсов
        Scanner scanner = new Scanner(System.in);
        //можно подставить какую надо фигуру
        Calculator cal = new Calculator(square2.getArea(),circle2.getArea());
        //4 раза для разных знаков и 1 дополнительный для неправильного ввода
        cal.performOperation();
        cal.performOperation();
        cal.performOperation();
        cal.performOperation();
        cal.performOperation();
        scanner.close();
    }
}



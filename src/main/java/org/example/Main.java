package org.example;

import java.util.Scanner;

public class Main {
    public Main(String name, int id, int ram, int ssd, String os, String color) {
    }

    public static void main(String[] args) {

        Laptop l1 = new Laptop("Samsung", 1, 2, 256, "Windows 10", "Металлик");
        Laptop l2 = new Laptop("HP", 2, 4, 256, "Windows 11", "Красный");
        Laptop l3 = new Laptop("Asus", 3, 32, 512, "Windows 10", "Серый");
        Laptop l4 = new Laptop("Msi", 4, 16, 128, "Windows 11", "Черный");
        //System.out.println(l1.toString());

        System.out.println("Выберите функцию:");
        System.out.println("1 - сортировка по ОЗУ");
        System.out.println("2 - сортировка по SSD");
        System.out.println("3 - сортировка по названию");
        System.out.println("4 - сортировка по OS");
        Scanner sc = new Scanner(System.in,"ibm866");
        Integer choice = sc.nextInt();
        if(choice == 1){

            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = sc.nextInt();
            if(ram >=32){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if(ram < 32){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            }else if(ram < 16){
                System.out.printf(l1.toString() + "\n" + l2.toString());
            }else if(ram < 4){
                System.out.printf(l1.toString());
            }else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 2){

            System.out.printf("Введите значение SSD: ");
            Integer ssd = sc.nextInt();
            if(ssd >=512){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if(ssd < 512){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            }else if(ssd < 256){
                System.out.printf(l1.toString() + "\n" + l2.toString());
            }else if(ssd < 128){
                System.out.printf(l1.toString());
            }else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 3){
            System.out.println("Введите название ноутбука: ");
            Scanner sc1 = new Scanner(System.in);
            String name = sc1.nextLine();
            if(name.equals("Name")){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if(name.equals("Samsung")){
                System.out.printf(l1.toString() + "\n");
            }else if(name.equals("HP")){
                System.out.printf(l2.toString() + "\n");
            }else if(name.equals("Asus")) {
                System.out.printf(l3.toString() + "\n");
            }else if(name.equals("Msi")){
                    System.out.printf(l4.toString());
            }else System.out.println("Таких ноутбуков нет!");

        }else if(choice == 4){

            System.out.println("Введите название OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if(os.equals("Windows")){
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            }else if(os.equals("Windows 10")){
                System.out.printf(l1.toString() + "\n" + l3.toString());
            }else if(os.equals("Windows 11")){
                System.out.printf(l2.toString() + "\n" + l4.toString());
            }else System.out.println("Таких ноутбуков нет!");
            sc1.close();
        }

        sc.close();
    }

}

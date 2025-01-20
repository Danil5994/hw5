import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");


        char clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println("Task 2");

        int clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("установите облегчённую версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите версию облегченную версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        System.out.println("Task 3");


        int year = 2020;
        if (year >= 1584) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(" Год является високосным! ");
            } else {
                System.out.println(" Год не является високосным!");
            }

            System.out.println("Task 4");


            int cardDistance = 20;
            if (cardDistance < 20) {
                System.out.println("Потребуется дней - 1");
            } else if (cardDistance >= 20 && cardDistance <= 60) {
                System.out.println("потребуется дней - 2");
            } else if (cardDistance > 60 && cardDistance <= 100) {
                System.out.println("потребуется дней - 3");
            } else {
                System.out.println(" Доставки нет");
            }


            System.out.println("Task 5");


            int monthNumber = 12;

            switch (monthNumber) {
                case 12, 1, 2:
                    System.out.println("зима");
                    break;
                case 3, 4, 5:
                    System.out.println("весна");
                    break;
                case 6, 7, 8:
                    System.out.println("лето");
                    break;
                case 9, 10, 11:
                    System.out.println("осень");
                    break;
                default:
                    System.out.println("такого месяца нет");

            }


        }
    }
    }
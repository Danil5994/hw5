import java.time.Year;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // task1

        char clientOS = 0;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // task 2

            int clientDeviceYear= 2012;
        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("установите облегчённую версию приложения для iOS по ссылке");
        }else if(clientOS == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Установите версию облегченную версию приложения для Android по ссылке");
        }else if(clientOS == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        // task 3

        int year = 2021;
        if (year >= 1584){
        } if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(" Год является високосным! ");
        }else {
            System.out.println(" Год не является високосным!");
        }

        // task 4

        int cardDistance = 20;
        if (cardDistance < 20){
            System.out.println("Потребуется дней - 1");
        }else if (cardDistance >= 20 && cardDistance <= 60){
            System.out.println("потребуется дней - 2");
        }else if (cardDistance > 60 && cardDistance <= 100){
            System.out.println("потребуется дней - 3");
        }else{System.out.println(" Доставки нет");}


        // task 5

        int monthNumber = 12;

        switch (monthNumber){
            case 1:
                System.out.println("Январь-зима");
                break;
            case 2:
                System.out.println("Февраль-зима");
                break;
            case 3:
                System.out.println("Март-весна");
                break;
            case 4:
                System.out.println("Апрель-весна");
                break;
            case 5:
                System.out.println("Май-весна");
                break;
            case 6:
                System.out.println("Июнь-лето");
                break;
            case 7:
                System.out.println("Июль-лето");
                break;
            case 8:
                System.out.println("Август-лето");
                break;
            case 9:
                System.out.println("Сентябрь-осень");
                break;
            case 10:
                System.out.println("Октябрь-осень");
                break;
            case 11:
                System.out.println("Ноябрь-осень");
                break;
            case 12:
                System.out.println("Декабрь-зима");

        }




    }
}
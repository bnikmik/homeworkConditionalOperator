public class Main {
    public static void main(String[] args)
    {// Условные операторы.
        // Задание №1 и №2

        int clientOS = 0;
        int clientDeviceYear = 2015;

        System.out.println(" ");
        System.out.println("Задание №1 и №2");

        if (clientOS == 0 && clientDeviceYear < 2015){
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
    else if (clientOS == 0 && clientDeviceYear >= 2015){
        System.out.println("Установите версию приложения для iOS по ссылке");
    }
    else if (clientOS == 1 && clientDeviceYear < 2015){
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    }
    else if (clientOS == 1 && clientDeviceYear >= 2015){
        System.out.println("Установите версию приложения для Android по ссылке");
    }

        //Задание №3

        int year = 2013;
        int checkLeapYear = year % 4;

        System.out.println(" ");
        System.out.println("Задание №3");

        if (checkLeapYear == 0){
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        //Задание №4

        int deliveryDistance = 95;

        int distanceFree = 20;
        int distanceStep = 40;

        int deliveryDay = ((deliveryDistance - distanceFree) / distanceStep)+2;

        System.out.println(" ");
        System.out.println("Задание №4");

        if (deliveryDistance < distanceFree){
            System.out.println("Для доставки потребуется дней: 1");
        }
        else System.out.println("Для доставки потребуется дней: " + deliveryDay);

        //Задание №5

        int monthNumber = 7;

        System.out.println(" ");
        System.out.println("Задание №5");

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }






    }
}
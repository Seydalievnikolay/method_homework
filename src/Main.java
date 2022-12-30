import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printLeapYear(1992);
        applicationVersion(1, 2021);
        calculationDeliveryDays(17);
    }

    public static void definitionLeapYear(int years, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(years + " год является високосным");
        } else {
            System.out.println(years + " год не является високосным");
        }
    }

    private static void printLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        definitionLeapYear(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void applicationVersion(int OS, int yearOfRelease) {
        boolean deviceIsOld = isDeviceOld(yearOfRelease);
        System.out.print("Установите ");
        if (deviceIsOld) {
            System.out.print("облегченную");
        }
        System.out.print(" версию для ");
        if (OS == 0) {
            System.out.print("OS");
        } else {
            System.out.print("Android");
        }
    }

    private static boolean isDeviceOld(int yearOfRelease) {
        int currentYear = LocalDate.now().getYear();
        return yearOfRelease <= currentYear;
    }

    private static String calculationDeliveryDays(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDays <= 100) {
            deliveryDays++;
        } else if (deliveryDistance > 100) {
            return "Невозможно рассчитать срок доставки";
        }
        return "Потребуется дней для доставки" + deliveryDays;

    }
}
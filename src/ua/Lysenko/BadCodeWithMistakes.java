package ua.Lysenko;

import java.util.Scanner;

public class BadCodeWithMistakes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String firstName = scanner.next();
        System.out.println("Введите фамилию");
        String lastName = scanner.next();
        System.out.println("Введите возраст");
        String age = scanner.next();

        System.out.println(convertAgeToInteger(age));

//        Object obj = new java.util.Date();
//        Integer int1 = (Integer) obj; //тут специально создал эту строку чтобы вызвать исключение
        // здесь вылетит ClassCastException
        // можно проверить через class instanceof

        String[] person = new String[3];
        person[0] = firstName;
        person[1] = lastName;
        person[2] = age;
        printPerson(person);

        String[] notPerson = null;
        printPerson(notPerson);

    }

    public static int convertAgeToInteger(String age) {

        if (!age.equals("\\d+")) {
            return -1;
        } else {
            int ageNumbers = Integer.parseInt(age);
            return ageNumbers;
        }
    }

    public static void printPerson(String[] array) {
        if (array == null) {
            System.out.println("Array is null");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

}

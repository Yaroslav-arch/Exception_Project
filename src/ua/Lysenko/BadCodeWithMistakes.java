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
        // здесь выдаст NumberFormatException если вместо возраста ввести не число(точнее в 33 строке)

        Object obj = new java.util.Date();
        Integer int1 = (Integer) obj; //тут специально создал эту строку чтобы вызвать исключение
        // здесь вылетит ClassCastException

        String[] person = new String[3];
        person[0] = firstName;
        person[1] = lastName;
        person[2] = age;
        printPerson(person);

        String[] notPerson = null;
        printPerson(notPerson); //здесь будет NPE если исправить цикл

    }

    public static int convertAgeToInteger(String age) {
        //здесь надо проверить содержимое строки
        int ageNumbers = Integer.parseInt(age);
        return ageNumbers;
    }

    public static void printPerson(String[] array) {
        //здесь следует сделать проверку входящего массива на null
        for (int i = 0; i <= array.length; i++) { //здесь достаточно внимательно писать массив
            //здесь будет ArrayIndexOutOfBoundsException
            System.out.println(array[i]);
        }
    }

}

package HW11;

import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "pineapple", "strawberry", "melon", "cranberry", "apple", "orange", "grape", "watermelon", "melon"};
        Map<String, Integer> wordsCount = new HashMap<String, Integer>();


        HashSet<String> noDuplicates = new HashSet<String>(Arrays.asList(words));
        System.out.println(noDuplicates);
        for (String noDuplicate : words) {
                Integer count = wordsCount.getOrDefault(noDuplicate, 0);
                wordsCount.put(noDuplicate, count + 1);
        }
            System.out.println(wordsCount);


            // Задача 2;
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.addNewContact("89991010101", "Иванов");
            phoneBook.addNewContact("89998213132", "Петров");
            phoneBook.addNewContact("89921321444", "Соловьев");
            phoneBook.addNewContact("89991233212", "Иванов");

//       phoneBook.printPhoneBook();
//        phoneBook.getNumber("Иванов");


        }


}

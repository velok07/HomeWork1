package HW11;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
        Map<String, String> phoneBook = new HashMap<String, String>();



        public void addNewContact (String number, String surname){
            phoneBook.put(number, surname);

        }

        public void printPhoneBook(){
            System.out.println(phoneBook);

        }

        public void getNumber(String surname){
            Set<Map.Entry<String, String>> entries = phoneBook.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                if (surname == entry.getValue()){
                    System.out.println(entry.getKey() + " " + entry.getValue());

                }

            }
        }

    }


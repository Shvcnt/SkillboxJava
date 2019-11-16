import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main
{
    public static void main(String[] args)
    {
        TreeMap<String, String> adressBook = new TreeMap<>();
        adressBook.put("Коваленко А.С.", "79956000505");
        adressBook.put("Детинкина А.В.", "79956000506");
        adressBook.put("Юсов А.С.", "79956000507");
        adressBook.put("Коваленко К.С.", "79956000508");

        Scanner scanner = new Scanner(System.in);

        for (;;)
        {
            String nameOrPhone = scanner.nextLine();

            if (nameOrPhone.equalsIgnoreCase("LIST"))
            {
                printMap(adressBook);
                continue;
            }

            if (nameOrPhone.matches("\\D+"))
            {
                if (adressBook.containsKey(nameOrPhone))
                {
                    System.out.println(nameOrPhone + " => " + adressBook.get(nameOrPhone));
                }
                else
                {
                    System.out.println("Контакт не найден. Введите номер телефона в формате 79999999999 для записи нового" +
                            " контакта");
                    String entryPhoneNumber = scanner.nextLine();
                    adressBook.put(nameOrPhone, entryPhoneNumber);
                }
            }

            if (nameOrPhone.matches("\\d{11}"))
            {
                if (adressBook.containsValue(nameOrPhone))
                {
                    System.out.println("Номер есть в книге, но как вывести ключ я не знаю)))Т_Т");
                }
                else
                {
                    System.out.println("Номер телефона не найден. Введите ФИО для записи нового" +
                            " контакта");
                    String entryFio = scanner.nextLine();
                    adressBook.put(entryFio, nameOrPhone);
                }
            }

            else
            {
                System.out.println("Ошибка ввода");
            }

        }
    }

    public static void printMap (Map<String, String> map)
    {
        for (String key : map.keySet())
        {
            System.out.println(key + " => " + map.get(key));
        }
    }
}

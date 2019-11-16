import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите команду:" + "\n" +
                "1) LIST - вывод списка адресов;" + "\n" +
                "2) ADD и адрес электронной почты - добавление адреса в список.");

        Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");

        HashSet<String> emailAdress = new HashSet<>() {{
            add("Shvcnt@gmail.com");
            add("Nastya.detinkina@gmail.com");
            add("Blabla@gmail.com");
            add("Skillbox@gmail.com");
        }};

        for (; ; ) {

            Scanner scanner = new Scanner(System.in);

            String[] splitTextConsole = scanner.nextLine().split("\\s+");

            if (splitTextConsole[0].equalsIgnoreCase("LIST")) {
                if (splitTextConsole.length == 1) {
                    for (String emails : emailAdress)
                        System.out.println(emails);
                } else System.out.println("Вы ввели неверную команду.");
            }

            if (splitTextConsole[0].equalsIgnoreCase("ADD")) {
                if (splitTextConsole.length == 2) {
                    Matcher matcher = pattern.matcher(splitTextConsole[1]);
                    if (matcher.matches()) {
                        emailAdress.add(splitTextConsole[1]);
                        System.out.println("Адрес электронной почты успешно добавлен.");
                    } else {
                        System.out.println("Адрес электронной почты введен некорректно.");
                    }
                } else {
                    System.out.println("Вы ввели неверную команду.");
                }
            } else {
                System.out.println("Вы ввели неверную команду.");
            }
        }
    }
}


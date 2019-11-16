import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> todoList = new ArrayList<>();
        todoList.add("Купить собаке корм");
        todoList.add("Купить собаке фурмигатор");
        todoList.add("Уволиться с дурацкой работы");
        todoList.add("Поехать на зимнюю рыбалку");

        String commandList = "LIST";
        String commandAdd = "ADD";
        String commandEdit = "EDIT";
        String commandDelete = "DELETE";

        System.out.print("Введите одну из возможных команд:" + "\n");
        System.out.print("\t" + "LIST - вывести пронумерованный список дел" + "\n" +
                "\t" + "DELETE i (где i - это порядковый номер) - удалить дело под определенным номером" + "\n" +
                "\t" + "EDIT i (где i - это порядковый номер) + текст- корректировка дела под опредленным номером" + "\n" +
                "\t" + "ADD + текст - добавление нового дела в конец списка" + "\n" +
                "\t" + "ADD i (где i - это порядковый номер) + текст - добавление нового дела под опредленным номером" + "\n");

        for (;;)
        {
            Scanner scanner = new Scanner(System.in);
            String[] splitTextConsole = scanner.nextLine().split("\\s+");

            int valueParse = Integer.parseInt(splitTextConsole[1]);
            boolean isIndexValid = valueParse <= todoList.size();

            if (splitTextConsole[0].equalsIgnoreCase(commandList)) { // Команда LIST
                if (splitTextConsole.length == 1) {
                    for (int i = 0; i < todoList.size(); i++) {
                        System.out.println(i + " - " + todoList.get(i));
                        continue;
                    }
                }
                else {
                    printWrongCommand();
                }
            }

            if (splitTextConsole[0].equalsIgnoreCase(commandDelete)) // Команда DELETE
            {
                if (splitTextConsole.length == 2) {
                    if (isIndexValid) {
                        todoList.remove(valueParse);
                    }
                    else {
                        System.out.println("Команда введена неверно! В списке всего " + todoList.size() + " значени(я)й.");
                    }
                }
                else {
                    printWrongCommand();
                }
            }

            if (splitTextConsole[0].equalsIgnoreCase(commandEdit)) // Команда EDIT
            {
                if (splitTextConsole.length == 2) {
                    if (isIndexValid) {
                        todoList.set(valueParse, scanner.nextLine());
                    }
                    else {
                        System.out.println("Команда введена неверно! В списке всего " + todoList.size() + " значени(я)й.");
                    }
                }
                else {
                    printWrongCommand();
                }
            }

            if (splitTextConsole[0].equalsIgnoreCase(commandAdd)) // Комадна ADD
            {
                if (splitTextConsole.length == 2) {
                    if (isIndexValid) {
                        todoList.add(valueParse, scanner.nextLine());
                    }
                    else {
                        todoList.add(scanner.nextLine());
                    }
                } else {
                    printWrongCommand();
                }
            }
            else
            {
                printWrongCommand();
            }
        }
    }

    public static void printWrongCommand()
    {
        System.out.println("Команда введена неверно!");
    }
}

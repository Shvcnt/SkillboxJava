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

            if (splitTextConsole.length == 1) {
                if (splitTextConsole[0].equalsIgnoreCase(commandList)) { // Команда LIST
                    for (int i = 0; i < todoList.size(); i++) {
                            System.out.println(i + " - " + todoList.get(i));
                    }
                }
                if (splitTextConsole[0].equalsIgnoreCase(commandAdd)) { // Команда ADD
                    System.out.println("Введите дело, которое стоит добавить");
                    todoList.add(scanner.nextLine());
                }
            }

            if (splitTextConsole.length == 2)
            {
                if (splitTextConsole[1].matches("\\d+")) {

                    int valueParse = Integer.parseInt(splitTextConsole[1]);
                    boolean isIndexValid = valueParse <= todoList.size();

                    if (splitTextConsole[0].equalsIgnoreCase(commandDelete)) // Команда DELETE
                    {
                        if (isIndexValid) {
                            todoList.remove(valueParse);
                        }
                        else {
                            System.out.println("Команда введена неверно! В списке всего " + todoList.size()
                                    + " значени(я)й.");
                        }
                    }
                    if (splitTextConsole[0].equalsIgnoreCase(commandEdit)) // Команда EDIT
                    {
                        if (isIndexValid) {
                            System.out.println("Введите новое наименование дела");
                            todoList.set(valueParse, scanner.nextLine());
                        } else {
                            System.out.println("Команда введена неверно! В списке всего " + todoList.size()
                                    + " значени(я)й.");
                        }
                    }
                    if (splitTextConsole[0].equalsIgnoreCase(commandAdd)) // Комадна ADD
                    {
                        if (isIndexValid) {
                            System.out.println("Введите дело, которое стоит добавить");
                            todoList.add(valueParse, scanner.nextLine());
                        } else {
                            System.out.println("Новое дело будет добавлено в конец списка, т.к. в списке всего "
                                    + todoList.size() + " значени(я)й." + "\n" + "Введите дело, которое стоит добавить");
                            todoList.add(scanner.nextLine());
                        }
                    }
                }
                else {
                    printWrongCommand();
                }
            }
            else {
                printWrongCommand();
            }
        }
    }

    public static void printWrongCommand()
    {
        System.out.println("Команда введена неверно!");
    }
}

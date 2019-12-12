import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        NumberFormat numberFormat = new DecimalFormat("00");


        // A000АА01
        // А, В, Е, К, М, Н, О, Р, С, Т, У, Х

        String[] letterNumber = {"A", "B", "E", "K", "M", "H", "O", "P", "C", "T", "Y", "X"};
        String[] numberNumber = {"000", "111", "222", "333", "444", "555", "666", "777", "888", "999"};

        for (int k = 0; k < 12; k++) {
            for (int j = 0; j < 10; j++) {
                for (int i = 01; i <= 197; i++) {
                    String luxNumber = letterNumber[k] + numberNumber[j] + letterNumber[k] + letterNumber[k];
                    list.add(luxNumber + numberFormat.format(i));
//                    System.out.print(luxNumber);
//                    System.out.format("%02d%n", i);
                }
            }
        }

        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(list);
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(list);

        Scanner scanner = new Scanner(System.in);

        for (;;) {
            String enterNumber = scanner.nextLine();

            long start1 = System.currentTimeMillis();
            list.contains(enterNumber);
            System.out.println(System.currentTimeMillis() - start1);

            long start2 = System.currentTimeMillis();
            Collections.binarySearch(list, enterNumber);
            System.out.println(System.currentTimeMillis() -start2);

            long start3 = System.currentTimeMillis();
            hashSet.contains(enterNumber);
            System.out.println(System.currentTimeMillis() - start3);

            long start4 = System.currentTimeMillis();
            treeSet.contains(enterNumber);
            System.out.println(System.currentTimeMillis() - start4);
        }
    }
}

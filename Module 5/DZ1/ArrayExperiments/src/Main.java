import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");

        String colorsTemp;

        for (int i = 0; i < colors.length / 2; i++)
        {
            colorsTemp = colors[colors.length - 1 - i];
            colors[colors.length - 1 - i] = colors[i];
            colors[i] = colorsTemp;
        }

        for (int j = 0; j < colors.length; j++)
        {
            System.out.println(colors[j]);
        }


        System.out.println("====================================");


        float[] sickCount = new float[30];
        float average = 0;
        int healthyCount = 0;

        System.out.print("Температура пациентов в больнице: ");

        for (int i = 0; i < sickCount.length;i++)
        {
            sickCount[i] = 32 + (float) (8 * Math.random());

            System.out.print(sickCount[i] + ", ");

            average += sickCount[i];

            if (36.2 <= sickCount[i] && sickCount[i] <= 36.9)
                healthyCount++;
        }

        System.out.println("\n" + "Средняя температура по больнице: " + average / sickCount.length);

        System.out.println("Количество здоровых пациентов: " + healthyCount);


        System.out.println("====================================");


        String[][] arrayX = new String[7][7];

        for (int k = 0; k < arrayX.length; k++)
        {
            for (int n = 0; n < arrayX[0].length; n++)
            {
                if (n == k || n == arrayX[k].length - k - 1)
                    arrayX[k][n] = "X";
                else arrayX[k][n] = " ";
            }
        }

        for (int i = 0; i < arrayX.length; i++)
        {
            for (int j = 0; j < arrayX[i].length; j++)
            {
                System.out.print(arrayX[i][j]);
            }
            System.out.print("\n");
        }

    }
}

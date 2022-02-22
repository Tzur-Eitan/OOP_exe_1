package Ex1;

import java.util.Arrays;

public class SeasonUtil
{
    public static final Season[] SEASONS = Season.values();

    public static void sort(Comparable[] comparable)
    {
        Arrays.sort(comparable);
    }

    static String reportAll(Seasonable[] seasonables)
    {
        String data = seasonables[0].toString();

        for (int i = 1; i < seasonables.length; i++)
        {
            data += "\n";
            data += seasonables[i].toString();
        }

        return data;
    }
}

/**
 * * @author Mark Blankson-Hemans
 * CMPT 220
 * Juan Arias
 * Problem (13.3)
 */
import java.util.ArrayList;

public class prob_13_3 {
     
    public static void sort(ArrayList<Integer> list)
     {
         
        for (int i = 0; i < list.size() - 1; i++)
        {
            int min = list.get(i);
            int index = i;

            for (int j = i + 1; j < list.size(); j++)
            {
                if (min > list.get(j))
                {
                    min = list.get(j);
                    index = j;
                }
            }

            if (index != i)
            {
                list.set(index, list.get(i));
                list.set(i, min);
            }
        }

    }
}
    


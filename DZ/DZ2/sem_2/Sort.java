package DZ.DZ2.sem_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sort {
    private static final Logger LOG = Log.log(Sort.class.getName());

    public static String getSort(int[] someArray) {
        int count = 0;
        int temp = someArray[0];
        for (int i = 0; i < someArray.length - 1; i++) {
            LOG.log(Level.INFO, "Big iteration " + (i+1));
            for (int j = 0; j < someArray.length - 1 - i; j++) {
                LOG.log(Level.INFO, "Small iteration "+(++count));
                if (someArray[j + 1] < someArray[j]) {
                    temp = someArray[j];
                    someArray[j] = someArray[j + 1];
                    someArray[j + 1] = temp;
                    LOG.log(Level.INFO, "Yes");
                }
            }
        }
        System.out.println(Arrays.toString(someArray));
        String result = Arrays.toString(someArray);
        Sort.writeMyFile(result);
        return result;
    }

    public static void writeMyFile(String arg) {
        try (FileWriter in = new FileWriter("SortArray.txt");) {
            in.append(arg);
        } catch (IOException a) {
            throw new RuntimeException(a);
        }
    }
}

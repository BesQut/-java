package DZ.DZ2;

import java.util.Scanner;
import java.util.Arrays;

import DZ.DZ2.sem_2.Divide;
import DZ.DZ2.sem_2.Sort;

public class Main2 {
    private Scanner in = new Scanner(System.in);
    public static void main(String args[]) {
        int[] Array = {8, 8, 7, 3, 5, 22, 9, 1, 26, 15};
        Sort.getSort(Array);
        String words = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка$\":\"5\",\"предмет\":\"Физика\"}]";
        StringBuilder[] myBuilder = Divide.getStringBuilderArray(words);
        System.out.println(Arrays.toString(myBuilder));
    }
}
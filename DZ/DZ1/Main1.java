package DZ.DZ1;
import java.util.Scanner;

import DZ.DZ1.Seminar_1.DZ_1_1;
import DZ.DZ1.Seminar_1.DZ_1_2;

public class Main1 {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Первая задача");
        int nums = in.nextInt();
        System.out.println(DZ_1_1.runNow(nums));
        System.out.println("Вторая задача");
        int numbers = in.nextInt();
        DZ_1_2.SimpleNums(numbers);
    }
}

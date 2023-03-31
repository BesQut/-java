package DZ.Seminar_1;

public class DZ_1_1 {
    public static int runNow(int nums) {
        int result = 1;
        for (int i = 1; i <= nums; i++){
            result = result * i;
        }
        return result;
    }
}

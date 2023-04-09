package DZ.DZ1.Seminar_1;

public class DZ_1_2 {
    public static void SimpleNums(int numbers){
        for(int i = 2; i <= numbers; i ++){
            boolean b = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    b = false;
                    break;
                }
            }
            if(b){
                System.out.println(i);
            }
        }
    }
}

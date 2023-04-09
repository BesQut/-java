package DZ.DZ2.sem_2;

public class Divide {
    public static StringBuilder[] getStringBuilderArray(String words) {

        System.out.println(words);
        String[] word = words.split("},");
        String[][] people = new String[word.length][];
        for (int i = 0; i < word.length; i++) {
            word[i] = word[i].replace("[", "");
            word[i] = word[i].replace("]", "");
            word[i] = word[i].replace("{", "");
            word[i] = word[i].replace("}", "");
            people[i] = word[i].split(",");
        }
        StringBuilder[] result = new StringBuilder[people.length];
        for (int i = 0; i < people.length; i++) {
            result[i] = new StringBuilder("Студент 1 получил 2 по предмету 3");
            for (int j = 0; j < people[0].length; j++) {
                people[i][j] = people[i][j].replace("\"","");
                int indexStart = people[i][j].indexOf(":");
                people[i][j]=people[i][j].substring(indexStart+1);
            }
            int fistPlace = result[i].indexOf("1");
            result[i].delete(fistPlace ,fistPlace +1);
            result[i].insert(fistPlace ,people[i][0]);
            int secondPlace = result[i].indexOf("2");
            result[i].delete(secondPlace,secondPlace+1);
            result[i].insert(secondPlace,people[i][1]);
            int thirdPlace = result[i].indexOf("3");
            result[i].delete(thirdPlace,thirdPlace+1);
            result[i].insert(thirdPlace,people[i][2]);

        }
return result;
    }

}


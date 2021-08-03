package arrays;

public class MultidimentionalArrays {
    public static void main(String[] args) {
        int[][] matrice = {{1,2,3},
                           {4,5,6},
                           {6,7,8},
                           {9,10,11}}; //  у нас здесь массив массивов т.е. 4 одномерных массива
        System.out.println(matrice[3][2]); /* в первых скобках мы обращаемся к номеру массива ( у нас 4 массива поэтому
         [3], последнее число 11 стои под индесом 2*/

        String[][] strings = {{"Hello java world","I am a doctor","I am a teacher"},
                               {"Hello My Friend","I am a student","I am a man"},
                               {"Hello my dog","A cup of coffee","A glass of wine"}};

        for (int i=0;i<strings.length;i++){// это внешний цикл
            for (int j =0;j<strings.length;j++){
                System.out.print(strings[i][j]+" ,");
            }
            System.out.println();
        }
    }
}

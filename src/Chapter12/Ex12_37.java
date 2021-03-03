package Chapter12;

import java.util.Arrays;

//12.37. В двумерном массиве хранится информация о количестве учеников в каждом классе каждой параллели школы с первой
//        по одиннадцатую (в первой стро-ке — информация о классах первой параллели, во второй — второй паралле-ли и т. д.).
//        В каждой параллели школы имеются четыре класса. Определить общее число учеников в параллели 5-х классов.
public class Ex12_37 {
    public static void main(String[] args) {
        int[][] school = {{22,21,21},{25,24,31},{26,27,28},{22,21,21},{1,2,3},{22,21,21},{22,21,21},{22,21,21},{22,21,21},{22,21,21},{22,21,21}};
        for (int[] i:school){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("///");
        System.out.println(Arrays.stream(school[4]).sum());
    }
}
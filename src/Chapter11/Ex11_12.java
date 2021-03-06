package Chapter11;

//11.12.* Заполнить массив:
//        а) двадцатью первыми натуральными числами, делящимися нацело на 13 или на 17 и
//        находящимися в интервале, левая граница которого равна 300;
//        б) тридцатью первыми простыми числами (простым называется натураль-ное число,
//        большее 1, не имеющее других делителей, кроме единицы и са-мого себя).
public class Ex11_12 {
    public static void main(String[] args) {
        int a = 300;
        int[] array = new int[20];
        int count = 0;
        while (count < 20) {
            if (a % 13 == 0 || a % 17 == 0) {
                array[count] = a;
                count++;
            }
            a++;
        }
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}

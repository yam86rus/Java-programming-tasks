package Chapter11;
//11.27. В массиве хранятся сведения о количестве осадков,
//        выпавших за каждый день сентября. Определить, сколько осадков выпадало в среднем за один день
//        в первую, вторую и третью декады этого месяца.
public class Ex11_27 {
    public static void main(String[] args) {
        double[] a = {4, 3, 2, 4, 3, 2, 5, 6, 4, 2, 3, 2, 4, 5, 3, 2, 4, 5, 3, 2, 4, 5, 6, 3, 2, 6, 4, 5, 2, 3};
        double d1 = 0, d2 = 0, d3 = 0;
        for (int i = 0; i <= a.length / 3 - 1; i++) {
            d1 += a[i];
            d2 += a[i + 10];
            d3 += a[i + 20];
        }
        System.out.println("средняя норма первая декада " + d1/10);
        System.out.println("средняя норма вторая декада " + d2/10);
        System.out.println("средняя норма третья декада " + d3/10);
    }
}
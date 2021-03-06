package Chapter9;

//9.178. Дано предложение. Напечатать все его слова, предварительно преобразовав каждое из них по следующему правилу:
//        а) заменить первую встреченную букву a на о;
//        б) удалить из слова все вхождения последней буквы (кроме нее самой);
//        в) оставить в слове только первые вхождения каждой буквы;
//        г) в самом длинном слове удалить среднюю (средние) буквы. Принять, что такое слово — единственное.
public class Ex9_178 {
    static void foo1(String str) {
        System.out.println(str.replaceFirst("а", "o"));
    }

    static void foo2(String str) {
        char lastChar = str.charAt(str.length() - 1);
        str = str.replaceAll("" + lastChar, "");
        str += lastChar;
        System.out.println(str);
    }

    static void foo3(String str) {
        String[] arr = str.split(" ");
        // TODO Додумать и доделать
    }

    public static void main(String[] args) {
        String s1 = "Напечатать все его слова, предварительно преобразовав каждое из них по следующему правилу";
        foo1(s1);
        String s2 = "Напечатать все его слова, предварительно преобразовав каждое из них по следующему правилу";
        foo2(s2);
        String s3 = "Напечатать все его слова, предварительно преобразовав каждое из них по следующему правилу";
        foo3(s3);
        String s4 = "Напечатать все его слова, предварительно преобразовав каждое из них по следующему правилу";

    }
}

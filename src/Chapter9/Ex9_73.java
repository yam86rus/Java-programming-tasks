package Chapter9;

//9.73. Дано предложение, в котором имеются буквы с и Т. Определить, какая из них
//        встречается позже (при просмотре слова слева направо). Если таких букв несколько,
//        то должны учитываться последние из них. Оператор цикла с условием не использовать.
public class Ex9_73 {
    public static void main(String[] args) {
        String s = "Дано с предложение, в котором имеются буквы с и Т.";
        String s1 = new StringBuilder(s).reverse().toString();
        int a = s1.indexOf("с");
        int b = s1.indexOf("Т");
        if (a < b) {
            System.out.println("Последняя встречающаяся буква в предложении  из букв с и Т - это буква с, ");
        } else if (b < a) {
            System.out.println("Последняя встречающаяся буква в предложении  из букв с и Т - это буква Т, ");
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Введите предложение без заглавных букв");
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        lCompare(x);
    }
    public static void lCompare(String string) {
        char[] vowel = {'а','е','ё','и','о','у','ы','э','ю','я'};
        char[] consonant = {'б','в','г','д','ж','з','к','й','л','м','н','п','р','с','т','ф','х','ц','ч','ш','щ'};
        char[] letters = string.toCharArray();
        String vowLet = "";
        String conLet = "";
        for (int i=0; i <= letters.length-1; i++) {
            for (int j=0; j < vowel.length-1; j++) {
                if (letters[i] == vowel[j]) {
                    vowLet= vowLet + letters[i];
                }
            }
            for (int j=0; j< consonant.length-1; j++) {
                if (letters[i] == consonant[j]) {
                    conLet = conLet + letters[i];
                }
            }
        }
        char[] vowLet1 = vowLet.toCharArray();
        char[] conLet1 = conLet.toCharArray();
        System.out.println(vowLet1);
        System.out.println(conLet1);
        if (vowLet1.length > conLet1.length) {
            System.out.println("Гласных букв больше");
        }
        else if (conLet1.length > vowLet1.length) {
            System.out.println("Согласных букв больше");
        }
        else {
            System.out.println("Количество букв равно");
        }
    }
}

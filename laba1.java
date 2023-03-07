import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // введення множин
        System.out.print("Введіть першу множину: ");
        String[] set1Input = scanner.nextLine().split("\\s+");
        Set<String> set1 = new HashSet<>();
        for (String s : set1Input) {
            set1.add(s);
        }

        System.out.print("Введіть другу множину: ");
        String[] set2Input = scanner.nextLine().split("\\s+");
        Set<String> set2 = new HashSet<>();
        for (String s : set2Input) {
            set2.add(s);
        }

        // знаходження різниці
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);

        // виведення результату
        System.out.println("Різниця множин: " + difference);
    }
}
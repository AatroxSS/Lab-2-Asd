import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== ХЕШ-ТАБЛИЦЯ (ПРЯМОКУТНИКИ) ==========");
        System.out.print("Введіть розмір хеш-таблиці: ");
        int tableSize = scanner.nextInt();

        HashTable hashTable = new HashTable(tableSize);

        System.out.println("\n========== ВСТАВКА ЕЛЕМЕНТІВ ==========");

        hashTable.insert(new Rectangle(0, 10, 5, 0));
        hashTable.insert(new Rectangle(0, 8, 4, 0));
        hashTable.insert(new Rectangle(0, 6, 4, 0));
        hashTable.insert(new Rectangle(0, 12, 6, 0));
        hashTable.insert(new Rectangle(0, 5, 2, 0));
        hashTable.insert(new Rectangle(0, 20, 10, 0));

        System.out.println("\n--- Спроба додати елемент, який створить колізію ---");
        hashTable.insert(new Rectangle(0, 7, 3, 0));

        System.out.println("\n========== РЕЗУЛЬТАТ ==========");
        hashTable.display();

        scanner.close();
    }
}

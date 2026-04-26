public class HashTable {
    private Rectangle[] table;
    private int size;
    private int collisions;

    public HashTable(int size) {
        this.size = size;
        this.table = new Rectangle[size];
        this.collisions = 0;
    }

    private int hashFunction(int key) {
        return key % size;
    }

    public boolean insert(Rectangle rect) {
        int key = rect.getKey();
        int index = hashFunction(key);

        if (table[index] == null) {
            table[index] = rect;
            System.out.printf("✅ Вставлено: ключ=%d → позиція=%d%n", key, index);
            return true;
        } else {
            collisions++;
            System.out.printf("❌ Колізія! Ключ=%d, позиція=%d вже зайнята. Елемент НЕ додано.%n", key, index);
            return false;
        }
    }

    public void display() {
        System.out.println("\n========== ВМІСТ ХЕШ-ТАБЛИЦІ ==========");
        for (int i = 0; i < size; i++) {
            if (table[i] == null) {
                System.out.printf("%3d | [порожньо]%n", i);
            } else {
                int key = table[i].getKey();
                System.out.printf("%3d | ключ=%d | %s%n", i, key, table[i].toString());
            }
        }
        System.out.println("=======================================");
        System.out.println("Кількість колізій: " + collisions);
    }

    public boolean isEmpty() {
        for (int i = 0; i < size; i++) {
            if (table[i] != null) return false;
        }
        return true;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            if (table[i] == null) return false;
        }
        return true;
    }
}

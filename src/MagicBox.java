import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    private int size;
    private String name;
    private T[] items;

    public MagicBox(String name, int size) {
        this.name = name;
        this.size = size;
        this.items = (T[]) new Object[this.size];
    }

    public boolean add(T item) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                this.items[i] = item;
                return true;
            }
        }
        System.out.println("Не успешно");
        return false;
    }

    public T pick() {
        int emptyCell = 0;
        int randomInt = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                emptyCell++;
            }
        }
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                throw new RuntimeException("Коробка " + this.name + " не полна! Количество ячеек которые необходимо заполнить = " + emptyCell);
            } else {
                Random random = new Random();
                randomInt = random.nextInt(this.size);
            }
        }
        return this.items[randomInt];
    }

    public void getItems() {
        System.out.println(Arrays.toString(this.items));
        }
}




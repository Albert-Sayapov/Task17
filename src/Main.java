public class Main {
    public static void main(String[] args) {

        MagicBox<Integer> magicBox = new MagicBox<>("Коробка №1", 8);
        magicBox.add(2);
        magicBox.add(5);
        magicBox.add(10);
        magicBox.add(100);
        magicBox.add(20);
        magicBox.add(50);
        magicBox.add(1043);
        magicBox.add(10067);
        magicBox.getItems();
        System.out.println("Случайный элемент - " + magicBox.pick());


        MagicBox<String> magicBox1 = new MagicBox<>("Коробка №2", 6);
        magicBox1.add("Петя");
        magicBox1.add("Оля");
        magicBox1.add("Саша");
        magicBox1.add("Таня");
        //magicBox1.add("Вася");
        //magicBox1.add("Женя");
        magicBox1.getItems();
        System.out.println(magicBox1.pick());

    }
}

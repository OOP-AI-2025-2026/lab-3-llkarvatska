package org.example.task2;

public class Main {
    public static void main(String[] args) {

        // ================================
        // Завдання 1: Клас Box
        // ================================
        Box box = new Box(2, 3, 4);
        System.out.println("Об'єм коробки: " + box.getVolume());
        System.out.println("Площа поверхні: " + box.getSurfaceArea());
        System.out.println("Площа бічної поверхні: " + box.getLateralSurfaceArea());

        // ================================
        // Завдання 2: Item, Cart, Order
        // ================================
        System.out.println("\n--- Робота з кошиком та замовленням ---");

        Cart cart = new Cart(new Item[10]);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeById(9);
        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        // ================================
        // Завдання 3: IntStack
        // ================================
        System.out.println("\n--- Робота зі стеком ---");

        IntStack stack = new IntStack();

        // додаємо елементи
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Верхній елемент (peek): " + stack.peek()); // 30
        System.out.println("Розмір стека: " + stack.size()); // 3

        // дістаємо елементи
        System.out.println("pop(): " + stack.pop()); // 30
        System.out.println("pop(): " + stack.pop()); // 20

        System.out.println("Чи стек порожній? " + stack.isEmpty()); // false
        System.out.println("Розмір стека: " + stack.size()); // 1

        // очистка
        stack.clear();
        System.out.println("Після clear(), чи стек порожній? " + stack.isEmpty()); // true
    }
}

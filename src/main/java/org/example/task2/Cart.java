package org.example.task2;

import java.util.Arrays;

public class Cart {

    private Item[] contents;
    private int index;

    public Cart(Item[] contents) {
        this.contents = contents;
        this.index = 0;
    }

    public void add(Item item) {
        if (isCartFull()) return;
        contents[index] = item;
        index++;
    }

    public void removeById(long itemId) {
        if (index == 0) return;

        int foundItemIndex = findItemInArray(itemId);
        if (foundItemIndex == -1) return;

        shiftArray(foundItemIndex);
    }

    private void shiftArray(int itemIndex) {
        for (int i = itemIndex; i < index - 1; i++) {
            contents[i] = contents[i + 1];
        }
        contents[index - 1] = null;
        index--;
    }

    private int findItemInArray(long itemId) {
        for (int i = 0; i < index; i++) {
            if (contents[i].getId() == itemId) {
                return i;
            }
        }
        return -1;
    }

    public boolean isCartFull() {
        return index == contents.length;
    }

    public int getSize() {
        return index;
    }

    public Item[] getItems() {
        return Arrays.copyOf(contents, index);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "contents=" + Arrays.toString(getItems()) +
                '}' + "\n";
    }
}
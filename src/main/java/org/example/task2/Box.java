package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    // Конструктор
    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    // Приватні сеттери з перевіркою
    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Довжина повинна бути більше 0");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина повинна бути більше 0");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Висота повинна бути більше 0");
        }
        this.height = height;
    }

    // Об'єм
    public double getVolume() {
        return length * width * height;
    }

    // Повна площа поверхні
    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    // Площа бічної поверхні (периметр основи * висота = 2*(length+width)*height)
    public double getLateralSurfaceArea() {
        return 2 * (length + width) * height;
    }
}

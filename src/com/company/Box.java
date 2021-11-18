package com.company;

import java.util.List;

public class Box <T> implements Comparable {
    double width;
    double length;
    String material;
    T color;

    public Box(T color) {
        this.width = 5;
        this.length = 5;
        this.material = "cardboard";
        this.color =  color;
    }
    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", length=" + length +
                ", material=" + material +
                ", color=" + color +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int compared = ((Box)o).color.toString().length();
        return this.color.toString().length() - compared;
    }
}

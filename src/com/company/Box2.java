package com.company;

public class Box2 {
    String box2;
    Color color;

    public Box2(String box2, Color color) {
        this.box2 = box2;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Box2{" +
                "box2='" + box2 + '\'' +
                ", color=" + color +
                '}';
    }
}

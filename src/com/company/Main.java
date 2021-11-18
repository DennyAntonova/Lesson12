package com.company;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Box one = new Box(Color.WHITE);
        Box three = new Box(Color.GREEN);
        Box four = new Box(Color.RED);
        ArrayList<Box> bulgarianFlag = new ArrayList<>();
        bulgarianFlag.add(one);
        bulgarianFlag.add(four);
        bulgarianFlag.add(three);

        Box five = new BoxWithLocker(Color.BLACK, "Keys", "lock");
        Box six = new WaterproofBox(Color.BLUE, "Biotic");
        Box seven = new Box(Color.WHITE);
        Box eight = new BoxWithLocker("golden", "keys", "unlock");
        Box nine = new Box(Color.RED);
        Box ten = new WaterproofBox(Color.BLACK, "Biotic");

        ArrayList <Box> newBox = new ArrayList<>();
        newBox.add(five);
        newBox.add(six);
        newBox.add(seven);
        newBox.add(eight);
        newBox.add(nine);
        newBox.add(ten);

        Box two = new Box("pink");

        System.out.println(one);
        System.out.println(two);

        System.out.println(bulgarianFlag);
        Collections.sort(bulgarianFlag);
        System.out.println(bulgarianFlag);
        Collections.sort(newBox);
        Collections.sort(newBox);
        System.out.println(newBox);
    }


}

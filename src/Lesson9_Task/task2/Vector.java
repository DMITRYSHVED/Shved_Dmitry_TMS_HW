package Lesson9_Task.task2;

import java.util.ArrayList;
import java.util.Random;

public class Vector {

    Random random = new Random();
    private ArrayList<Double> coordinates = new ArrayList<>();
    private static final String DESCRIPTION = "Это вектор для произвольной системы координат:";

    public Vector(double... coordinates) {
        for (int i = 0; i < coordinates.length; i++) {
            this.coordinates.add(coordinates[i]);
        }
    }

    public ArrayList<Double> getCoordinates() {
        return coordinates;
    }

    @Override
    public boolean equals(Object object) {
        Vector otherVector = (Vector) object;
        boolean compare = true;
        if (otherVector.coordinates.size() == coordinates.size()) {
            for (int i = 0; i < coordinates.size(); i++) {
                if (coordinates.get(i) != otherVector.coordinates.get(i)) {
                    compare = false;
                }
            }
        } else {
            compare = false;
        }
        return compare;
    }

    public String toString() {
        System.out.println(DESCRIPTION);
        System.out.print("(");
        for (int i = 0; i < coordinates.size(); i++) {
            if (i == coordinates.size() - 1) {
                System.out.print(coordinates.get(i));
                continue;
            }
            System.out.print(coordinates.get(i) + ",");
        }
        System.out.print(")");
        return "";
    }
}

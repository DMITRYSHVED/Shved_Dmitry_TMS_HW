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


    public static double findVectorLength(Vector vector) {
        double length = 0;
        for (int i = 0; i < vector.getCoordinates().size(); i++) {
            length = length + Math.pow(vector.getCoordinates().get(i), 2);
        }
        return Math.sqrt(length);
    }

    public static double findScalar(Vector firstVector, Vector secondVector) {
        double scalarProduct = 0;
        if (firstVector.getCoordinates().size() == secondVector.getCoordinates().size()) {
            for (int i = 0; i < firstVector.getCoordinates().size(); i++) {
                scalarProduct = scalarProduct + firstVector.getCoordinates().get(i) * secondVector.getCoordinates().get(i);
            }
        } else {
            scalarProduct = -1;
            System.out.println("Размерность векторов не позволяет их перемножить");
        }
        return scalarProduct;
    }

    public static Vector vectorAddition(Vector firstVector, Vector secondVector) {
        Vector otherVector = new Vector();
        if (firstVector.getCoordinates().size() == secondVector.getCoordinates().size()) {
            for (int i = 0; i < firstVector.getCoordinates().size(); i++) {
                otherVector.getCoordinates().add(firstVector.
                        getCoordinates().get(i) + secondVector.getCoordinates().get(i));
            }
        } else {
            System.out.println("Размерность векторов не позволяет их складывать");
        }
        return otherVector;
    }

    public static Vector vectorSubtraction(Vector firstVector, Vector secondVector) {
        Vector otherVector = new Vector();
        if (firstVector.getCoordinates().size() == secondVector.getCoordinates().size()) {
            for (int i = 0; i < firstVector.getCoordinates().size(); i++) {
                otherVector.getCoordinates().add(firstVector.getCoordinates().get(i)
                        - secondVector.getCoordinates().get(i));
            }
        } else {
            System.out.println("Размерность векторов не позволяет их складывать");
        }
        return otherVector;
    }

    public static Vector[] returnVectors(int n) {
        Random random = new Random();
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < vectors.length; i++) {
            Vector vector = new Vector(random.nextDouble(10), random.nextDouble(10));
            vectors[i] = vector;
        }
        return vectors;
    }

    public static void compareVectors(Vector firstVector, Vector secondVector) {
        if (firstVector.equals(secondVector)) {
            System.out.println("Векторы равны");
        } else {
            System.out.println("Векторы не равны");
        }
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

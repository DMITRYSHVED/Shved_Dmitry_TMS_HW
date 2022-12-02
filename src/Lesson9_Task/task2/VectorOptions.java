package Lesson9_Task.task2;

import java.util.Random;

public class VectorOptions {

    public double findVectorLength(Vector vector) {
        double length = 0;
        for (int i = 0; i < vector.getCoordinates().size(); i++) {
            length = length + Math.pow(vector.getCoordinates().get(i), 2);
        }
        return Math.sqrt(length);
    }

    public double findScalar(Vector firstVector, Vector secondVector) {
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

    public Vector vectorAddition(Vector firstVector, Vector secondVector) {
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

    public Vector vectorSubtraction(Vector firstVector, Vector secondVector) {
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

    public void compareVectors(Vector firstVector, Vector secondVector) {
        if (firstVector.equals(secondVector)) {
            System.out.println("Векторы равны");
        } else {
            System.out.println("Векторы не равны");
        }
    }
}

package Lesson9_Task.Task1;

import java.util.Random;

public class OptionsTwoD {

    public double findVectorLength(VectorTwoD vector) {
        double length;
        length = Math.sqrt(Math.pow(vector.getCoordinateX(), 2) + Math.pow(vector.getCoordinateY(), 2));
        return length;
    }

    public double findScalar(VectorTwoD firstVector, VectorTwoD secondVector) {
        double scalarProduct;
        scalarProduct = firstVector.getCoordinateX() * secondVector.getCoordinateX() + firstVector.getCoordinateY()
                * secondVector.getCoordinateY();
        return scalarProduct;
    }

    public VectorTwoD vectorAddition(VectorTwoD firstVector, VectorTwoD secondVector) {
        double sumVectorX;
        double sumVectorY;
        sumVectorX = firstVector.getCoordinateX() + secondVector.getCoordinateX();
        sumVectorY = firstVector.getCoordinateY() + secondVector.getCoordinateY();
        VectorTwoD vector = new VectorTwoD(sumVectorX, sumVectorY);
        return vector;
    }

    public VectorTwoD vectorSubtraction(VectorTwoD firstVector, VectorTwoD secondVector) {
        double minusVectorX;
        double minusVectorY;
        minusVectorX = firstVector.getCoordinateX() - secondVector.getCoordinateX();
        minusVectorY = firstVector.getCoordinateY() - secondVector.getCoordinateY();
        VectorTwoD vector = new VectorTwoD(minusVectorX, minusVectorY);
        return vector;
    }

    public static VectorTwoD[] returnVectors(int n) {
        Random random = new Random();
        VectorTwoD[] vectors = new VectorTwoD[n];
        for (int i = 0; i < vectors.length; i++) {
            VectorTwoD vector = new VectorTwoD(random.nextDouble(10), random.nextDouble(10));
            vectors[i] = vector;
        }
        return vectors;
    }

    public void compareVectors(VectorTwoD firstVector, VectorTwoD secondVector) {
        if (firstVector.equals(secondVector)) {
            System.out.println("Векторы равны");
        } else {
            System.out.println("Векторы не равны");
        }
    }
}

package Lesson9_Task.Task1;

import java.util.Random;

public class OptionsThreeD {

    public double findVectorLength(VectorThreeD vector) {
        double length;
        length = Math.sqrt(Math.pow(vector.getCoordinateX(), 2) + Math.pow(vector.getCoordinateY(), 2) +
                Math.pow(vector.getCoordinateZ(), 2));
        return length;
    }

    public double findScalar(VectorThreeD firstVector, VectorThreeD secondVector) {
        double scalarProduct;
        scalarProduct = firstVector.getCoordinateX() * secondVector.getCoordinateX() + firstVector.getCoordinateY()
                * secondVector.getCoordinateY() + firstVector.getCoordinateZ() * secondVector.getCoordinateZ();
        return scalarProduct;
    }

    public VectorThreeD vectorAddition(VectorThreeD firstVector, VectorThreeD secondVector) {
        double sumVectorX;
        double sumVectorY;
        double sumVectorZ;
        sumVectorX = firstVector.getCoordinateX() + secondVector.getCoordinateX();
        sumVectorY = firstVector.getCoordinateY() + secondVector.getCoordinateY();
        sumVectorZ = firstVector.getCoordinateZ() + secondVector.getCoordinateZ();
        VectorThreeD vector = new VectorThreeD(sumVectorX, sumVectorY, sumVectorZ);
        return vector;
    }

    public VectorThreeD vectorSubtraction(VectorThreeD firstVector, VectorThreeD secondVector) {
        double minusVectorX;
        double minusVectorY;
        double minusVectorZ;
        minusVectorX = firstVector.getCoordinateX() - secondVector.getCoordinateX();
        minusVectorY = firstVector.getCoordinateY() - secondVector.getCoordinateY();
        minusVectorZ = firstVector.getCoordinateZ() - secondVector.getCoordinateZ();
        VectorThreeD vector = new VectorThreeD(minusVectorX, minusVectorY, minusVectorZ);
        return vector;
    }

    public static VectorThreeD[] returnVectors(int n) {
        Random random = new Random();
        VectorThreeD[] vectors = new VectorThreeD[n];
        for (int i = 0; i < vectors.length; i++) {
            VectorThreeD vector = new VectorThreeD(random.nextDouble(10), random.nextDouble(10),
                    random.nextDouble(10));
            vectors[i] = vector;
        }
        return vectors;
    }

    public void compareVectors(VectorThreeD firstVector, VectorThreeD secondVector) {
        if (firstVector.equals(secondVector)) {
            System.out.println("Векторы равны");
        } else {
            System.out.println("Векторы не равны");
        }
    }
}

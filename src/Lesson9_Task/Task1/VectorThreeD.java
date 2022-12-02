package Lesson9_Task.Task1;

import java.util.Random;

public class VectorThreeD {

    private double coordinateX;
    private double coordinateY;
    private double coordinateZ;
    private static final String DESCRIPTION = "Это вектор для трехмерной системы координат:";

    public VectorThreeD(double coordinateX, double coordinateY, double coordinateZ) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public double getCoordinateZ() {
        return coordinateZ;
    }

    public static double findVectorLength(VectorThreeD vector) {
        double length;
        length = Math.sqrt(Math.pow(vector.getCoordinateX(), 2) + Math.pow(vector.getCoordinateY(), 2) +
                Math.pow(vector.getCoordinateZ(), 2));
        return length;
    }

    public static double findScalar(VectorThreeD firstVector, VectorThreeD secondVector) {
        double scalarProduct;
        scalarProduct = firstVector.getCoordinateX() * secondVector.getCoordinateX() + firstVector.getCoordinateY()
                * secondVector.getCoordinateY() + firstVector.getCoordinateZ() * secondVector.getCoordinateZ();
        return scalarProduct;
    }

    public static VectorThreeD vectorAddition(VectorThreeD firstVector, VectorThreeD secondVector) {
        double sumVectorX;
        double sumVectorY;
        double sumVectorZ;
        sumVectorX = firstVector.getCoordinateX() + secondVector.getCoordinateX();
        sumVectorY = firstVector.getCoordinateY() + secondVector.getCoordinateY();
        sumVectorZ = firstVector.getCoordinateZ() + secondVector.getCoordinateZ();
        VectorThreeD vector = new VectorThreeD(sumVectorX, sumVectorY, sumVectorZ);
        return vector;
    }

    public static VectorThreeD vectorSubtraction(VectorThreeD firstVector, VectorThreeD secondVector) {
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

    public static void compareVectors(VectorThreeD firstVector, VectorThreeD secondVector) {
        if (firstVector.equals(secondVector)) {
            System.out.println("Векторы равны");
        } else {
            System.out.println("Векторы не равны");
        }
    }

    @Override
    public boolean equals(Object object) {
        VectorThreeD otherVector = (VectorThreeD) object;
        return (getCoordinateX() == otherVector.getCoordinateX() && getCoordinateY() == otherVector.getCoordinateY()
                && getCoordinateZ() == otherVector.getCoordinateZ());
    }

    @Override
    public String toString() {
        return DESCRIPTION + "(" + getCoordinateX() + "," + getCoordinateY() + "," + getCoordinateZ() + ") ";
    }
}

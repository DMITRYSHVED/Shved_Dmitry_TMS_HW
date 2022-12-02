package Lesson9_Task.Task1;

import java.util.Random;

public class VectorTwoD {
    private double coordinateX;
    private double coordinateY;
    private static final String DESCRIPTION = "Это вектор для двумерной системы координат:";

    public VectorTwoD(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public double findVectorLength(VectorTwoD vector) {
        double length;
        length = Math.sqrt(Math.pow(vector.coordinateX, 2) + Math.pow(vector.coordinateY, 2));
        return length;
    }

    public double findScalar(VectorTwoD firstVector, VectorTwoD secondVector) {
        double scalarProduct;
        scalarProduct = firstVector.coordinateX * secondVector.coordinateX + firstVector.coordinateY * secondVector.coordinateY;
        return scalarProduct;
    }

    public VectorTwoD vectorAddition(VectorTwoD firstVector, VectorTwoD secondVector) {
        double sumVectorX;
        double sumVectorY;
        sumVectorX = firstVector.coordinateX + secondVector.coordinateX;
        sumVectorY = firstVector.coordinateY + secondVector.coordinateY;
        VectorTwoD vector = new VectorTwoD(sumVectorX, sumVectorY);
        return vector;
    }

    public VectorTwoD vectorSubtraction(VectorTwoD firstVector, VectorTwoD secondVector) {
        double minusVectorX;
        double minusVectorY;
        minusVectorX = firstVector.coordinateX - secondVector.coordinateX;
        minusVectorY = firstVector.coordinateY - secondVector.coordinateY;
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
    @Override
    public boolean equals(Object object){
        VectorTwoD otherVector = (VectorTwoD) object;
        return (getCoordinateX()==otherVector.getCoordinateX()&&getCoordinateY()==otherVector.getCoordinateY());
    }
    @Override
    public String toString() {
        return DESCRIPTION + "(" + getCoordinateX() + "," + getCoordinateY() + ") ";
    }
}

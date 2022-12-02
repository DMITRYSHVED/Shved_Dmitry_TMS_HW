package Lesson9_Task.Task1;

public class VectorThreeD {
    private double getCoordianeX;
    private double coordinateY;
    private double coordinateZ;
    private static final String DESCRIPTION = "Это вектор для трехмерной системы координат:";

    public VectorThreeD(double coordinateX, double coordinateY, double coordinateZ) {
        this.getCoordianeX = coordinateX;
        this.coordinateY = coordinateY;
        this.coordinateZ = coordinateZ;
    }

    public double getCoordinateX() {
        return getCoordianeX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public double getCoordinateZ() {
        return coordinateZ;
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

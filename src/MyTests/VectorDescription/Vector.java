package src.MyTests.VectorDescription;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double scalarMultiplication(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector vectorMultiplication(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    public double cos(Vector vector) {
        return scalarMultiplication(vector) / (vectorLength() * vector.vectorLength());
    }

    public Vector add(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, +z + vector.z);
    }

    public Vector minus(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static Vector[] randomVectors(int x) {
        Vector[] vectors = new Vector[x];
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "Vector (x = " + x + " y = " + y + " z = " + z + " )";
    }
}


public class Punto {

    private int i;//posicion 
    private double x;//valor independiente
    private double y;// valor dependiente 

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" + "i=" + i + ", x=" + x + ", y=" + y + '}';
    }

}

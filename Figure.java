public abstract class Figure {
    private double X;
    private double Y;

    public Figure() {
        this.X = 0;
        this.Y = 0;
    }

    public Figure(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    public void seDeplacer(double dx, double dy) {
        this.X = this.X + dx;
        this.Y = this.Y + dy;
    }

    public abstract double Surface();/// il faut developper avec les autres classes files

    public abstract double perimetre(); /// il faut developper avec les autres classes files

    public String toString() {

        return "X=" + X + " ,Y=" + Y;
    }
}

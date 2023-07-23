public class Rectangle extends Figure {
    private double langueur;
    private double largeur;

    public Rectangle() {
        this.langueur = 0;
        this.largeur = 0;
    }

    public Rectangle(double x, double y, double lon, double lar) {
        super(x, y);
        this.langueur = lon;
        this.largeur = lar;
    }

    public double getLangueur() {
        return langueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLangueur(double lon) {
        this.langueur = lon;
    }

    public void setLargeur(double lar) {
        this.largeur = lar;
    }

    public double Surface() {
        return langueur * largeur;
    }

    public double perimetre() {
        return 2 * (langueur + largeur);
    }

    public String toString() {
        return " Rectangle{" +super.toString()+",langueur :" + langueur + ",largeur :" + largeur + "}";
    }

}

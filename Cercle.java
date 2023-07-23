public class Cercle extends Figure {
    private double rayon;
    public Cercle(){
        this.rayon=0;
    }
    public Cercle(double X,double Y,double rayon) {
        super(X,Y);
        this.rayon = rayon;
    }
    public double getRayon() {
        return rayon;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public double perimetre()
    {
        return 2*Math.PI*rayon;
    }
    public double Surface()
    {
        return Math.PI*Math.pow(rayon, 2);
    }
  public String toString()
  {
    return " Cercle{X: "+getX()+",Y: "+getY()+",rayon :"+rayon+"}";
  }

    
}

import java.util.Vector;

public class Repere {
    private Vector<Figure> figures;

    public Repere() {
        figures = new Vector<Figure>();
    }

    public void ajouter(Figure F) {
        figures.add(F);
    }

    public void afficher() {
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }

    public void afficherRectangles() {
        for (Figure figure : figures) {
            if (figure instanceof Rectangle) {
                System.out.println(figure);
            }

        }
    }

    public void afficherCercles() {
        for (Figure figure : figures) {
            if (figure instanceof Cercle) {
                System.out.println(figure);
            }

        }
    }
}
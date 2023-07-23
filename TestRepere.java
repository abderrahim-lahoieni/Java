public class TestRepere {
    public static void main(String[] args) {
       Rectangle r=new Rectangle(6, 3, 4, 7);
       Cercle c1=new Cercle(2,2,1);
       Cercle c2 = new Cercle(2, 2, 1);
       Repere rep=new Repere();
       rep.ajouter(c1);
       rep.ajouter(c2);
       rep.ajouter(r);
       rep.afficher();
       System.out.println("######################");
       rep.afficherRectangles();
       rep.afficherCercles();
    }
    
}

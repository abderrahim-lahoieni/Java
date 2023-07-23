public class TestFigure {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 6, 2, 3);
        Cercle c = new Cercle(2, 2, 1);
        System.out.println(r);
        System.out.println("surface : " + r.Surface());
        System.out.println("Perimetre : " + r.perimetre());
        System.out.println("*******************************");
        System.out.println(c);
        System.out.println("surface : " + c.Surface());
        System.out.println("Perimetre : " + c.perimetre());
        System.out.println("############################");
        r.seDeplacer(2, 4);//// Pour deplacer les coordonner de r
        System.out.println(r);
    }
}

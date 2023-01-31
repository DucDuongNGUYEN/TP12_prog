public class BouteilleNonRefermable extends Contenant {
    BouteilleNonRefermable(int contenance) {
        super(contenance, contenance, new Ouvrable());
    }

    void ouvrir() {
        ((Ouvrable) getOuverture()).ouvrir();
    }
}

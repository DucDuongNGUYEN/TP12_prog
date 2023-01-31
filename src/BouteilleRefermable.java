public class BouteilleRefermable extends Contenant {
    BouteilleRefermable(int contenance) {
        super(contenance, contenance, new Refermable());
    }

    void ouvrir() {
        ((Refermable) this.getOuverture()).ouvrir();
    }

    void ferme() {
        ((Refermable) getOuverture()).ferme();
    }
}

public class Canette extends ContenantBuvable {

    Canette(int contenance) {
        super(contenance, contenance, new Ouvrable());
    }

    void ouvrir() {
        ((Ouvrable) getOuverture()).ouvrir();
    }

}

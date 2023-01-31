public class Ouvrable implements Ouverture {
    private boolean est_ouvert = false;

    @Override
    public boolean estOuvert() {
        return est_ouvert;
    }

    void ouvrir() {
        est_ouvert = true;
    }

    void setOuvert(boolean v) {
        est_ouvert = v;
    }
}

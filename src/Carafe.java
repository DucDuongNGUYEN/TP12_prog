public class Carafe extends Contenant implements ContenantRemplissable {
    Carafe(int contenance) {
        super(contenance, 0, new ToujoursOuvert());
    }
}

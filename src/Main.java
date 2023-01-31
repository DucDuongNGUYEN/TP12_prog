public class Main {
    public static void main(String[] args){
        Verre verre = new Verre(250);
        verre.boire(100);
        BouteilleRefermable bouteilleRefermable = new BouteilleRefermable(500);
        bouteilleRefermable.ouvrir();
        ContenantRemplissable contenantRemplissable = new Carafe(500);


        bouteilleRefermable.verserDans(500, contenantRemplissable );
        System.out.println(bouteilleRefermable.getReste());
        System.out.println(verre.getReste());
    }
}

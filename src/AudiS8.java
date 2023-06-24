public class AudiS8 extends Jarmu {

    private boolean lezerBlokkolo;


    public AudiS8(int sebesseg, String rendszam, boolean lezerBlokkolo) {
        super(sebesseg, rendszam);
        this.lezerBlokkolo = lezerBlokkolo;
    }

    @Override
    public boolean gyorshajtotE(int sebessegKorlat) {
        if (super.sebesseg > sebessegKorlat) {
            return false;
        }
        if (lezerBlokkolo == true) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Audi: " + super.toString();
    }

}

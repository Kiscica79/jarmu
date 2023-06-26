public class Robogo extends Jarmu implements KisGepjarmu {

    private int maxSebesseg;

    public Robogo(int sebesseg, String rendszam, int maxSebesseg) {
        super(sebesseg, rendszam);
        this.maxSebesseg = maxSebesseg;
    }

    @Override
    public boolean gyorshajtotE(int sebessegKorlat) {
        if (super.sebesseg < sebessegKorlat) {
            return false;
        }
        return true;
    }

    @Override
    public boolean haladhatItt(int sebesseg) {
        if (maxSebesseg < sebesseg) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Robogo: " + super.toString();
    }


}

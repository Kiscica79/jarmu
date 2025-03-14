public abstract class Jarmu {

    protected int sebesseg;
    private String rendszam;

    public Jarmu(int sebesseg, String rendszam) {
        this.sebesseg = sebesseg;
        this.rendszam = rendszam;
    }

    public abstract boolean gyorshajtotE(int sebessegKorlat);

    @Override
    public String toString() {
        return rendszam + " - " + sebesseg + " km/h";
    }

}

public class Main {
    public static void main(String[] args) {

        Robogo vespa = new Robogo(70, "HHH-111", 90);
        System.out.println(vespa.gyorshajtotE(110));
        System.out.println(vespa.haladhatItt(50));
        System.out.println(vespa.toString());

        AudiS8 audi = new AudiS8(100, "AAA-222", true);
        System.out.println(audi.gyorshajtotE(150));

    }
}

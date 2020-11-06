public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceTicketKopecks = 2399_99;
        int miles = service.calculate(priceTicketKopecks);
        System.out.println(miles);
    }
}
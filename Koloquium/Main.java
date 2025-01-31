public class Main {

        public static void main(String[] args) {
        Time godzina = new Time(0, 610);

        godzina.getHo();
        godzina.getMin();

        System.out.println(godzina.toString());

        System.out.println(godzina.timeAdd(8,40));

        System.out.println(godzina.timeDeduct(15,70));

        System.out.println(godzina.timeMultiply(6));

                Time[] tablica = {
                        new Time(1, 45),  // 1 godzina 45 minut
                        new Time(2, 15),  // 2 godziny 15 minut
                        new Time(0, 30)   // 0 godzin 30 minut
                };
                System.out.println(Time.sumTimes(tablica));









    }
}

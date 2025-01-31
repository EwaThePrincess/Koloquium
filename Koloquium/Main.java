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
                        new Time(6, 45),
                        new Time(3, 55),
                        new Time(0, 30)
                };
                System.out.println(Time.sumTimes(tablica));









    }
}

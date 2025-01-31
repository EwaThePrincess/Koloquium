public class Time {
    private int h;
    private int min;


    public Time(int h, int min) {

        if (min > 59) {
            this.min = min%60;
            this.h = h + min/60;
        } else {
            this.min = min;
            this.h = h;
        }

    }

    public int getHo() {
        return this.h;
    }


    public int getMin() {
        return this.min;
    }

    public String toString(){
        return String.format("%d h %d min.", h, min);
    }

    public String timeAdd(int t, int tm) {

        int sum = this.h + t;
        int summ = (this.min + tm);
        if (summ > 59) {
            sum = this.h + t + tm/60;
            summ = (this.min + tm)%60;
        }

        Integer.toString(sum);
        Integer.toString(summ);
        String totalSum = ("The total time is: " + sum + 'h' + summ + "min");
        return totalSum;

    }
    public String timeDeduct(int t, int tm) {
        int diff = this.h - t;
        int diffm = this.min - tm;
        if (tm > 59) {
            diff = this.h - t - tm/60;
            diffm = (this.min - tm%60);
            diffm = Math.abs(diffm);
        }
        Integer.toString(diff);
        Integer.toString(diffm);
        String totalDiff = ("The time after deduction is: " + diff + 'h' + diffm + "min");
        return totalDiff;
    }
    public String timeMultiply(int x) {
        int producth = this.h*x;
        int productm = this.min*x;
        if (productm > 59) {
            producth = producth + productm/60;
            productm = productm%60;
        }
        Integer.toString(producth);
        Integer.toString(productm);
        String totalProduct = ("The time multiplied is: " + producth + 'h' + productm + "min");
        return totalProduct;
    }
    public static Time sumTimes( Time[] tablica) {

        int sumOfHours = 0;
        int sumOfMinutes = 0;

        for (Time time : tablica) {
            sumOfHours = sumOfHours + time.getHo();
            sumOfMinutes = sumOfMinutes + time.getMin();
        }
        return new Time(sumOfHours, sumOfMinutes);
    }


}

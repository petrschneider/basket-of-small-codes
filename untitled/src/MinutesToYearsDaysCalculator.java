public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes<0){
            System.out.println("Invalid Value");
        } else {
            long year = (int) (minutes/ 525600);
            long days = minutes % 525600;
            days = days / 1440;
            System.out.println( minutes+ " min = " + year + " y" + " and " + days + " d");
        }

    }
}

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes){
        if (minutes <0 ){
            System.out.println("Invalid Value");
        }else {
            long fHours = minutes/60;
            long remainingMinutes = minutes%60;
            long fDays = fHours/24;
            long remainingHours= fHours%24;
            long fYears = fDays/365;
            long remainingDays = fDays%365;

            System.out.println(minutes+" min = "+fYears+" y and "+remainingDays+" d");

        }
    }

}

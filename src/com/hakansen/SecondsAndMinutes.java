public class SecondsAndMinutes {
    public static void getDurationString (int minutes, int seconds){
        if (minutes <0 || (seconds<0 && seconds>60)){
            System.out.println("Invalid Value");
        }else{
            int hours = minutes/60;
            int remainingMinutes = minutes%60;
            System.out.println(minutes+" minutes "+ seconds+ " seconds. Equal to "+ hours+"h "+remainingMinutes+"m "+seconds+"s");
        }
    }

}

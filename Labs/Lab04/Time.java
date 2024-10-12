//Cosme Boisset - Lab04 - Problem 2: Time

/*
 static double secondsToMinutes(int seconds)
               Returns number of minutes from seconds, 1 minute = 60 seconds

 static double secondsToHours(int seconds)
               Returns number of hours from seconds, 1 hour = 60 minutes

 static double secondsToDays(int seconds)
               Returns number of days from seconds, 1 day = 24 hours

 static double secondsToYears(int seconds)
               Returns number of years from seconds, 1 year = 365 days

 static double minutesToSeconds(double minutes)
               Returns number of seconds from minutes, 1 minute = 60 seconds

 static double hoursToSeconds(double hours)
               Returns number of seconds from hours, 1 hour = 60 minutes

 static double daysToSeconds(double days)
               Returns number of seconds from days, 1 day = 24 hours

 static double yearsToSeconds(double years)
               Returns number of seconds from hours, 1 year = 365 days

 */
public class Time {
    public static double secondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double secondsToHours(int seconds) {
        double minutes = secondsToMinutes(seconds);
        return minutes / 60;
    }

    public static double secondsToDays(int seconds) {
        double hours = secondsToHours(seconds);
        return hours / 24;
    }

    public static double secondsToYears(int seconds) {
        double days = secondsToDays(seconds);
        return days / 365;
    }

    public static double minutesToSeconds(double minutes) {
        return minutes * 60;
    }

    public static double hoursToSeconds(double hours) {
        double minutes = hours * 60;
        return minutesToSeconds(minutes);
    }

    public static double daysToSeconds(double days) {
        double hours = days * 24;
        return hoursToSeconds(hours);
    }

    public static double yearsToSeconds(double years) {
        double days = years * 365;
        return daysToSeconds(days);
    }
}

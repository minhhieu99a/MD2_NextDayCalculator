import java.time.Year;

public class NextDayCalculator {
    public static String getNextDay(int day, int month, int year) {
        int OutPutDay = 0;
        int OutPutMonth = 0;
        int OutPutYear=0;
        int LastDayOfMonth = 31;
        int FirstDayOFMonth = 1;
        int LastMonthOfYear = 12;
        int FirstMonthOfYear = 1;
        boolean isLeapYear;

        String slash = "/";
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                LastDayOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                LastDayOfMonth = 30;
                break;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        if (isLeapYear) {
            if (month == 2) {
                if (day == 29) {
                    OutPutDay = FirstDayOFMonth;
                    OutPutMonth = ++month;
                    OutPutYear = year;
                }
            }
        }else if (month == 2) {
                if (day == 28) {
                    OutPutDay = FirstDayOFMonth;
                    OutPutMonth = ++month;
                    OutPutYear= year;
                }
            }else {
            if (month != LastMonthOfYear) {
                OutPutYear = year;
                if (day == LastDayOfMonth) {
                    OutPutDay = FirstDayOFMonth;
                    OutPutMonth = ++month;
                } else {
                    OutPutDay = ++day;
                    OutPutMonth = month;
                }
            } else {
                OutPutYear = ++year;
                if (day == LastDayOfMonth) {
                    OutPutDay = FirstDayOFMonth;
                    OutPutMonth = FirstMonthOfYear;
                }
            }
        }
        return OutPutDay + slash + OutPutMonth + slash + OutPutYear;
    }
}

/*Number of Days Between Two Dates – 
https://leetcode.com/problems/number-of-days-between-two-dates/ */
class Solution {
    public int daysBetweenDates(String date1, String date2) {
           return Math.abs(calculateDays(date1) - calculateDays(date2));
            }    

    private boolean isLeapYear(int year) {
        return year % 4 == 0 && 
              ( year % 100 != 0 || year % 400 == 0);
    }
    private int daysInMonth(int year , int month){
        int[] days = {
            31,28,31,30,31,30,31,31,30,31,30,31};
            if(isLeapYear(year)){
                days[1] = 29;
            }
            return days[month - 1];
        }
        private int calculateDays(String date){
            int year =Integer.parseInt(date.substring(0,4));
            int month = Integer.parseInt(date.substring(5, 7));
            int day = Integer.parseInt(date.substring(8, 10));
            int days = 0;
             for (int y = 1971; y < year; y++) {

            days += isLeapYear(y) ? 366 : 365;

        }

        for (int m = 1; m < month; m++) {

            days += daysInMonth(year, m);

        }

        days += day;

        return days;
        }
    }

/*https://leetcode.com/problems/day-of-the-week/ */
import java.time.LocalDate;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String result = date.getDayOfWeek().name();
        return result.charAt(0) + result.substring(1).toLowerCase();
    }
}

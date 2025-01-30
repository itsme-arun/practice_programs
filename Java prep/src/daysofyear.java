//Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return
//the day number of the year.
//Example 1:
//Input: date = "2019-01-09"
//Output: 9
//Explanation: Given date is the 9th day of the year in 2019.
//Example 2:
//Input: date = "2019-02-10"
//Output: 41
import java.util.*;
public class daysofyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        int days = 0;
        switch(date.substring(5,7)){
            case "02":
                days+=31;
                break;
            case "03":
                days+=59;
                break;
            case "04":
                days+=90;
                break;
            case "05":
                days+=120;
                break;
            case "06":
                days+=151;
                break;
            case "07":
                days+=181;
                break;
            case "08":
                days+=212;
                break;
            case "09":
                days+=243;
                break;
            case "10":
                days+=273;
                break;
            case "11":
                days+=304;
                break;
            case "12":
                days+=334;
                break;
        }
        days += Integer.parseInt(date.substring(8));
        System.out.println("Total days in that year is : " + days);

    }
}


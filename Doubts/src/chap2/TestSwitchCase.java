package chap2;
public class TestSwitchCase 
{
    public static void main(String[] args)
    {
        int day = 6;
        String dayString;
        // switch statement with int data type
        switch (day) 
        {
            case 1:  dayString = "Monday";
                     break;
            case 2:  dayString = "Tuesday";
                     break;
            case 3:  dayString = "Wednesday";
                     break;
            case 4:  dayString = "Thursday";
                     break;
            case 5:  dayString = "Friday";
                     break;
            case 6:  dayString = "Saturday";System.out.println("hell");
            case 11:  System.out.println(211);dayString="DD";
                     break;
            case 7:  dayString = "Sunday";
                     break;
            default: dayString = "Invalid day";
                     break;
        }
        System.out.println(dayString);
    }
}
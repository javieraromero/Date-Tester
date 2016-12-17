import javax.swing.JOptionPane;

public class DateTester
{
    public static void main(String args[])
    {
        SpeedDating newDate = new SpeedDating();
        
        String input;
        
        input = JOptionPane.showInputDialog("Enter a year and I will compute the day of the week that \nNew Years Day lands on for the next 10 years:");
        newDate.auldLangSynch(Integer.parseInt(input));
        
        System.out.println();
        
        input = JOptionPane.showInputDialog("This method will calculate the number of days between two dates. \nEnter the starting date's month, as an integer:");
        int startMonth = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the starting day:");
        int startDay = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the starting year:");
        int startYear = Integer.parseInt(input);
        
        Date start = new Date(startMonth, startDay, startYear);     //date object for starting date
        
        input = JOptionPane.showInputDialog("Enter the end date's month:");
        int endMonth = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the end day:");
        int endDay = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the end year:");
        int endYear = Integer.parseInt(input);
        
        Date end = new Date(endMonth, endDay, endYear);     //date object for end date
                      
        System.out.println("The amount of days between " + start.getLongDate() 
                + " and " + end.getLongDate() + " is " + newDate.countingTheDays(start, end) + ".");
        
        System.out.println();
        
        input = JOptionPane.showInputDialog("Enter a year and I will tell you what date Thanksgiving will fall on:");
        int year = Integer.parseInt(input);
        Date thanksgiving = newDate.getThanksgiving(year);
        System.out.println("In " + year + ", Thanksgiving will fall on November " + thanksgiving.getDay() + ".");
        
        System.out.println();
        
        input = JOptionPane.showInputDialog("Enter another year for Thanksgiving:");
        year = Integer.parseInt(input);
        Date thanksgiving2 = newDate.getThanksgiving(year);
        System.out.println("In " + year + ", Thanksgiving will fall on November " + thanksgiving2.getDay() + ".");
    }
}
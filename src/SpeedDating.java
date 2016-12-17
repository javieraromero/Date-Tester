/**
 * A class to give students experience using loops.  This class
 * creates and manipulates objects of Greg's Date class.
 */
 public class SpeedDating
 {
    // Note: this class has no instance variables!
 	
    /**
     * Create an empty SpeedDating object
     * (this is known as a "default" constructor)
     */
     public SpeedDating()
     {}	   // Constructor has empty body
 	
    /**
     * Prints the day of the week (e.g. "Thursday") on which New Year's Day
     * will fall in 10 consecutive years
     * 
     * @param startYear the first of the 10 consecutive years
     */
     public void auldLangSynch(int startYear)
     {
         // TO DO: write body of this method here
         
         Date newYears = new Date(1, 1, startYear);     //new Date object for New Years
         int year = startYear;      //LCV
         
         do{ 
             System.out.println(newYears.getYear() + ": " + newYears.getDayOfWeek());       //prints the day of the week
             if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
                 newYears.add(366);     //checks for leap year
             else
                 newYears.add(365);     //not a leap year
             year++;
         }while(year <= (startYear + 9));
     }
 	
    /**
     * Computes and returns the Date on which Thanksgiving will fall 
     * in a given year.
     *
     * NOTE: By law, Thanksgiving is the 4th Thursday in November
     *
     * @param year the year for which to compute the date of Thanksgiving
     * @return the Date of Thanksgiving for the specified year
     */
     public Date getThanksgiving(int year)
     {
         // TO DO: write body of this method here
         Date thanksgiving = new Date(11, 22, year);        //new Date object for Thanksgiving; 
                                                            //starts at the 22nd because that's the earliest possible occurance.
         while(!thanksgiving.getDayOfWeek().equalsIgnoreCase("Thursday"))
             thanksgiving.next();           //while the day isn't Thursday, add a day until it is Thursday.
         
         return thanksgiving;
     }
 	 	
     /**
      * Computes and returns the number of days between two dates,
      * counting the end date but not the start date.  E.g., the
      * number of days between 11/3/2016 and 11/7/2016 is 4, not 5.
      *
      * Precondition: The start date must occur on or before the end date.
      * 
      * @param start the earlier of the two dates
      * @param end the later of the two dates
      * 
      * @return the number of days between the two dates 
      */
      public int countingTheDays(Date start, Date end) 
      {
 	  // TO DO: write body of this method here
          
          int count = 0;        //LCV
          while(!start.equals(end))
          {
              start.next();         //adds a day until the loop matches the dates.
              count++;
          }
        
          return count;
      }
 }
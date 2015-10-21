package lab0;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
    
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;
    private Date today = Calendar.getInstance().getTime();

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public final int getDaysVacation() {
        return daysVacation;
    }

    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation<-30||daysVacation>30){
            throw new IllegalArgumentException("Sorry vacation days must be between -30 and 30");
        } else {
        this.daysVacation = daysVacation;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) throws IllegalArgumentException {
       if(firstName == null){
           throw new IllegalArgumentException("First Name cannot be null or empty");
       } else {
        this.firstName = firstName;
       }
    }

    public Date getHireDate() {
        return hireDate;
    }

    public final void setHireDate(Date hireDate) throws ParseException {
        if (hireDate.before(format.parse("04-10-2010")) || hireDate.after(today) ){
        throw new IllegalArgumentException("Employee cannot be hired before the company was founded, or be hired from the future, unless you know time travel.");
    }
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        if (lastName == null){
            throw new IllegalArgumentException("Last name cannot be empty or null");
        } else {
        this.lastName = lastName;
        }
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333
    public final void setSsn(String ssn) {
        if (ssn == null){
            throw new IllegalArgumentException("SSN cannot be Null");
        }
        if ( ssn.length() < 9 || ssn.length() > 11 || ssn.length() == 10 ){
            throw new IllegalArgumentException("The SSN must be 9 or 11 digits long.");
        }
        if(ssn.length() == 9 || ssn.length() == 11){
            String[] parts = ssn.split("-");
            if (parts.length ==0){
                char[] chars = ssn.toCharArray();
            } else if ( parts.length == 3){
                for (String s : parts){
                    char[] c = s.toCharArray();
                }
            }
            
        
    } else {
            throw new IllegalArgumentException();
            }
        this.ssn = ssn;
    }
    
    
    
}

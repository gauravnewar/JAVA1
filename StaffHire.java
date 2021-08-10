
/**
 * Write a description of class StaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

    public class StaffHire
{
    protected int vacancyNumber; 
    protected String designation; 
    protected String jobType; 
    
    public StaffHire(int vacancyNumber, String designation, String jobType) 
    {
        this.vacancyNumber=vacancyNumber; 
        this.designation=designation;
        this.jobType=jobType;
    }
    
    public void setVacancyNumber(int vacancyNumber) 
    {
        this.vacancyNumber=vacancyNumber;
    }
    public int getVacancyNumber() 
    {
        return this.vacancyNumber;
    }
    
    public void setDesignation(String designation)
    {
        this.designation=designation;
    }
    public String getDesignation()
    {
        return this.designation;
    }
    
    public void setJobType(String jobType)
    {
        this.jobType=jobType;
    }
    public String getJobType()
    {
        return this.jobType;
    }
    
    public void display()
    {
        System.out.println("The vacancy number of staff is " +getVacancyNumber());
        System.out.println("The Designation of staff is " +getDesignation());
        System.out.println("The Job Type of staff is " +getJobType());
    }
}
        
    
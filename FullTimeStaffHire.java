
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire
{
    private int salary;
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;
    
    public FullTimeStaffHire(int vacancyNumber,String designation,String jobType,int salary,int workingHour) 
    {
        super(vacancyNumber,designation,jobType);
        this.salary=salary;
        this.workingHour=workingHour;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
    }
   
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public int getSalary()
    { 
        return this.salary;
    }
    
    public void setWorkingHour(int workingHour)
    {
        this.workingHour=workingHour;
    }
    public int getWorkingHour()
    {
        return this.workingHour;
    }
    
    public void setStaffName(String staffName)
    {
        this.staffName=staffName;
    }
    public String getStaffName()
    {
        return this.staffName;
    }
    
    public void setJoinignDate(String joinDate)
    {
        this.joiningDate=joiningDate;
    }
    public String getJoiningDate()
    {
        return this.joiningDate;
    }
    
    public void setQualification(String qualification)
    {
        this.qualification=qualification;
    }
    public String getQualification()
    {
        return this.qualification;
    }
    
    public void setAppointedBy(String appointedBy)
    {
        this.appointedBy=appointedBy;
    }
    public String getAppointedBy()
    {
        return this.appointedBy;
    }
    
    public void setJoined(boolean joined)
    {
        this.joined=joined;
    }
    public boolean getJoined()
    {
        return this.joined;
    }
    
    public void checkSalary(int salary)
    {
        if(joined)
        {
            System.out.println("It is therefore not possible to change the salary");
        }
        else
        {
            this.salary=salary;
        }
    }
    
    public void changeHour(int workingHour)
    {
        this.workingHour=workingHour;
    }
    
    public void hireStaff(String staffName,String joiningDate,String qualification,String appointedBy)
    {
        if(joined)
        {
            System.out.println("The staff is appointed and the details are below");
            System.out.println("The name of staff is"+getStaffName());
            System.out.println("The joining date of staff is"+getJoiningDate()); 
            
        }
        else
        {
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
        }
     }
     
     public void display() // method overriding
     {
         super.display();
         if(joined)
         {
             System.out.println("The name of staff is "+getStaffName());
             System.out.println("The salary of staff is "+getSalary());
             System.out.println("The working hour of staff is "+getWorkingHour());
             System.out.println("The joining date of staff is "+getJoiningDate());
             System.out.println("The qualification of staff is "+getQualification());
             System.out.println("The staff is appointed by "+getAppointedBy());
         }
     }
}   
    
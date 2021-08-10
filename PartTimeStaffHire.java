
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartTimeStaffHire extends StaffHire
{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
    
    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, int workingHour, int wagesPerHour, String shifts)
    {
        super(vacancyNumber,designation,jobType);
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shifts=shifts;
        this.staffName="";
        this.joiningDate="";
        this.qualification="";
        this.appointedBy="";
        this.joined=false;
        this.terminated=false;
    }
    
    public void setWorkingHour(int workingHour)
    {
        this.workingHour=workingHour;
    }
    public int getWorkingHour()
    {
        return this.workingHour;
    }
    
    public void setWagesPerHour(int wagesPerHour)
    {
        this.wagesPerHour=wagesPerHour;
    }
    public int getWagesPerHour()
    {
        return this.wagesPerHour;
    }
    
    public void setStaffName(String staffName)
    {
        this.staffName=staffName;
    }
    public String getStaffName()
    {
        return this.staffName;
    }
    
    public void setJoiningDate(String joiningDate)
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
    
    public void setShifts(String shifts)
    {
        this.shifts=shifts;
    }
    public String getShifts()
    {
        return this.shifts;
    }
    
    public void setJoined(boolean joined)
    {
        this.joined=joined;
    }
    public boolean getJoined()
    {
        return this.joined;
    }
    
    public void setTerminated(boolean terminated)
    {
        this.terminated=terminated;
    }
    public boolean getTerminated()
    {
        return this.terminated;
    }
    
    public void setWorkingShifts(String shifts)
    {
        if(joined)
        {
        }
        else
        {
            this.shifts=shifts;
        }
    }
    
    public void hireStaff(String staffName,String joiningDate,String qualification,String appointedBy)
    {
        if(joined)
        {
            System.out.println("The name of staff is "+getStaffName());
            System.out.println("The joining date of staff is "+getJoiningDate());
        }
        else
        {
            this.joiningDate=joiningDate;
            this.staffName=staffName;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            this.joined=true;
            this.terminated=false;
        }
    }

    public void terminateStaff(String staffName,String joiningDate,String qualification,boolean joined,boolean terminated)
    {
        if(terminated)
         {
           System.out.println("You are terminated");
        }
        else
        {
            this.staffName="";
            this.joiningDate="";
            this.qualification="";
            this.joined=false;
            this.terminated=true;
        }
    }
    
    public void display()
    {
        super.display();
        if(joined)
        {
            System.out.println("The name of staff is "+getStaffName());
            System.out.println("The wages per hour of staff is "+getWagesPerHour());
            System.out.println("The working hour of staff is "+getWorkingHour());
            System.out.println("The joining date of staff is " +getJoiningDate());
            System.out.println("The working hour of staff is " +getWorkingHour());
            System.out.println("The staff is appointedBy "+getAppointedBy());
            System.out.println("income baki cha");
        }          
    }
}
            
    
            
    
        
        
     
        
        
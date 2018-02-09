
import java.util.Date;



public class Staff {
     private String emp_number;
    private String lname;
    private String fname;
    private String idNumber;
    private String cellphone;
    private String email;
    private String sex;
    private String birthday;
    private String password;
    private String jobType;
    private String hireDate;
    private String address;

    public Staff() {
        
    }
    
    

    public Staff(String emp_number, String fname, String lname, String idNumber, String cellphone, String address, String hireDate, String sex, String password, String email, String birthday, String jobType ) {
        this.emp_number = emp_number;
        this.lname = lname;
        this.fname = fname;
        this.idNumber = idNumber;
        this.cellphone = cellphone;
        this.email = email;
        this.sex = sex;
        this.birthday = birthday;
        this.password = password;
        this.jobType = jobType;
        this.hireDate = hireDate;
        this.address = address;
        
       
    }
    
    
    
    public ClassDao setValues(String lname, String fname, String idNumber, String cellphone, String email, String password, String jobType, String address)
    {
        ClassDao dao =  null;
        this.lname = lname;
        this.fname = fname;
        this.idNumber = idNumber;
        this.cellphone = cellphone;
        this.email = email;
        this.password = password;
        this.jobType = jobType;
        this.address = address;
        
        Date today = new Date();
         int numChar = Integer.parseInt(idNumber.substring(6,7));
         if(numChar < 5)
         {
             sex = "Female";
         }
         else
         {
           sex = "Male";   
         }
         int numYear = Integer.parseInt(idNumber.substring(0,2));
         String birth = "";
	if(numYear < 99 && numYear > 16)
	{

		birthday = " 19" + idNumber.substring(0,2) +"-"+ idNumber.substring(2,4) +"-"+  idNumber.substring(4,6);
	}
	else
	{
	
		birthday = " 20" + idNumber.substring(0,2) +"-"+ idNumber.substring(2,4) +"-"+  idNumber.substring(4,6);
	}  
        
        hireDate = String.valueOf(today.getDate()) + "-" + String.valueOf(today.getMonth() + "-" + String.valueOf(today.getYear()));
        
        return dao;
    }
    
    public void setLoginVals(String idNumber, String password, String job_type)
    {
        this.idNumber = idNumber;
        this.password = password;
        this.jobType = job_type;
    }

    public String getEmp_number() {
        
        return emp_number;
    }

    public String getLname() {
        
        return lname;
    }

    public String getFname() {
        
        return fname;
    }

    public String getIdNumber() {
        
        return idNumber;
    }

    public String getCellphone() {
        
        return cellphone;
    }

    public String getEmail() {
        
        return email;
    }

    public String getSex() {
        
        return sex;
    }

    public String getBirthday() {
        
        return birthday;
    }

    public String getPassword() {
        
        return password;
    }

    public String getJobType() {
        
        return jobType;
    }

    public String getHireDate() {
        
        return hireDate;
    }

    public String getAddress() {
        
        return address;
    }

    
    
    
}

# CSCM94
Cafe94
public class Employee {
     
    private String ID;
    private String name;
    private String position;
    private int holiday;
    private double salary;
    public Employee( String iD,String name,String position,int holiday,double salary)
    {
        super();
        ID=iD;
        this.name=name;
        this.position=position;
        this.holiday=holiday;
        this.salary=salary;  
    }
     
    public String getID() {
     return ID;
 }
 public void setID(String iD) {
     ID = iD;
 }
 public String getName() {
     return name;
 }
 public void setName(String name) {
     this.name = name;
 }
 public String getPosition() {
     return position;
 }
 public void setPosition(String position) {
     this.position = position;
 }
 public int getHoliday() {
     return holiday;
 }
 public void setHoliday(int holiday) {
     this.holiday = holiday;
 }
 public double getSalary() {
     return salary;
 }
 public void setSalary(double salary) {
     this.salary = salary;
 }
 public  double sumSalary(int holiday){
     return 1;
      
 }
 public void display()
 {
     System.out.println("编号"+this.ID+"姓名"+this.name+"职务"+this.position+"假期"+this.holiday+"薪水"
 +this.sumSalary(this.holiday));
 }
}

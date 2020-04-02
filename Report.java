public class Report {
    private String most_Popular_Item;
    private int most_Active_Customer;
    private int busiest_Hour;
    private int staff_Member_Highest_Working_Hours;

    public Report(){
        this.most_Popular_Item = "";
        this.most_Active_Customer = -1;
        this.busiest_Hour = -1;
        this.staff_Member_Highest_Working_Hours = -1;
    }

    public String getMost_Popular_Item() {
        return most_Popular_Item;
    }

    public int getMost_Active_Customer() {
        return most_Active_Customer;
    }

    public int getBusiest_Hour() {
        return busiest_Hour;
    }

    public int getStaff_Member_Highest_Working_Hours() {
        return staff_Member_Highest_Working_Hours;
    }

    public void setMost_Popular_Item(String most_Popular_Item) {
        this.most_Popular_Item = most_Popular_Item;
    }

    public void setMost_Active_Customer(int most_Active_Customer) {
        this.most_Active_Customer = most_Active_Customer;
    }

    public void setBusiest_Hour(int busiest_Hour) {
        this.busiest_Hour = busiest_Hour;
    }

    public void setStaff_Member_Highest_Working_Hours(int staff_Member_Highest_Working_Hours) {
        this.staff_Member_Highest_Working_Hours = staff_Member_Highest_Working_Hours;
    }
}

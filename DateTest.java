class data{
    int month;
    int date;
    int year;
    data(int month, int date, int year){
        this.month = month;
        this.date = date;
        this.year = year;
    }
    public int getmonth(){
        return month;
    }
    public void setmonth(int month){
        this.month = month;
    }
    public int getdate(){
        return date;
    }
    public void setdate(int date){
        this.date = date;
    }
    public int getyear(){
        return year;
    }
    public void setyear(int year){
        this.year = year;
    }
    public void displayDate(){
        System.out.println(month+"/"+date+"/"+year);
    }
}
public class DateTest {
    public static void main(String[] args) {
        data data1 = new data(11, 18, 2023);
        System.out.println("today's date is = ");
        data1.displayDate();
    }
}

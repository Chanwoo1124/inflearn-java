package lang.immutable.ex;

public class MyDate {
    private int year;
    private  int month;
    private  int day;

    public MyDate(int month, int year, int day) {
        this.month = month;
        this.year = year;
        this.day = day;
    }
    public MyDate setYear(int year){
        return new MyDate(year,this.month,this.day);
    }

    public MyDate setMonth(int month){
        return new MyDate(this.year,month,this.day);
    }
    public MyDate setDay(int day){
        return new MyDate(this.year,this.month,day);
    }

    @Override
    public String toString(){
        return year + "-" + month + "-" + day;
    }
}

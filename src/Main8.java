public class Main8 {
    int Year;
    int Month;
    int Date;
    public Main8(int fYear,int fMonth,int fDate){
        Year=fYear;
        Month=fMonth;
        Date=fDate;
    }
    public static void main(String[]args){
        Main8 obj=new Main8(2003,05,18);
        System.out.println(obj.Year+"/"+obj.Month+"/"+obj.Date);
    }
}
//Constructor
//Constructor parameters passing

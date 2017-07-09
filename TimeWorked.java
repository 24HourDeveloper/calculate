package sample;

/**
 * Created by mikei_000 on 7/5/2017.
 */
public class TimeWorked {

    private int hourlyPay;
    private int hoursWorked;
    private ProfitShare profitShare;

    public TimeWorked(int hourlyPay, int hoursWorked){
        this.hourlyPay = hourlyPay;
        this.hoursWorked = hoursWorked;
    }

    public int getPay(){
        int num = hourlyPay * hoursWorked;
        return num;
    }

    public int getProfitShare() {
        return profitShare.getProfits();
    }

    public void setProfitShare(ProfitShare profitShare) {
        this.profitShare = profitShare;
    }

    public int getHours(){
        return hoursWorked;
    }
}

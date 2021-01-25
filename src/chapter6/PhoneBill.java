package chapter6;

public class PhoneBill {

    private int billId;
    private double baseCost;
    private double allottedMinutes;
    private double minutesUsed;
    private double planTax;
    private double overageFee;

    public PhoneBill() {
        billId = 1;
        baseCost = 100.00;
        allottedMinutes = 120;
        minutesUsed = 90;
        planTax = 0.15;
        overageFee = 0.25;
    }

    public PhoneBill(int billId) {
        setBillId(billId);
        baseCost = 100.00;
        allottedMinutes = 120;
        minutesUsed = 90;
        planTax = 0.15;
        overageFee = 0.25;
    }

    public PhoneBill(int billId, double baseCost, double allottedMinutes, double minutesUsed) {
        setBillId(billId);
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setMinutesUsed(minutesUsed);
        planTax = 0.15;
        overageFee = 0.25;
    }

    public void setBillId(int billId) {
        this.billId = billId;
    }

    public void setAllottedMinutes(double allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public double calcOverage() {
        if (minutesUsed > allottedMinutes) {
            return (minutesUsed - allottedMinutes) * overageFee;
        }
            return 0.0;
    }

    public double calcPlanTax() {
        return (baseCost + calcOverage()) * planTax;
    }

    public double calcTotalCost() {
        return baseCost + calcOverage() + calcPlanTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + billId);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calcOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calcPlanTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calcTotalCost()));
    }

}

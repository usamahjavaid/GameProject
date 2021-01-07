package model.company;

public class HugeCompany implements Company{

    private Double budgetConstant;
    private Double budget;
    private int IQ;
    private Double reputation;

    @Override
    public void updateBudgetConstant() {
    }

    @Override
    public void talk() {
        System.out.println("I AM HUGE(MY DICK I MEAN)");
    }
}

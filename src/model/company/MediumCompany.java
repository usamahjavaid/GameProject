package model.company;

public class MediumCompany implements Company{

    private Double budgetConstant;
    private Double budget;
    private int IQ;
    private Double reputation;

    @Override
    public void updateBudgetConstant() {

    }

    public void updateBudget() {
        this.budget = budget + 1;
    }

    public MediumCompany() {
        this.budgetConstant = 0.1;
        this.budget = 1000000.0;
        this.IQ = 110;
        this.reputation = 3.0;
    }

    @Override
    public void talk() {
        System.out.println("I AM MEADIUM");
    }


    @Override
    public java.lang.String toString() {
        return "MediumCompany{" +
                "budgetConstant=" + budgetConstant +
                ", budget=" + budget +
                ", IQ=" + IQ +
                ", reputation=" + reputation +
                '}';
    }
}

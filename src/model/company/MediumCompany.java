package model.company;

public class MediumCompany implements Company{

    private Double budgetConstant;
    private Double budget;
    private int IQ;
    private Double reputation;

    @Override
    public void updateBudgetConstant() {
    }

    @Override
    public void talk() {
        System.out.println("I AM MEADIUM");
    }

}

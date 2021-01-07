package model;

import model.company.Company;
import model.company.CompanyFactory;
import model.company.MediumCompany;

import static java.lang.Thread.sleep;

public class Game implements Runnable {

    CompanyFactory companyFactory = new CompanyFactory();
    @Override
    public void run() {
        try {
            timer();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void timer() throws InterruptedException {
        Company mediumCompany = companyFactory.getCompany("MEDIUM");

        while (true){
            sleep(1000);
            mediumCompany.updateBudget();
            System.out.println(mediumCompany);
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }
}

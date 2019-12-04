package day43.example.task4;

public class SeniorTesterSalary extends TesterBaseSalary {
    @Override
    public int getSalary(){
        return super.getSalary()+100000;
    }
}

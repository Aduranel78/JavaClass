package day43.example.task4;

public class MiddleTesterSalary extends TesterBaseSalary {
    @Override
    public int getSalary(){
        return super.getSalary()+10000;
    }
}

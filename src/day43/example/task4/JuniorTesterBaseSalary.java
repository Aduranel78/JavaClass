package day43.example.task4;

public class JuniorTesterBaseSalary extends TesterBaseSalary {
    @Override
    public int getSalary(){
        return super.getSalary()-50000;
    }
}

package day43.example.task4;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TesterBaseSalaryTest {

    @Test
    public void basesalary() {

                TesterBaseSalary salary1 = new TesterBaseSalary();

                Assert.assertEquals(100000,salary1.getSalary());
            }
            @Test
            public void juniorsalary(){
        JuniorTesterBaseSalary salary2=new JuniorTesterBaseSalary();
        Assert.assertEquals(50000,salary2.getSalary());

            }
            @Test
            public void middlesalary(){
                MiddleTesterSalary salary3=new MiddleTesterSalary();
                Assert.assertEquals(110000,salary3.getSalary());
            }
            @Test
             public void seniorsalary(){
        SeniorTesterSalary salary4=new SeniorTesterSalary();
        Assert.assertEquals(200000,salary4.getSalary());
    }
    @Test
    //create 3 junior testers sum their salary,and check if you have 150.000 in total
    public void sumofjuniourTesterSlalry(){
  //      JuniorTesterBaseSalary s1=new JuniorTesterBaseSalary();
  //      JuniorTesterBaseSalary s2=new JuniorTesterBaseSalary();
//        JuniorTesterBaseSalary s3=new JuniorTesterBaseSalary();
 //       int expected=150_000;
 //       int actual=s1.getSalary()+s2.getSalary()+s3.getSalary();
        int sum=0;
        for (int i = 0; i < 3; i++) {
            TesterBaseSalary junior = new JuniorTesterBaseSalary();
            sum += junior.getSalary();
        }
            int actual=sum;
            Assert.assertEquals(150000,actual);

        }
        @Test
    public void testSumOfMiddleSalary(){
        //create a middle testers sum slary,and check if you have N*$ 110_000 in total
            int N=100000;
            int sum=0;
            for (int i = 0; i < N; i++) {
                MiddleTesterSalary middle = new MiddleTesterSalary();
                sum += middle.getSalary();
            }
                int actual=sum;
                Assert.assertEquals(N*110000,actual);

            }


        }








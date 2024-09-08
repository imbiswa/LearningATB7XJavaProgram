package Encapsulation;

public class Mysalary {

    private long salary;
    private int bankbalace;

    public Mysalary(int i, int i1) {
    }


    public void getBankbalace(int bankbalace, boolean isAuth)
    {

        if (isAuth) {
            this.bankbalace=bankbalace;
        }
        else
            System.out.println("not allowed");

    }

    public void setBankbalace(int bankbalace) {
        this.bankbalace = bankbalace;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }





}

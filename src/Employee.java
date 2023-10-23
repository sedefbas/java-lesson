/*
public class Employee {
    String fullName;
    int salary;
    int workHours;
    int hireYear;

    Employee(String fullName,int salary,int workHours,int hireYear){
        this.fullName=fullName;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    void tax(int salary){
       if(salary <1000){
           System.out.println("bu çalışana vergi uygulanmayacak.");
       } else if (salary<1000) {

           
       }
    }

    double vergi(int salary){
        double vergi=0.03;
        double newSalary = salary*vergi;
        return salary-newSalary;
    }

    int bonus(int workHours){
        if(workHours>40){
          return workHours*30;
        } else {
            return 0;
        }
    }

    double raiseSalary( int hireYear){
        int nowYear=2021;
       int workYear = 2021-hireYear;
       if(workYear<10){
           return (this.salary*0.05 + this.salary);
       } else if (workYear >= 9 && workYear <= 20) {
           return this.salary * 0.1 + this.salary;
       }
       else
           return this.salary*0.15 + this.salary;
    }

    public String toString(){

        return  "ad:\n"+this.fullName+"maas"+this.salary;
    }

}
*/
package Odev14;

public class Employee {
    String name;    //Çalışanın adı ve soyadı
    double salary;     //Çalışanın maaşı
    int workHours;  //Haftalık çalışma saati
    int hireYear;   //İşe başlangıç yılı

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary >= 1000) {
            return salary * 0.03;
        } else {
            return 0.0;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (workHours - 40) * 30.0;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int totalWorkingYears = (2021 - hireYear);

        if (totalWorkingYears < 10) {
            return salary * 0.05;
        } else if (totalWorkingYears < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return
                "Adı            :\t" + this.name +
                "\nMaaşı          :\t" + this.salary +
                "\nÇalışma Saati  :\t" + this.workHours +
                "\nBaşlangıç Yılı :\t" + this.hireYear +
                "\nVergi          :\t" + tax() +
                "\nBonus          :\t" + bonus() +
                "\nMaaş Artışı    :\t" + raiseSalary() +
                "\nToplam Maaş    :\t" + (this.salary + raiseSalary());
    }
}
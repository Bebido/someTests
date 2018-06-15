package people;

public class Main {

    public static void main(String[] args) {

        Osoba[] ludzie = new Osoba[40];

        ludzie[0] = new Worker("Paweł", "Włodarczyk", 20000);
        ludzie[1] = new Student("Jan", "Niezbedny");

        for (Osoba e : ludzie)
        {
            if (e instanceof Osoba) {
                e.introduction();
                System.out.println();
            }
            else break;
        }


    }
}

abstract class Osoba{

    String name;
    String surName;

    Osoba()
    {

    }

    Osoba(String name, String surName)
    {
        this.name = name;
        this.surName = surName;
    }

    abstract void introduction();
}

class Worker extends Osoba{

    int salary;

    Worker(String name, String surName, int salary)
    {
        super(name, surName);
        this.salary = salary;
    }

    @Override
    void introduction() {
        System.out.println("Imię: " + this.name);
        System.out.println("Nazwisko: " + this.surName);
        System.out.println("Pensja: " + this.salary);
        System.out.println("Jestem pracowanikiem");
    }
}

class Student extends Osoba{

    //int salary;

    Student(String name, String surName)
    {
        super(name, surName);
    }

    @Override
    void introduction() {
        System.out.println("Imię: " + this.name);
        System.out.println("Nazwisko: " + this.surName);
        System.out.println("Jestem Studentem");
    }
}
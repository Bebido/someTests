package main;


import potwory.Potwor;
import potwory.Szkielet;
import potwory.Zombie;

public class Main {

    public static void main(String[] args){

        String a;
        a = "Amdrzxej&asdas";

        String[] nowy = a.split("d");

        for (String x: nowy)
        {
            System.out.println(x);

        }

        Potwor[] p = new Potwor[10];

        p[0] = new Szkielet(50, 100, "Łuk");
        p[1] = new Zombie(20, 150, 5);
        p[5] = new Zombie(30, 110, 15);

        /*for (Potwor x : p)
        {
            if (x instanceof Szkielet) {

                Szkielet tmp = (Szkielet) x;

                tmp.atakuj();
                System.out.println(tmp.toString());
            }
            else if (x instanceof Zombie)
            {
                Zombie tmp = (Zombie) x;
                tmp.atakuj();
                System.out.println(tmp.toString());
            }
        }*/

    }
}

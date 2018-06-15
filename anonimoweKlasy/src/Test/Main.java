package Test;

public class Main {

    public static void main(String[] args) {

        Przycisk p = new Przycisk();
        p.dodajAkcje(new ZachowaniePrzycisku() {
            @Override
            public void akcja() {
                System.out.println("ZAchowanie");
            }
        });

        ZachowaniePrzycisku p2 = new ZachowaniePrzycisku() {
            @Override
            public void akcja() {
                System.out.println("Akcja z anonimowej klasy");
            }
        };

        //p2.akcja();


        Przycisk button = new Przycisk();
        button.dodajAkcje(() -> {
            System.out.println("Krzyk z wyrazenie lambda");
            System.out.println("Krzyk z wyrazenie lambda");
        });
    }

}


interface ZachowaniePrzycisku{

    void akcja();
}

class Przycisk{

    public void dodajAkcje(ZachowaniePrzycisku b){
        b.akcja();
    }
}
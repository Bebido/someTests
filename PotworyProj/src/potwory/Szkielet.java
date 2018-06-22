package potwory;

public class Szkielet extends Potwor {

    private String bron;

    public Szkielet(){
        super();
    }

    public Szkielet(int szybkosc, int hp)
    {
        super(szybkosc, hp);
    }

    public Szkielet(int szybkosc, int hp, String bron)
    {
        super(szybkosc, hp);
        this.bron = bron;
    }

    @Override
    public void atakuj() {
        System.out.println("Szkielet: Atakuje z uzyciem " + bron);
    }

    @Override
    public String toString() {
        String out;
        out = "Szkielet " + "HP: " + hp + "Szybkosc: " + szybkosc;
        return out;
    }
}

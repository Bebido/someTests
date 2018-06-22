package potwory;

public abstract class Potwor {

    protected int szybkosc;
    protected int hp;

    Potwor(int szybkosc, int hp)
    {
        this.szybkosc = szybkosc;
        this.hp = hp;
    }

    Potwor()
    {

    }

    public abstract void atakuj();

}

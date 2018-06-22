package potwory;

public class Zombie extends Potwor{

    private int glod;

    public Zombie(){
        super();
    }

    public Zombie(int szybkosc, int hp)
    {
        super(szybkosc, hp);
    }

    public Zombie(int szybkosc, int hp, int glod)
    {
        super(szybkosc, hp);
        this.glod = glod;
    }

    @Override
    public void atakuj() {
        System.out.println("Zombie: Mniam!");
    }

    @Override
    public String toString() {
        return "Zombie" + " Hp: " + hp + " Szybkosc: " + szybkosc + " Glod: " + glod;
    }

}

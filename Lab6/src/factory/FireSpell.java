package factory;

public class FireSpell implements Spell
{
    @Override
    public void cast()
    {
        System.out.println("Сгори: Fireball!");
    }
}

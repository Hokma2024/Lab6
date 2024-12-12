package factory;

public class IceSpell implements Spell
{
    @Override
    public void cast()
    {
        System.out.println("Абсолютный ноль: Frostbite!");
    }
}

package factory;

public class SpellFactory
{
    public Spell createSpell(String type)
    {
        if (type == null)
        {
            return null;
        }

        if (type.equalsIgnoreCase("fire"))
        {
            return new FireSpell();
        }
        else if (type.equalsIgnoreCase("ice"))
        {
            return new IceSpell();
        }
        else
        {
            return null;
        }
    }
}

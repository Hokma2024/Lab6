package factory;
/*Реализовать фабрику для создания заклинаний.
Создайте класс SpellFactory, в котором будет метод createSpell(String type). Для "fire" создается объект класса FireSpell,
 а для "ice" — объект класса IceSpell. Заклинания должны реализовать интерфейс Spell с методом cast().
 */
public class Main
{
    public static void main(String[] args)
    {
        SpellFactory spellFactory = new SpellFactory();

        Spell fireSpell = spellFactory.createSpell("fire");
        fireSpell.cast();

        Spell iceSpell = spellFactory.createSpell("ice");
        iceSpell.cast();

        Spell unknownSpell = spellFactory.createSpell("earth");
        if (unknownSpell != null)
        {
            unknownSpell.cast();
        }
        else
        {
            System.out.println("Unknown spell type.");
        }
    }
}

package Observer;

public class ClockDisplay implements Observer
{
    private String name;

    public ClockDisplay(String name)
    {
        this.name = name;
    }

    @Override
    public void update(String time)
    {
        System.out.println(name + " Уведомление: " + time);
    }
}

package Observer;

import java.util.ArrayList;
import java.util.List;

public class Clock
{
    private List<Observer> observers = new ArrayList<>();
    private int secondsPassed = 0;

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void notifyObservers()
    {
        String currentTime = "Текущее время: " + secondsPassed + " секунд";
        for (Observer observer : observers)
        {
            observer.update(currentTime);
        }
    }

    public void tick()
    {
        secondsPassed++;
        if (secondsPassed % 60 == 0)
        {
            notifyObservers();
        }
    }
}

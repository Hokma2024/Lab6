package Observer;
/*
Реализовать систему уведомлений о текущем времени.
Создайте класс Clock с методом tick(), который уведомляет всех подписчиков каждые 60 секунд.
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Clock clock = new Clock();

        ClockDisplay display1 = new ClockDisplay("Display 1");
        ClockDisplay display2 = new ClockDisplay("Display 2");

        clock.addObserver(display1);
        clock.addObserver(display2);

        for (int i = 0; i < 180; i++)
        {
            clock.tick();
            Thread.sleep(100);
        }
    }
}


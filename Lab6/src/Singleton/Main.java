package Singleton;
/*
Реализовать Singleton для отслеживания достижений игрока.
Создайте класс AchievementTracker, в котором будет поле achievements (список достижений, List<String>) и методы getInstance(),
 addAchievement(String achievement), getAchievements(). Каждое достижение и время его получения записываются в файл.
 */
public class Main
{
    public static void main(String[] args)
    {
        AchievementTracker tracker = AchievementTracker.getInstance();

        tracker.loadAchievementsFromFile();

        tracker.addAchievement("Завершена первая миссия");
        tracker.addAchievement("Получен новый уровень");

        System.out.println("Достижения игрока:");
        for (String achievement : tracker.getAchievements())
        {
            System.out.println(achievement);
        }
    }
}

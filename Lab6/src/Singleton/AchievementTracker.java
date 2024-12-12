package Singleton;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AchievementTracker
{
    private static AchievementTracker instance;
    private List<String> achievements;
    private static final String FILE_NAME = "achievements.txt";

    private AchievementTracker()
    {
        achievements = new ArrayList<>();
    }

    public static synchronized AchievementTracker getInstance()
    {
        if (instance == null)
        {
            instance = new AchievementTracker();
        }
        return instance;
    }

    public void addAchievement(String achievement)
    {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        String timestampedAchievement = achievement + " (получено: " + timestamp + ")";
        achievements.add(timestampedAchievement);
        saveToFile(timestampedAchievement);
    }

    public List<String> getAchievements()
    {
        return new ArrayList<>(achievements);
    }

    private void saveToFile(String achievement)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true)))
        {
            writer.write(achievement);
            writer.newLine();
        }
        catch (IOException e)
        {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    public void loadAchievementsFromFile()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                achievements.add(line);
            }
        }
        catch (IOException e)
        {
            System.err.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }
}

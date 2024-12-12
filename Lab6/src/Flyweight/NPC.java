package Flyweight;

public class NPC
{
    private String model;
    private String textures;
    private int x;
    private int y;
    private int z;

    public NPC(String model, String textures, int x, int y, int z)
    {
        this.model = model;
        this.textures = textures;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getModel()
    {
        return model;
    }

    public String getTextures()
    {
        return textures;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getZ()
    {
        return z;
    }

    public void setPosition(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void printInfo()
    {
        System.out.println("NPC [Тип=" + model + ", Текстура=" + textures + ", Позиция=(" + x + ", " + y + ", " + z + ")]");
    }
}

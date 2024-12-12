package Flyweight;
import java.util.ArrayList;
import java.util.List;

public class NPCFactory
{
    private List<NPC> pool;
    private String model;
    private String textures;
    private int poolSize;

    public NPCFactory(String model, String textures, int poolSize)
    {
        this.model = model;
        this.textures = textures;
        this.poolSize = poolSize;
        pool = new ArrayList<>();
        for (int i = 0; i < poolSize; i++)
        {
            pool.add(createNewNPC(i));
        }
    }

    private NPC createNewNPC(int index)
    {
        return new NPC(model, textures, index * 10, index * 10, 0);
    }

    public NPC getNPC() {
        if (pool.size() > 0)
        {
            NPC npc = pool.remove(pool.size() - 1);
            System.out.println("NPC получен из пула");
            return npc;
        }
        else
        {
            System.out.println("В пуле больше нет NPC, создаём нового");
            return createNewNPC(poolSize++);
        }
    }

    public void releaseNPC(NPC npc)
    {
        pool.add(npc);
        System.out.println("NPC возвращён в пул");
    }
}

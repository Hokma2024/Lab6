package Flyweight;
/*
Реализовать пул объектов для NPC.
Создайте класс NPC с общими характеристиками, такими как модель и текстуры, но с уникальной позицией. Реализуйте фабрику для управления их созданием.
 */
public class Main
{
    public static void main(String[] args)
    {
        NPCFactory npcFactory = new NPCFactory("Человек", "Житель", 5);

        NPC npc1 = npcFactory.getNPC();
        npc1.printInfo();

        NPC npc2 = npcFactory.getNPC();
        npc2.printInfo();

        npc1.setPosition(100, 150, 200);
        npc1.printInfo();

        npcFactory.releaseNPC(npc1);
        npcFactory.releaseNPC(npc2);

        NPC npc3 = npcFactory.getNPC();
        npc3.printInfo();
    }
}


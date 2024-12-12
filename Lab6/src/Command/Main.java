package Command;
/*
Реализовать систему управления атакой и защитой башни.
Создайте команды ActivateTurrets и DeployShield для управления башнями через класс TowerController.
 */
public class Main
{
    public static void main(String[] args)
    {
        TowerController towerController = new TowerController();

        Command activateTurrets = new ActivateTurrets(towerController);
        Command deployShield = new DeployShield(towerController);

        Invoker invoker = new Invoker();

        invoker.setCommand(activateTurrets);
        invoker.executeCommand();

        invoker.setCommand(deployShield);
        invoker.executeCommand();
    }
}


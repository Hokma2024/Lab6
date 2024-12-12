package Command;

public class ActivateTurrets implements Command
{
    private TowerController towerController;

    public ActivateTurrets(TowerController towerController)
    {
        this.towerController = towerController;
    }

    @Override
    public void execute()
    {
        towerController.activateTurrets();
    }
}


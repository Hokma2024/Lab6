package Command;

public class DeployShield implements Command
{
    private TowerController towerController;

    public DeployShield(TowerController towerController)
    {
        this.towerController = towerController;
    }

    @Override
    public void execute()
    {
        towerController.deployShield();
    }
}

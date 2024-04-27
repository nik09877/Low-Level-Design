package problems.Undo_Redo;

public class TurnOnACCommand implements ICommand{

    AirConditioner ac;

    public TurnOnACCommand(AirConditioner ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOnAC();
    }

    @Override
    public void undo() {
        ac.turnOffAC();
    }
}

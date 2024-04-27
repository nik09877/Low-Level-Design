package problems.Undo_Redo;

public class TurnOffACCommand implements ICommand{
    AirConditioner ac;
    public  TurnOffACCommand(AirConditioner ac){
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

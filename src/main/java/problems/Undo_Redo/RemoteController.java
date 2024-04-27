package problems.Undo_Redo;

import java.util.Stack;

public class RemoteController {
    Stack<ICommand> acCommandHistory = new Stack<>();
    ICommand command;

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void pressButton(){
        acCommandHistory.add(command);
        command.execute();
    }

    public void undo(){
        if(!acCommandHistory.empty()){
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}

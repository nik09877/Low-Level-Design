package problems.Undo_Redo;

public interface ICommand {
    void execute();
    void undo();
}

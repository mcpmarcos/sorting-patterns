package sort.patterns.sortcommand;

public class SortInvoker {

    Command command;

    public SortInvoker() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public Integer[] executeCommand() {
        return command.execute();
    }
}

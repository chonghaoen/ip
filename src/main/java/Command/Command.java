package Command;

import Utility.TaskList;
import Utility.Ui;
import Utility.Storage;

public abstract class Command {
    public abstract void execute(TaskList list, Ui ui, Storage s);

    public abstract boolean isExit();
}

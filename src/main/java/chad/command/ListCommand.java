package chad.command;

import chad.utility.Storage;
import chad.utility.TaskList;
import chad.utility.Ui;

/**
 * Represents a command to show the current {@link TaskList}.
 */
public class ListCommand extends Command {

    /**
     * Shows the current task list.
     *
     * @param list the task list
     * @param ui Chad UI
     * @param s Chad Storage
     */
    public void execute(TaskList list, Ui ui, Storage s) {
        ui.listTasks(list.getList());
    }

    public boolean isExit() {
        return false;
    }
}

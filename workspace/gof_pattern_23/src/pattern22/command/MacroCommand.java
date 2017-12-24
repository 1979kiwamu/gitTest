package pattern22.command;

import java.util.Stack;

public class MacroCommand implements Command {

    private Stack commands = new Stack();

    @Override
    public void execute() {

        commands.forEach(c -> {
             Command cmd = (Command)c;
             cmd.execute();
        });
    }

    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }

    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }


}

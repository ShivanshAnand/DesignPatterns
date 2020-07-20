public class MacroCommand implements Command {
  
  Command[] onCommands;
  
  public MacroCommand(Command[] onCommands) {
    this.onCommands = onCommands;
  }
  
  public void execute() {
    for(int i=0; i<onCommands.length; i++)
      onCommands[i].execute();
  }
  
  public void undo() {
    for(int i=0; i<onCommands.length; i++)
      onCommands[i].undo();
  }
}
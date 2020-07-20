public class RemoteControl {
  
  Command[] onCommands;
  Command[] offCommands;
  Command undoCommand;
  final int slots = 7;
  
  RemoteControl() {
    onCommands = new Command[slots];
    offCommands = new Command[slots];
    Command nc = new NoCommand();
    undoCommand = nc;
    for(int i=0; i<slots; i++) {
      onCommands[i] = nc;
      offCommands[i] = nc;
    }
  }
  
  public void setCommand(int slot, Command onCommand, Command offCommand) {
    if(slot > 0 && slot < slots) {
      onCommands[slot-1] = onCommand;
      offCommands[slot-1] = offCommand;
    }
  }
  
  public void on(int slot) {
    if(slot > 0 && slot < slots) {
      onCommands[slot-1].execute();
      undoCommand = onCommands[slot-1];
    }
  }
  
  public void off(int slot) {
    if(slot > 0 && slot < slots) {
      offCommands[slot-1].execute();
      undoCommand = offCommands[slot-1];
    }
  }
  
  public void undo() {
    undoCommand.undo();
  }
  
}
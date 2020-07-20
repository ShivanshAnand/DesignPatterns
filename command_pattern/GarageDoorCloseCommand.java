public class GarageDoorCloseCommand implements Command {
  private GarageDoor gd;
  public GarageDoorCloseCommand(GarageDoor gd) { this.gd = gd; }
  public void execute() { gd.lightOff(); gd.down(); gd.stop(); }
  public void undo() { gd.up(); gd.stop(); gd.lightOn(); }
}
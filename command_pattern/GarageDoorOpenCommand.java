public class GarageDoorOpenCommand implements Command {
  private GarageDoor gd;
  public GarageDoorOpenCommand(GarageDoor gd) { this.gd = gd; }
  public void execute() { gd.up(); gd.stop(); gd.lightOn(); }
  public void undo() { gd.lightOff(); gd.down(); gd.stop(); }
}
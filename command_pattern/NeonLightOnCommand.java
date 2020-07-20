public class NeonLightOnCommand implements Command{
  private NeonLight light;
  public NeonLightOnCommand(NeonLight light) {
    this.light = light;
  }
  public void execute() {
    light.on();
  }
  public void undo() {
    light.off();
  }
}
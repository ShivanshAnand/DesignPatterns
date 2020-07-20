public class NeonLightOffCommand implements Command {
  private NeonLight light;
  public NeonLightOffCommand(NeonLight light) {
    this.light = light;
  }
  public void execute() {
    light.off();
  }
  public void undo() {
    light.on();
  }
}
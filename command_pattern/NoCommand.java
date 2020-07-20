public class NoCommand implements Command {
  public void execute() {
    System.out.println("Click click ! : No Command is set here");
  }
  public void undo() {
    System.out.println("Click click ! : No Command is set here");
  }
}
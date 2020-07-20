
/*---------------
  ------  -------
  -----    ------
  ---  BTN   ----
  ---        ----
  -----    ------
  ------  -------
  ---------------  A REMOTE WITH ONE BUTTON */

public class SimpleRemoteControl {
  Command cmd;
  public SimpleRemoteControl() {}
  public void setCommand(Command cmd) { this.cmd = cmd; }
  public void btnPress() { cmd.execute(); }
}
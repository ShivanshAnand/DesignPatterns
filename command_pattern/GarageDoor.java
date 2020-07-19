public class GarageDoor {
  String state = "door closed";
  public void up() { state = "door up" }
  public void down() { state = "door closed" }
  public void stop() {}
  public void lightOn() {}
  public void lightOff() {}
}
public class GarageDoor {
  String state = "door closed";
  final String name = "Garage Door";
  public void up() { state = "door up"; System.out.println(name + " " +state);}
  public void down() { state = "door closed"; System.out.println(name + " " +state); }
  public void stop() {}
  public void lightOn() {}
  public void lightOff() {}
}
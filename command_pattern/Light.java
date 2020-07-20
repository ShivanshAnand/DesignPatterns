public class Light {
  String state = "OFF :|";
  final String name = "Light";
  public void on() {
    state = "ON :)";
    System.out.println(name + " " +state);
  }
  public void off() {
    state = "OFF :|";
    System.out.println(name + " " +state);
  }
}
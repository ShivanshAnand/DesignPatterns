public class Client {
  public static void main(String args[]) {
    SimpleRemoteControl src = new SimpleRemoteControl();
    Light light = new Light();
    LightOnCommand lo= new LightOnCommand(light);
    LightOffCommand lf= new LightOffCommand(light);
    src.setCommand(lo);
    src.btnPress();
    System.out.println(light.state);
    src.setCommand(lf);
    src.btnPress();
    System.out.println(light.state);
  }
}

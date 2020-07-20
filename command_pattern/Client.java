public class Client {
  public static void main(String args[]) {
    
    RemoteControl rc = new RemoteControl();
    
    Light light = new Light();
    LightOnCommand lo= new LightOnCommand(light);
    LightOffCommand lf= new LightOffCommand(light);
    
    GarageDoor gd = new GarageDoor();
    GarageDoorOpenCommand gdo = new GarageDoorOpenCommand(gd);
    GarageDoorCloseCommand gdc = new GarageDoorCloseCommand(gd);
    
    NeonLight nl = new NeonLight(1);
    NeonLightOnCommand nlo = new NeonLightOnCommand(nl);
    NeonLightOffCommand nloff = new NeonLightOffCommand(nl);
    
    Stereo st = new Stereo();
    StereoOnCommand son = new StereoOnCommand(st);
    StereoOffCommand soff = new StereoOffCommand(st);
    
    // in below commands inverse behaviour of light is being passed as I want to do something like this ->
    // 1. Light Off -> NeonLight On -> Stereo On ( General Party )
    // so passing light off in on commands and light on in off commands !
    Command[] onCommands = { lf, nlo, son };
    Command[] offCommands = { lo, nloff, soff };
    MacroCommand onMc = new MacroCommand(onCommands);
    MacroCommand offMc = new MacroCommand(offCommands);
    
    rc.setCommand(1, lo, lf);
    rc.setCommand(2, gdo, gdc);
    rc.setCommand(3, onMc, offMc);
    
    rc.on(3);
    rc.off(3);
    
    rc.undo(); // door up by undoing
    
  //  System.out.println(gd.state);
    
  }
}
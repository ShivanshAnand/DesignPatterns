public class NeonLight {
  String state = "off";
  String color;
  final String name = "Neon Light";
  public NeonLight(int i) {
    if(i==0)
      color = "Purple";
    else if(i==1)
      color = "Green";
    else if(i==2)
      color = "Orange-Yellow";
    else
      color = "Dark Blue";
  }
  public void on() { state = "on";  System.out.println(name + " (" +color + ") " +  state);}
  public void off() { state = "off";  System.out.println(name + " (" +color + ") " +state);}
}
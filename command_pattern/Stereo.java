public class Stereo {
  String state = "off";
  String song = "off";
  final String name = "Stereo";
  
  public Stereo() {
  }
  
  public void on() {
    state = "on";
    song = "PARTY ROCK - ANTHEM !";
    System.out.println(name + " on, playing " + song + " now !");
  }
  
  public void off() {
    state = "off";
    song = "off";
    System.out.println(name + " turned off !");
  }
}
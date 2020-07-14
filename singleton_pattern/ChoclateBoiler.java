// it's a singleton
public class ChoclateBoiler {
  
  private boolean empty;
  private boolean boiled;
  
  private static ChoclateBoiler boiler;
  
  //making the constructor private so that it can't be instantiated in any case !
  private ChoclateBoiler() {
    empty = true;
    boiled = false;
  }
  
  // synchronized keyword is there so that it can handle multi-threading properly
  public static synchronized ChoclateBoiler getInstance() {
    if(boiler == null) {
      boiler = new ChoclateBoiler();
    }
    return boiler;
  }
  
  public void fill() {
    if(isEmpty()) {
      empty = false;
      boiled = false;
      // fill it
    }
  }
  
  public void drain() {
    if(!isEmpty() && !isBoiled()) {
      empty = true;
      // drain
    }
  }
  
  public void boil() {
    if(!isEmpty() && !isBoiled()) {
      boiled = true;
      //boil
    }
  }
  
  private boolean isEmpty() {
    return empty;
  }
  
  private boolean isBoiled() {
    return boiled;
  }
  
  
}

import java.awt.image.BufferedImage;
import java.awt.Color;

public class InsetBorder implements BorderEffectBehaviour {
  
  private Color borderColor;
  private int borderWidth;
  
  public InsetBorder() {
    this.borderColor = new Color(255,255,255); //default
    this.borderWidth = 1; //default
  }
  
  public InsetBorder(Color borderColor) {
    this.borderColor = borderColor;
    this.borderWidth = 1; //default
  }
  
  public InsetBorder(int borderWidth) {
    this.borderColor = new Color(255,255,255); //default
    this.borderWidth = borderWidth;
  }
  
  public InsetBorder(Color borderColor, int borderWidth) {
    this.borderColor = borderColor; 
    this.borderWidth = borderWidth;
  }
  
  public void setBorderColor(Color borderColor) {
    this.borderColor = borderColor;
  }
  
  public void setBorderWidth(int borderWidth) {
    this.borderWidth = borderWidth;
  }
  
  public BufferedImage applyBorder(BufferedImage img) {
    
    if(borderWidth > img.getWidth() || borderWidth > img.getHeight())
      return img;
    
    for(int i=0; i<img.getHeight(); i++)
      for(int j=0; j<borderWidth; j++)
        img.setRGB(j,i, borderColor.getRGB());
    
    for(int i=0; i<img.getHeight(); i++)
      for(int j=img.getWidth() - borderWidth; j<img.getWidth(); j++)
        img.setRGB(j,i, borderColor.getRGB());
    
    for(int i=0; i<borderWidth; i++)
      for(int j=0; j<img.getWidth(); j++)
        img.setRGB(j,i, borderColor.getRGB());
    
    for(int i=img.getHeight()-borderWidth; i<img.getHeight(); i++)
      for(int j=0; j<img.getWidth(); j++)
        img.setRGB(j,i, borderColor.getRGB());
    return img;
  }
}
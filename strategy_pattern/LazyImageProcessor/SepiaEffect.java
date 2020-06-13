import java.awt.image.BufferedImage;
import java.awt.Color;

public class SepiaEffect implements ImageEffectBehaviour {

  public BufferedImage applyEffect(BufferedImage img) {
    for(int i=0; i<img.getHeight(); i++) {
      for(int j=0; j<img.getWidth(); j++) {
        Color c = new Color(img.getRGB(j,i));
        int r = c.getRed();
        int g = c.getGreen();
        int b = c.getBlue();
        int newRed = (int)(0.393*r + 0.769*g + 0.189*b);
        int newGreen = (int)(0.349*r + 0.686*g + 0.168*b);
        int newBlue = (int)(0.272*r + 0.534*g + 0.131*b); 
        if(newRed > 255)
          newRed = 255;
        if(newGreen > 255)
          newGreen = 255;
        if(newBlue > 255)
          newBlue = 255;
        c = new Color(newRed, newGreen, newBlue);
        img.setRGB(j, i, c.getRGB());
      }
    }
    return img;
  }
  
}
import java.awt.image.BufferedImage;
import java.awt.Color;

public class BlackAndWhiteEffect implements ImageEffectBehaviour {
  
  public BufferedImage applyEffect(BufferedImage img) {
    for(int i=0; i<img.getHeight(); i++) {
      for(int j=0; j<img.getWidth(); j++) {
        Color c = new Color(img.getRGB(j,i));
        int avg = (int)((c.getRed() + c.getGreen() + c.getBlue())/3);
        c = new Color(avg, avg, avg);
        img.setRGB(j, i, c.getRGB());
      }
    }
    return img;
  }
  
}
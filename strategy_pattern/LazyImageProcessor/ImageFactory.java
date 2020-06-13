import java.awt.image.BufferedImage;

public class ImageFactory {
  
  private BufferedImage img;
  
  public ImageFactory(BufferedImage img) {
    this.img = img;
  }
  
  public void applyEffect(ImageEffectBehaviour effect) {
    img = effect.applyEffect(img);
  }
  
  public void applyBorder(BorderEffectBehaviour effect) {
    img = effect.applyBorder(img);
  }
  
  public void setImage(BufferedImage img) {
    this.img = img;
  }
  
  public BufferedImage getImage() {
    return this.img;
  }
  
}
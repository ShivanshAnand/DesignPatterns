import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;

public class Demo {
  
  public static void main(String args[]) {
    
    try {
      File input = new File("images\\MtEverest.jpg");
      BufferedImage image = ImageIO.read(input);
      
      //filtering start (black and white filter)
      ImageFactory imgf = new ImageFactory(image);
      imgf.applyEffect(new BlackAndWhiteEffect());
      image = imgf.getImage();
      File ouptut = new File("images\\MtEverestBnW.jpg");
      ImageIO.write(image, "jpg" , ouptut);  
      
      // (sepia filter)
      imgf.setImage(image); //important to set image otherwise new filter will be applied to the image obtained by applying the previous filter (in this case the black and white image)
      imgf.applyEffect(new SepiaEffect());
      image = imgf.getImage();
      ouptut = new File("images\\MtEverestSepia.jpg");
      ImageIO.write(image, "jpg" , ouptut); 
      
      
      //filtering start (apply border to sepia image)
      imgf.applyBorder(new InsetBorder(new Color(200,20,75), 80)); //border width must be less than both height and width of image otherwise border won't get applied
      image = imgf.getImage();
      ouptut = new File("images\\MtEverestSepiaWithBorder.jpg");
      ImageIO.write(image, "jpg" , ouptut);
      //filtering end
      
      System.out.println("Done");
      
    } catch(IOException e) {
      System.out.println("FNF");
    }
    
  }
}

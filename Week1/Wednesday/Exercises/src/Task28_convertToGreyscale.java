import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Task28_convertToGreyscale {
	static void convertToGreyscale(String imgPath){
		File input = new File(imgPath);
		
		try {
			if(input.createNewFile()){
				throw new IOException("Image not found!");
			}
			
			BufferedImage image = ImageIO.read(input);
			
			int width = image.getWidth();
	        int height = image.getHeight();
	        
	        for(int i=0; i<height; i++){
	            for(int j=0; j<width; j++){
	               Color c = new Color(image.getRGB(j, i));
	               
	               int red = (int)(c.getRed() * 0.299);
	               int green = (int)(c.getGreen() * 0.587);
	               int blue = (int)(c.getBlue() *0.114);
	               
	               Color newColor = new Color(red+green+blue,red+green+blue,red+green+blue);
	               
	               image.setRGB(j,i,newColor.getRGB());
	            }
	        }
	        
	        File ouptut = new File("../grayscale.jpg");
	        ImageIO.write(image, "jpg", ouptut);
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

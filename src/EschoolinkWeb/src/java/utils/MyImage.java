/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author cjyuan
 */
public class MyImage {
    BufferedImage img = null;

    int width, height;
    
    public void read(String path) throws IOException {
        img = null;
        img = ImageIO.read(new File(path));
        
        if (img == null)
            throw new IOException("Failed to read " + path);
        
        width = img.getWidth();
        height = img.getHeight();
    }
    
    public void write(String path) throws IOException {
        write(path, "jpg");
    }
    
    public void write(String path, String imgType) throws IOException {
        File outputfile = new File(path);
        ImageIO.write(img, imgType, outputfile);
    }
    
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    

    
    public void scaleToFit(int newW, int newH) {
                
        double hScale = (double)newW / width;
        double vScale = (double)newH / height;
        
        if (vScale < hScale) {
            newW = (int)(width * vScale + 0.5);
        }
        else {
            newH = (int)(height * hScale + 0.5);
        }
        
        resize(newW, newH);
    }
    
    public void resize(int newW, int newH) {
        if (img == null)
            return;
        
        BufferedImage newImg = new BufferedImage(newW, newH, img.getType());  
        Graphics2D g = newImg.createGraphics();  
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                           RenderingHints.VALUE_INTERPOLATION_BILINEAR);  
        g.drawImage(img, 0, 0, newW, newH, 0, 0, width, height, null);
        
        img = newImg;
    }

}

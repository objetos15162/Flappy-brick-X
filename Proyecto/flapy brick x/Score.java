import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class Score here.
 * va incfemenentado el record
 * @author (Enrique Martinez Ramirez)
 * @author (Patricio Martinez)
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage newImage = new GreenfootImage(100,130);
        setImage(newImage);
    }   
    /**
     * incrementa el score y lo imprime en pantalla
     * @param score
     */public void setScore(int score)
    {
        GreenfootImage newImage = getImage();
        newImage.clear();
        Font f = new Font("Verdana",Font.BOLD,36);
        newImage.setFont(f);
        Color c = new Color(127,127,0,125);
        newImage.setColor(c);
        newImage.fill();
        newImage.setColor(Color.black);
        newImage.drawString("" + score,30,50);
        setImage(newImage);
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TuberiaArri here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TuberiaArri extends Actor
{
    int VELOCIDAD = -4; // velocidad con las que se mueven las tuberias
    int lv;// para saber el nievel en el que se encuentra
    /**
     * constrcutor de tuberia
     * @param nivel
     */public TuberiaArri(int Nivel)
    {
        lv = Nivel; 
    }
    /**
     * Act - do whatever the TuberiaArri wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() + (VELOCIDAD*lv) , getY());
    }    
}

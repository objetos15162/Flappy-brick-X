import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TuberiaAba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TuberiaAba extends Actor
{
    int VELOCIDAD = -4;
    int lv;
    public TuberiaAba(int Nivel)
    {
        lv = Nivel; 
    }
    /**
     * Act - do whatever the TuberiaAba wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setLocation(getX() + (VELOCIDAD*lv), getY());
    }    
}

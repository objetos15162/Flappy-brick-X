import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tmitad here.
 * 
 * @author (Enrique Martinez Ramirez) 
 * @author (Patricio Martinez )
 * @version (a version number or a date)
 */
public class Tmitad extends Actor
{
    int VELOCIDAD = -4;// velocidad con la que se mueve la tuberia
    int lv;//indica el nivel en el que estas
    public Tmitad(int Nivel)
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

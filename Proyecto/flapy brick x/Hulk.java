import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hulk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hulk extends Personajes
{
    private GreenfootImage imagen1;
    private GreenfootImage imagen2;
    public Hulk()
    {
        imagen1=new GreenfootImage("hulk1.png");
        imagen2=new GreenfootImage("hulk2.png");
    }
    
    /**
     * Act - do whatever the Hulk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), (int)(getY()+ dy));
        Movimiento(imagen1,imagen2);
        Choca();
        Bala();
    }   

}

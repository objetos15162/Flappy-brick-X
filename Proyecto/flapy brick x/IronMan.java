import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IronMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IronMan extends Personajes
{
    private GreenfootImage imagen1;//crea una variable de tipo imagen
    private GreenfootImage imagen2;
    /**
     * Asigna la immagen correspondiente a cada variable.
     */
    public IronMan()
    {
        imagen1=new GreenfootImage("iron1.png");
        imagen2=new GreenfootImage("iron2.png");
    }
    /**
     * Act - do whatever the IronMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), (int)(getY()+ dy));
        Choca();
        Bala();
        Movimiento(imagen1,imagen2);
    }
    
}

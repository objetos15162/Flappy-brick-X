import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goku here.
 * 
 * @author (Enrique Martinez Ramirez) 
 * @version (1.0)
 */
public class Goku extends Personajes
{
    private GreenfootImage imagen1;//crea una varible de tipo imagen
    private GreenfootImage imagen2;
    /**
     *Asigna la imagen adecuad acada variable 
     */
    public Goku()
    {
        imagen1=new GreenfootImage("goku1.png");
        imagen2=new GreenfootImage("goku3.png");
    }
    /**
     * Act - do whatever the Goku wants to do. This method is called whenever
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

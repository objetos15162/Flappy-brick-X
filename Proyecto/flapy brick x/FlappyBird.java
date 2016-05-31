import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlappyBird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlappyBird extends Personajes
{
    /**
     * Act - do whatever the FlappyBird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Personajes per = new Personajes();
        //per.PosicionInicial();
        setLocation(getX(), (int)(getY()+ dy));
        Mueve();
        rotacion();
        Choca();
        Bala();
    }    
}

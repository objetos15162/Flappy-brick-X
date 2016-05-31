import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Disparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Disparo extends Actor
{
    int numImagen =  1;//numero de la imagen
    int velocidad = 4;//velocidad con la que se mueva la imagen
    
    
    /**
     * Act - do whatever the Disparo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage("bala/bala "+numImagen+".png");//ruta de las imagenes bala
         setLocation(getX()+velocidad,getY());
        if((getX()>=getWorld().getWidth()-5)||(getX()<=5))
        {
            getWorld().removeObject(this);
        }
        else
        {
        if(numImagen < 16)
           numImagen ++;
        else
           numImagen = 1;
        }
         
        

    }    
}

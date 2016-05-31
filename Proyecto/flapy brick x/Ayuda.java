import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends World
{
    B_regreso reg = new B_regreso();
    /**
     * Constructor for objects of class Ayuda.
     * 
     */
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
   
        showText("Tecla arriba para saltar", 120, 30);
        showText("Espacio para disparar a los cubos", 190, 60);
        showText("¡No toques las tuberias!",120, 90);
        addObject(reg,150, 350);

    }
    public void act()
    {
                
         if(Greenfoot.getMouseInfo()!=null)
         {
         if(Greenfoot.mousePressed(reg))
         {
             //removeObject(reg);
             Greenfoot.delay(30);
             Greenfoot.setWorld(new Menu());
             
          }
        }
    }
}


import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hongo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hongo extends Bonus
{
    /**
     * Act - do whatever the Hongo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         TocaDisparo();
         
    } 
   /*private void Comprueba()
    {
        if(Crea() % 7 == 0)
           {
               AgregaEnemigo();
               Incrementa();
           }
        if(TocaDisparo() == true) 
           Decrementa();
        if(RegresaValor() == 5)
           Greenfoot.stop();
    }*/
}

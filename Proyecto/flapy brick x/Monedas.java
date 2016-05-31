 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

 /**
  * Write a description of class Monedas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monedas extends Bonus
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
        if(Crea() % 5 == 0)
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

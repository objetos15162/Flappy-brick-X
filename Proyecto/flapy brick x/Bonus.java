import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonus here.
 * 
 * @author (Enrique Martinez Ramirez) 
 * @version (a version number or a date)
 */
public class Bonus extends Actor
{
    int cont=0;
    int aux;
    Boolean crear = false;
    
    World mundo = (Escenario) getWorld();
    /**
     * Act - do whatever the Bonus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    /**
     * checa si el disparo toco un objeto
     */
    public Boolean TocaDisparo()
    {
         if(getOneIntersectingObject(Disparo.class) != null)
         {
           getWorld().removeObject(this);
           crear = true;
         }
         return crear;
    }
    public void AgregaEnemigo()
    {
      mundo.addObject(this,330,Greenfoot.getRandomNumber(350));  
    }

    public void Incrementa()
    {
        cont++;
    }
    public void Decrementa()
    {
        cont--;
    }
    public int RegresaValor()
    {
      return cont;     
    }
    /*public int Crea()
    { 
        World mundo = (Escenario) getWorld();
        Escenario es= (Escenario)mundo;
        aux = es.CreaLadrillos();
        System.out.println((int)aux);
        return aux;
    }*/
}

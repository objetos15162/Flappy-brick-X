import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personajes here.
 * Aqui se encuentran todo los metodo necesarios para que los personajes se pueden mover.
 * @author (Enrique Martinez Ramirez)
 * @autor (patricio)
 * @version (a version number or a date)
 */
public class Personajes extends Actor
{   public double dy = 0;//direccion en y
    private double g = .5;//gravedad con la que cae el personaje
    private double BOSST_SPEED = -7;//velocidad con la que sube el personaje
    private boolean bandDisp=false;
    
    /**
     * Act - do whatever the Personajes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }
    /**
     * Genera la imagen Gameover
     * La agrega al mundo
     * Detiene el juego
     * No recibe parametros
     */
    public void displayGameOver()
    {
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver,getWorld().getWidth()/2,getWorld().getWidth()/2);
        //Greenfoot.stop();
        Greenfoot.delay(3000);
        Greenfoot.setWorld( new Menu());
    }
    /**
     * Se encaga de la rotacion del personaje dependiendo de la direccion en y
     */
    public void rotacion()
    {
        if( dy > 1)
          setRotation(30);
        else if(dy < 1)
          setRotation(-30);
    }
    /**
     * Detecta si hubo un choque con las tuberias
     */
    public void Choca()
    {
         //if ppara saber si se toca las Tuberias
        if(getOneIntersectingObject(TuberiaAba.class) != null || getOneIntersectingObject(TuberiaArri.class) != null 
        || getOneIntersectingObject(Tmitad.class) != null)
        {
          displayGameOver();
        }
        else if(getY() > getWorld().getHeight())
        {
          displayGameOver();
        }
    }
    /**
     * Hace que el jugador salte solo para FLAPPY.
     */
    public void Mueve()
    {
        if(Greenfoot.isKeyDown("up") == true)
        {
            dy = BOSST_SPEED;
        }
        dy = dy + g;
    }
    /**
     * Se encarga de disparar y dibujar la bala
     */
    public void Bala()
    {
        if(bandDisp && Greenfoot.isKeyDown("space"))
        {
            Disparo bala = new Disparo();
            getWorld().addObject(bala,getX(),(int)(getY()+ dy));
            bandDisp = false;
        }
        if(!bandDisp && !Greenfoot.isKeyDown("space"))
        {
            bandDisp = true;
        }
    }
    /**
     * Mueve a los demas personajes creando un efecto de animacion
     */
    public void Movimiento(GreenfootImage imagen1,GreenfootImage imagen2)
    {
        if(Greenfoot.isKeyDown("up") == true)
        {
            setImage(imagen2);
            dy = BOSST_SPEED;
        }
        else
           setImage(imagen1);
        dy = dy + g;
    }
}

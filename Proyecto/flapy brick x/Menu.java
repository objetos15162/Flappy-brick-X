import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Menu here.
 * 
 * @author (Enrique MAtinez Ramirez) 
 * @version (1.0)
 */
public class Menu extends World
{
    Play play = new Play();//craar boton play
    B_ayuda ayu = new B_ayuda();
    B_record rec = new B_record();
    B_flappy boton_flappy = new B_flappy();//crear boton flppay
    B_goku boton_goku = new B_goku();//crear boton goku
    B_hulk boton_hulk = new B_hulk();//crear boton hulk
    B_iron boton_iron = new B_iron();//crear boton iron
    GreenfootSound sound = new GreenfootSound("Yeah.wav");//crear pista de sonido

    /**
     * Constructor for objects of class Menu.
     * Crea la pantalla .
     * agrega el boton play.
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(play,300, 350);// agregar el boton de play
        addObject(ayu,100,350); //ayuda
        addObject(rec,500,350); // record
       
    }
    /**
     * Checa cooordenaas del mause.
     * Verifica si se precionan los botones.
     * Cambia de mundo y manda la opcion del personaje a crear.
     */
    public void act()
    {
        
        if(Greenfoot.getMouseInfo()!=null)//indica las coordenadas del mause
         {
             sound.play();//reproducir sonido
             
             if(Greenfoot.mousePressed(play))//verifica si se preciona boton
             {
                 removeObject(play);
                 removeObject(ayu);
                 removeObject(rec);
                 setBackground("fondo_flappy.png");//cambia el fondo
                 showText("Selecciona tu Personaje ", 300,20);
                 addObject(boton_flappy,300,120);
                 addObject(boton_goku,300,190);
                 addObject(boton_hulk,300,260);
                 addObject(boton_iron,300,330);    
                }
             if(Greenfoot.mousePressed(ayu))//verifica boton ayuda
             {
                  sound.stop();
                 Greenfoot.setWorld(new Ayuda());
             }
             if(Greenfoot.mousePressed(rec))//verifica boton ayuda
             {
                  sound.stop();
                 Greenfoot.setWorld(new Records());
             }
                   if(Greenfoot.mousePressed(boton_flappy))
                  {
                    removeObject(boton_flappy);
                    removeObject(boton_goku);
                    removeObject(boton_hulk);
                    removeObject(boton_iron);
                    sound.stop();
                    Greenfoot.setWorld(new Escenario(1));//cambia el escenerio
                  }
                 else
                 {
                    if(Greenfoot.mousePressed(boton_goku))
                    {
                     removeObject(boton_flappy);
                     removeObject(boton_goku);
                     removeObject(boton_hulk);
                     removeObject(boton_iron);
                     sound.stop();
                     Greenfoot.setWorld(new Escenario(2));
                    }
                    else
                      if(Greenfoot.mousePressed(boton_hulk))
                       {
                        removeObject(boton_flappy);
                        removeObject(boton_goku);
                        removeObject(boton_hulk);
                        removeObject(boton_iron);
                        sound.stop();
                        Greenfoot.setWorld(new Escenario(3));
                       }
                      else
                       if(Greenfoot.mousePressed(boton_iron))
                        {
                         removeObject(boton_flappy);
                         removeObject(boton_goku);
                         removeObject(boton_hulk);
                         removeObject(boton_iron);
                         sound.stop();
                         Greenfoot.setWorld(new Escenario(4));
                        }
             }
         } 
    }

}

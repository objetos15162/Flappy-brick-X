import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int puntos;
    private String name;
    public Player()
    {
    }
    public Player(String n, int pun){
        puntos=pun;
        name=n;
    }
    public void act() 
    {
        // Add your action code here.
    }    
    public void setName(String nombre){
        name = nombre;
    }
    
     public void setPoints(int p){
        puntos = p;
    }
     public String getName(){
        return name;
    }
    public int getPoints(){
        return puntos;
    }   
}

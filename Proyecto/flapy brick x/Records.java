import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends World
{

    private Rec Act;
    B_regreso salir = new B_regreso();
    public Records()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        setBackground("fondo-noche.png");
        
        Act=new Rec();

        addObject(salir,500,50);
        
        
        
    }
    public void act()
    {
       this.escribeRecords();
       if(Greenfoot.getMouseInfo()!=null){ 
            if(Greenfoot.mousePressed(salir))
            {
                Greenfoot.delay(30);
                
                Greenfoot.setWorld(new Menu());
            }
        }
    }
    
    public void escribeRecords(){
        int y1 = 170;
           for(Player aux : Act.escribeTabla())
            {
                showText(aux.getName(),200,y1);
                showText(aux.getPoints()+"",400,y1);
                y1 = y1 + 30;
            }
    }
    
}

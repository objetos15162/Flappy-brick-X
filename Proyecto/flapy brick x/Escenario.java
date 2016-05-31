import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo
/**
 * Write a description of class Escenario here.
 * 
 * @author (Martinez Ramirez Enrique) 
 * @version (a version number or a date)
 */
public class Escenario extends World
{
    int tubeCont = 0; //Contador de tuberias
    int FlapyCont = 0; // contador de personaje(s)
    int ESPACIO_TUBOS = 150; // el espacio entre tubos
    int score = 0; // puntos
    int PRIMER_TUBE = 240; //el primer tubo
    Score scoreObj = null; //Creacion de un objeto de la clase Score
    private int Nivel=1; //contador de niveles
    private String lv = "DIOS"; //Cadena para poner el nivel mas dificil
    FlappyBird flappy = new FlappyBird(); //Creacion del personaje
    Goku goku = new Goku();
    IronMan iron = new IronMan();
    Hulk hulk = new Hulk();
    
    GreenfootSound soundmario = new GreenfootSound("Mario.wav");
   /**
     * Constructor for objects of class Escenario.
     * 
     */
    public Escenario()
    {    
        // Crea un nuevo mundo con 600x400 celdas de 1x1 px
        super(600, 400, 1); 
       Greenfoot.setWorld(new Menu());   
    }
    public Escenario(int num)
    {
        super(600,400,1,false);
         soundmario.play();
        if(num == 1)
           addObject(flappy,100,100);  
        if(num == 2)
           addObject(goku,100,100);
        if(num == 3)
           addObject(hulk,100,100);
        if(num == 4)
            addObject(iron,100,100); //Selecciona al personaje
         
        scoreObj = new Score();
        scoreObj.setScore(0);  
    }
    /**
     * Funcion para comenzar el juego
     */
    public void act()
    {
      Tuberias(); //Crea Tuberias
      showText("Record: 45 ", 300,20); 
      showText("Puntos:"+score, 300,40);
      if ( Nivel<=3)
        showText("Nivel: "+Nivel, 300, 60);
      if (Nivel == 4)
        showText("Nivel: "+lv, 300, 60);
    }
    /**
     * Funcion para crear las tuberias de tipo 2
     */
    private void CreaTuberias()
    {
        if (score<10)
        {
            CreaTuberiasMitad();
        }
        
        if(score >=10 && score <=20)
        {
           Nivel = 2;
           setBackground("fondo-noche.png");
            TuberiaArri Arriba = new TuberiaArri(Nivel);
            TuberiaAba Abajo = new TuberiaAba(Nivel);
   
            GreenfootImage Tabajo = Abajo.getImage();
            GreenfootImage Tarriba = Arriba.getImage();
            addObject(Abajo,getWidth(), getHeight()/2 + Tabajo.getHeight()-Greenfoot.getRandomNumber(190));
            addObject(Arriba,getWidth(), Abajo.getY() - Tarriba.getHeight()-ESPACIO_TUBOS);
        }  
        else if(score > 20 && score <= 30){
            Nivel=3;
            TuberiaArri Arriba = new TuberiaArri(Nivel);
            TuberiaAba Abajo = new TuberiaAba(Nivel);
   
            GreenfootImage Tabajo = Abajo.getImage();
            GreenfootImage Tarriba = Arriba.getImage();
            addObject(Abajo,getWidth(), getHeight()/2 + Tabajo.getHeight()-Greenfoot.getRandomNumber(190));
            addObject(Arriba,getWidth(), Abajo.getY() - Tarriba.getHeight()-ESPACIO_TUBOS);
        }
        
        else if(score > 30){
            Nivel =4;
            TuberiaArri Arriba = new TuberiaArri(Nivel);
            TuberiaAba Abajo = new TuberiaAba(Nivel);
   
            GreenfootImage Tabajo = Abajo.getImage();
            GreenfootImage Tarriba = Arriba.getImage();
            addObject(Abajo,getWidth(), getHeight()/2 + Tabajo.getHeight()-Greenfoot.getRandomNumber(190));
            addObject(Arriba,getWidth(), Abajo.getY() - Tarriba.getHeight()-ESPACIO_TUBOS);
        }
    }
    /**
     * Funcion para crear tuberisas de tipo 1
     */
    private void CreaTuberiasMitad()
    {
        Tmitad Mitad = new Tmitad(Nivel);
        GreenfootImage Tm = Mitad.getImage();
        
        addObject(Mitad,getWidth(), getHeight()/2 + Tm.getHeight()-Greenfoot.getRandomNumber(190));
    }
    /**
     * Funcion para hacer las tuberias y colocarlas en el mundo
     */
    private void Tuberias()
    {
        tubeCont ++;
      if(Nivel != 4){
        if( tubeCont % 100 == 0)
        {
            //crear tuberias
            CreaTuberias();
        }
        
        if( tubeCont % 100 == 50)
        {
            if(Nivel == 3)
                    CreaTuberiasMitad(); 
        }
      }  
      if(Nivel ==4)
      {
        if( tubeCont % 50 == 0)
        {
            //crear tuberias
            CreaTuberias();
        }
    
        if( tubeCont % 150 == 75)
        {
            CreaTuberiasMitad(); 
        }
      }
      if( tubeCont>= PRIMER_TUBE)
        {
            if(FlapyCont % 100 == 0)
            {
              score++;
              scoreObj.setScore(score); 
              if(score == 45)
                 setgana();
              CreaLadrilos(score);
            }
            FlapyCont ++;
        }
    }

    /**
     * Funcion para crear los ladrillos que aparecen en el mundo
     */
    public void CreaLadrilos(int num)
    {
        Monedas mon = new Monedas();
        Ladrillo lan = new Ladrillo();
        Hongo hongo = new Hongo();
        if(num % 2 == 0)
        {
          addObject(lan,300,Greenfoot.getRandomNumber(400));
        }
        else
        if(num % 5 == 0)
        {
          addObject(mon,300,Greenfoot.getRandomNumber(400));
        }
        else
        if(num % 7 == 0)
        {
          addObject(hongo,300,Greenfoot.getRandomNumber(400));
        } 
    }
     public void setgana()
    {  
       
        Rec R=new Rec();
        //Ganaste g=new Ganaste();
        
        String nombre=Greenfoot.ask("Dame tu nombre: ");
        Player p=new Player(nombre,score);
        R.add(p);
        //addObject(g,300,200);
        Greenfoot.delay(100);
        //removeObject(g);
        Greenfoot.setWorld(new Menu());
    }
 
}
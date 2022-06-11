import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    //private int lastPipe = 300;
    private boolean isLost; 
    //private Timer pipeTimer = new Timer();
    private Amir Amir = new Amir();
    //private Amir hati = new Amir();
    private int actCount; // the counter field
    private Actor timeDisplay; // the time display actor
    private Actor hati;
    //private static GreenfootImage bgImage = new GreenfootImage("world.png");
    //private static final int SCROLL_SPEED = 5;
    //private GreenfootImage scrollingImage;
    // int scrollPosition = 0;
        
    public MyWorld()
    {   
        super(500, 330, 1, false); 
        int dash = 0;
        addObject(new Player(), 50, 80);
        
        timeDisplay = new Score();
        setTimeText();
        addObject(timeDisplay, 330, 15);
        
        hati = new Amir();
        Amir.updateScore();
        addObject(hati, 400, 15);
        GreenfootSound music = new GreenfootSound("bgMusic.mp3");
        //if (music.isPlaying())
         //   music.stop();
        
       music.playLoop();
        
        //bgMusic(music);
        
        
            
        
    }
    public void act()
    {    
            int virusLocation = 500;
            int AmirCount = 3;
            
            if(Greenfoot.getRandomNumber(60)<1)
            virusLocation = 80;
            else if(Greenfoot.getRandomNumber(65)<1)
            virusLocation = 180;
            else if (Greenfoot.getRandomNumber(60)<1)
            virusLocation = 280;
            
            if(Greenfoot.getRandomNumber(10)==1)
            addVaccine(virusLocation);

            addEnemy(virusLocation);
            
            if (!getObjects(Player.class).isEmpty()) // only run timer if player in world
            {
                    actCount++;
                    if (actCount%2 == 0) setTimeText();
            }
            
        
    }
    public void addEnemy(int virusLocation)
    {
        int location = virusLocation;
        addObject(new Virus(), 500, location);
    }
    public void addVaccine(int virusLocation)
    {
        int location = virusLocation;
        addObject(new Vaccine(), 600, location);
    } 
     public void score()
    {
        Amir.minus(1);
        
        
    }
    private void setTimeText()
    {
    timeDisplay.setImage(new GreenfootImage("Score: "+(actCount/2), 30, null, null));
    }

    /**
     * Stop the game and show the GameOver Screen
     */
    public void lost()
    {
        removeObjects(getObjects(null));
        isLost = true;
        addObject(new GameOver(actCount), 250, 115);
    }
   
    public void bgMusic(GreenfootSound music)
    {
        /*int counter;
        music.playLoop();
        if (counter.getValue() >=300 ) 
        {
            music.pause();
        }
        Actor bee = getOneIntersectingObject(.class);
        if (bee != null)
        {
            music.pause();
        }
        */
        //hannan hensem
    
    }

}

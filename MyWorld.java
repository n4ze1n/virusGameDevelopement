import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    public MyWorld()
    {   
        super(500, 300, 1, false); 
        int dash = 0;
        addObject(new Player(), 50, 50);
        
        GreenfootSound music = new GreenfootSound("bgMusic.mp3");
        if (music.isPlaying())
            music.stop();
        
        music.playLoop();
        
        //bgMusic(music);
        
        int randNum;
        randNum = (int) (30 + Math.random() * (50-30+1));
        
        for(int i=0; i <= 6; i++){
            dash = dash + 50;
            addObject(new Virus(), 480, randNum);
        }
    }
    public void act()
    {    
            int virusLocation = 500;
            
            if(Greenfoot.getRandomNumber(60)<1)
            virusLocation = 50;
            else if(Greenfoot.getRandomNumber(65)<1)
            virusLocation = 150;
            else if (Greenfoot.getRandomNumber(60)<1)
            virusLocation = 250;
            
            if(Greenfoot.getRandomNumber(10)==1)
            addVaccine(virusLocation);

            addEnemy(virusLocation);
        
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

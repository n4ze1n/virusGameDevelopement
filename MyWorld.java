import greenfoot.*;  // (World, Actor, GreenfootImage, Adam Haikal, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    private int actCount; // the counter field
    private Actor timeDisplay; // the time display actor

    Heart heart = new Heart();  

    public MyWorld()
    {   
        super(500, 330, 1, false); 
        int dash = 0;
        prepare();
    }
    public void prepare()
    {
        addObject(new Player(), 50, 80);
        
        timeDisplay = new Score();
        setTimeText();
        addObject(timeDisplay, 80, 15);

        
        addObject(heart, 430, 15);
        
    
    }
    public void act()
    {    
            int virusLocation = 500;
            
            if(Greenfoot.getRandomNumber(60)<1)
            virusLocation = 80;
            else if(Greenfoot.getRandomNumber(65)<1)
            virusLocation = 180;
            else if (Greenfoot.getRandomNumber(60)<1)
            virusLocation = 280;
            
            if(Greenfoot.getRandomNumber(10)==1)
            addVaccine(virusLocation);

            addEnemy(virusLocation);
            
            if (!getObjects(Player.class).isEmpty()) 
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
    private void setTimeText()
    {
    timeDisplay.setImage(new GreenfootImage("Score: "+(actCount/2), 30, null, null));
    }
    public Heart getHealth()
    {
        return heart;
    }
}

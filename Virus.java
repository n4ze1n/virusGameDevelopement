import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Virus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Virus extends AllActors
{
    boolean stumble = false;
    
    public Virus(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/7;
        int myNewWidth = (int)myImage.getWidth()/7;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Virus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-10);
        hitPlayer();
    }
    
    public void hitPlayer()
    {
        Actor Player = getOneIntersectingObject(Player.class);
        if(Player != null)
        {
            World myWorld = getWorld();
            MyWorld lanes = (MyWorld)myWorld;
            Heart heart = lanes.getHealth();
            if(stumble == false)
            {
                myWorld.removeObject(this);
                heart.loseHealth();
                stumble = true;
                if(heart.health == 0)
                {
                    GameOver gameover = new GameOver();
                    myWorld.addObject(gameover, 250, 165);
                    myWorld.removeObject(this);
                }
        } 
        else {
            stumble = true;
        }
        }
    }
}

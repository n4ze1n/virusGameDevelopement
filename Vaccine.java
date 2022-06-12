import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vaccine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vaccine extends AllActors
{
    boolean vaxxed = false;
    
    public Vaccine(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/7;
        int myNewWidth = (int)myImage.getWidth()/7;
        myImage.scale(myNewWidth, myNewHeight);
    }
    /**
     * Act - do whatever the Vaccine wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    { 
        move(-10);
        hitPlayer();
    }
    
    public void hitPlayer(){  
        Actor Player = getOneIntersectingObject(Player.class);
        if(Player != null){
            World myWorld = getWorld();
            MyWorld lanes = (MyWorld)myWorld;
            Heart heart = lanes.getHealth();
            if(vaxxed == false)
            {
                if(heart.health < 3)
                {
                myWorld.removeObject(this);
                heart.addHealth();
                vaxxed = true;
                }
        } else {
            vaxxed = false;
        }
    }
    }
}

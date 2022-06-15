import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Heart here.
 * 
 * @_holyship  
 * @2.6.11
 */
public class Heart extends AllActors
{
    int health = 3;
    
    public Heart()
    {
        update();
    }
    public void act()
    {
        update();
    }
    public void update()
    {
        setImage(new GreenfootImage("Health : " + health, 30, Color.RED, null));
    }
    
    public void loseHealth()
    {
        health--;
    }
    
    public void addHealth()
    {
        health++;
    }
}

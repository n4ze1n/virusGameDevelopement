/**
 * This is the Game Over screen displayed when the uses loses the game. 
 * 
 * @
 * @
 */
public class GameOver extends Actor
{   
    public GameOver()
    {
        
        setImage(new GreenfootImage("Game Over", 48, Color.WHITE, Color.BLACK));
        Greenfoot.stop();        

    }

    /**
     * Resets the world upon pressing Enter to start a new game.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            Greenfoot.setWorld(new MyWorld());
        }
    }    
}

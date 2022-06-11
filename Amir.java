import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Amir extends Actor
{
    private MyWorld w;
    public int integerScore; 
    public int heart;
    
   
    public void heartDisplay()
    {
        setToValue(3);
        updateScore();
    }

    /**
     * Sets the score to be displayed on the screen to eaqual ine integer passed.
     */
    private void setToValue(int num)
    {
        integerScore = num;
        updateScore();
    }

    /**
     * Add the integer parameter to the score display.
     */
    public void minus(int num)
    {
        integerScore -= num;
        //if (num == 0){
          //  w.lost();
        //}
        //else
        updateScore();
    }

    /**
     * Update the screen to display the score.
     */
    public void updateScore()
    {
        //Create an image with the current score
        //GreenfootImage text = new GreenfootImage("Heart: "+integerScore, 30, null, null);
        //setImage(text);
        setImage(new GreenfootImage("Nyawa: "+ integerScore, 30, null, null));
    }
    
    
}



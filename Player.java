import greenfoot.*;

public class Player extends Actor
{
    public Player(){
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/7;
        int myNewWidth = (int)myImage.getWidth()/7;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        
        if(getY() == 80 || getY() == 180){ 
            if(Greenfoot.isKeyDown("s")){
                setRotation(90);
                move(100);
                setRotation(0);
            }
        }
        if(getY() == 180 || getY() == 280){
            if (Greenfoot.isKeyDown("w")){
            setRotation(-90);
            move(100);
            setRotation(0);
            }
        }
    }
}

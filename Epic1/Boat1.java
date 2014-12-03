import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boat1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boat1 extends Actor
{
    /**
     * Act - do whatever the Boat1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+ boatSpeed);
        
        touching();
    }    
    
    private int boatSpeed = -1;
    
    public void touching()
    {
        if(isTouching(Map.class) && checkTransparancy() == true ){
            turn(3);
            
        }
        
    }
    
    public boolean checkTransparancy()
    {
        
        
    }
    
}



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
        
       checkKeys();
       movement();
      
       //touching();
    }    
    
    // values
    private int boatSpeed = 2;
    private int turnSpeedLeft = -5;
    private int turnSpeedRight = 5;
    private int breakPower = 1;
    
    
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("left")){
            turnLeft();
        }
        
        else if (Greenfoot.isKeyDown("right")){
            turnRight();
        }
        
        if(Greenfoot.isKeyDown("down")){
            slowDown();
        }
        
        else {
            boatSpeed = 2;
        }
    }
    
    
    public void slowDown()
    {
        boatSpeed = boatSpeed - breakPower;
        if (boatSpeed <= 0){
            boatSpeed = 1;
        }
    }
    
    public void turnLeft()
    {
        turn(turnSpeedLeft);
    }
    
    public void turnRight()
    {
        turn(turnSpeedRight);
    }
   
    public void movement()
    {
        move(boatSpeed);
    }
   /* public void touching()
    {
        if(isTouching(Map.class) && checkTransparancy() == true ){
            turn(3);
            
        }
        
    }
    
    public boolean checkTransparancy()
    {
        
        
    } */
    
}



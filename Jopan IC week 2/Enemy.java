import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy(){
        speed = 2;
        speed += Greenfoot.getRandomNumber(8);
        setRotation(180);
    }

    public int speed;
    public void act()
    {
        
        move(speed);
    }
    
    
}

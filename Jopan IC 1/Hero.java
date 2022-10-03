import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
       if (isAtEdge())
        {
        
            setLocation(0, getY());
        }
       if (isAtEdge())
        {
            setLocation(0, getY());
        }        
       if (Greenfoot.isKeyDown("Right"))
        {
            setRotation(0);
            move(2);
        }
       if (Greenfoot.isKeyDown("Down"))
        {
            setRotation(90);
            move(2);
        }
       if (Greenfoot.isKeyDown("Left"))
        {
            setRotation(180);
            move(2);
        }
       if (Greenfoot.isKeyDown("Up"))
        {
            setRotation(270);
            move(2);
        }
       
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deadbody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deadbody extends Actor
{
    /**
     * Act - do whatever the Deadbody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int timerbody=60;
    public void act()
    {
        timerbody--;
        
        setLocation(getX()-2,getY());
        turn(1);
        if(timerbody==0){
            getWorld().removeObject(this);
        }
    }
}

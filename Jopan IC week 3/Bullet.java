import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet()
    {
        setRotation(297);
    }
    public void Collisions()
    {
        if(this.isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }


    public void act()
    {
        setLocation(getX()+6,getY());
        Collisions();
    }
}

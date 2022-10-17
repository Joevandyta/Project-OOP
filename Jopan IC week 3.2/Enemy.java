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
    int speed;
    
    
    public Enemy()
    {
        speed = 2;
        speed += Greenfoot.getRandomNumber(8);
        GreenfootImage image = getImage();
        image.scale(85,85);
    }

    public int not;
    public void act()
    {   
        setLocation(getX()-speed,getY());
        Collisions();
    }
    public void Collisions()
    {
        if (this.isTouching(Bullet.class))
        {
            //remove enemy
            getWorld().addObject(new Deadbody(),getX(),getY()); 
            removeTouching(Bullet.class);
            Greenfoot.playSound("mongus dead.mp3");
            MyWorld m = (MyWorld)getWorld();
            m.addscore(10);
            getWorld().removeObject(this);    
   
        }
        else if(this.isAtEdge( ))
        {
            getWorld().removeObject(this);
     
        }
    }


}

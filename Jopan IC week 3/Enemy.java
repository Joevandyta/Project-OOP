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
    int sY = 10+Greenfoot.getRandomNumber(580);
    
    public Enemy()
    {
        speed = 2;
        speed += Greenfoot.getRandomNumber(8);
        GreenfootImage image = getImage();
        image.scale(85,85);
    }
     public int spawntime =0;
    public void enemyspawn()
    {
        spawntime+=1;
        if (getWorld().getObjects(Enemy.class).size() < 10 && spawntime == 60){
            spawntime= 0;    
            getWorld().addObject(new Enemy(),1080,sY);    
                
        }
            
        }
  
    public void act()
    {   
        setLocation(getX()-speed,getY());
        enemyspawn();
        Collisions();
    }
    
    public void Collisions()
    {
        if (this.isTouching(Bullet.class))
        {
            //remove enemy
            getWorld().addObject(new Deadbody(),getX(),getY()); 
            removeTouching(Bullet.class);
            getWorld().removeObject(this);    
               
        }
        else if(this.isAtEdge( ))
        {
            getWorld().removeObject(this);             
        }
    }
    
}

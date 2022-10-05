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
    public void wallv(){
        
            if(getX()==1079){
                setLocation(1, getY());
            }
            if(getX()==0){
                setLocation(1080, getY());
            }
            if(getY()==599){
                setLocation(getX(),1);
            }
            if(getY()==0){
                setLocation(getX(),600);
            }

    }
    
    public void act()
    {
       
        wallv();
       if (Greenfoot.isKeyDown("d"))
        {       
            move(4);
        } 
       if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+4);
        }
       if (Greenfoot.isKeyDown("a"))
        {
            move(-4);
        }
       if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-4);
        }
       
    }
}

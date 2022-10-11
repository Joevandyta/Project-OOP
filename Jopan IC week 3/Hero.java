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
    
    public Hero() {
        GreenfootImage image = getImage();
        image.scale(85,61);
        setImage(image);
        
    }
    int atime;
    public int time=15;
    public void animation()
    {    
        atime+=1;
        if (atime==60)atime=0;
        if (atime==0){
            setImage("ufoset2.png"); 
            GreenfootImage image = getImage();
            image.scale(85,61);
            setRotation(350);
        }
        if (atime==30){ 
            setImage("ufoset1.png");
            GreenfootImage image = getImage();
            image.scale(85,61);
            setRotation(10);
        }

    }
    public void turna(){
        for(int i=0; i<=5; i++){
            
        }
    }
    public void wallv()
    {    
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
    public void heromove(){
       if (Greenfoot.isKeyDown("d"))
        {       
            setLocation(getX()+4,getY());
        } 
       if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(),getY()+4);

        }
       if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-4,getY());
        }
       if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(),getY()-4);

        }
       if (Greenfoot.isKeyDown("space"))
       {
           time--;
           if (time==0){
               getWorld().addObject(new Bullet(),getX()+1,getY());   
               
               time=15;
               }
       }
    }
    public void act()
    {
       
       wallv();
       heromove();  
       animation();
    }
}

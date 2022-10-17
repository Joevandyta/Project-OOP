import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int pause=0;
    private int score;
    private int life = 3;
    private int clockt;
    private int second;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 600, 1); 
        setPaintOrder(Loseoverlay.class);
        herolife();
        showscore();
        timesec();
        clockt = 0;
        prepare(); 
        
    }
    public void updatelife(int point){
        life += point;
        herolife();
        if(life==0){
            Greenfoot.stop();
            addObject(new Loseoverlay(),540,300); 
        }
    }
    public void act(){
        enemyspawn();
        timesec();
    }
    
    public void herolife(){
        showText("Life : "+life, 70 ,30);

    }
    public void addscore(int point){
        score += point;
        showscore();
    }
    private void showscore(){
        showText("Score : "+score, 990 ,30);
    }
    private void timesec(){
        clockt++;
        if(clockt % 60 == 0){
            second = clockt / 60;
        }
        showText("Time : "+second ,540 ,30);
    }   
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,50,300);

    }
    public int spawntime =0;

    public void enemyspawn()
    {
        //getObjects(Enemy.class).size() < 5 
        spawntime++;
        if (spawntime == 60){
            int sY = 10+Greenfoot.getRandomNumber(580);
            addObject(new Enemy(),1080,sY);    
            spawntime=0;
        }
    }
}

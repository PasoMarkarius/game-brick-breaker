import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paddle extends Actor
{
    private ball ball;
    
    /**
     * Act - do whatever the paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World world)
    {
        ball();
    }
    
    public void act() 
    {
        if ( Greenfoot.isKeyDown("left"))
        {
            move(-9);
        }
        if( Greenfoot.isKeyDown("right"))
        {
            move(+9);
        }
        
        if (haveball()  && Greenfoot.isKeyDown("space"))
        {
            releaseball();
        }
    }
    
    public void move(int dist)
    {
        setLocation (getX() + dist, getY());
        if (ball !=null){
            ball.move (dist);
        }
    }
    
    public void ball()
    {
        ball = new ball();
        getWorld().addObject (ball,getX(), getY()-20);
    }
    
    public boolean haveball()
    {
       return ball != null;
    }
    
    public void releaseball()
    {
        ball.release();
        ball = null;
    }

}

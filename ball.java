import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int deltaX;
    private int deltaY;
    private boolean NeedToInit = true;
    private GreenfootSound backgroundSound;
    private int mute = 0;
    private int play = 0;
    static int skor = 0;
    static int nyawa = 3;
    
    
    private boolean stuck = true;
    public void act() 
    {

        
        getWorld().showText("Nyawa : " + nyawa, 750, 550);
        
        if(!stuck)
        {
            move();
            World world;  
            world = getWorld();
            background bg1 = (background)world;
            Counter counter = bg1.getCounter();
            ballOut();
            
        }
        
       if(nyawa == 0)
       {
           Greenfoot.setWorld(new over());
       }
       if(Counter.Score==21)
       {
           Greenfoot.setWorld(new win());
        }
    }
      
 
    private void ballOut()
    {
        if (getY () == getWorld().getHeight()-1){
            nyawa--;
            ((background) getWorld ()).ball();
            getWorld().removeObject(this);
        }
        
    }
    
    public void move()
    {
        setLocation (getX() + deltaX, getY() + deltaY);
        checkpaddle();
        checkWalls();
        checkbalok();
    }
    
    private void checkWalls()
    {
        if (getX() == 0 || getX() == getWorld().getWidth()-1){
            deltaX = -deltaX;
        }
        if (getY() == 0){
            deltaY = -deltaY;
        }
    
    }
    private void checkpaddle()
    {
        Actor paddle = getOneIntersectingObject(paddle.class);
        if(paddle !=null) {
            deltaY = -deltaY;
            int offset = getX() - paddle.getX();
            deltaX = deltaX + (offset/10);
            if (deltaX >7){
                deltaX=7;
            }
            if (deltaX<-7){
                deltaX=-7;
            }
        }
    }
    private void checkbalok()
    {
      
      if (isTouching(balok.class)){
                Counter.Score = Counter.Score + 1;
        }  
      Actor balok = getOneIntersectingObject(balok.class);
       
        if (balok !=null){
        
        deltaY = - deltaY;
        int offset = getX() - balok.getX();
        deltaX = deltaX + (offset/10); 
         World world;
         world = getWorld();
         world.removeObject(balok);

      }
      
         if(deltaX > 7) {
                deltaX = 7;
        }
        if (deltaX < -7) {
                deltaX = -7;
        }
      }
      
    public void skor()
    {
        if(isTouching(balok.class)){
            skor++;
            getWorld().showText("skor="+skor, 400, 300);
        }
    }
    
    public void release()
      {
        deltaX = 0;
        deltaY = -5;
        stuck = false;
    }
    
    

}


  



       







    

/**
 * Write a description of class mulai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mulai extends Actor
{
    /**
     * Act - do whatever the mulai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)){
        Greenfoot.delay(8);
        Greenfoot.setWorld(new background());
    }
    }    
}

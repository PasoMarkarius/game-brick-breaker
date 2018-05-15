import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class back_awal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class back_awal extends Actor
{
    /**
     * Act - do whatever the back_awal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if (Greenfoot.mouseClicked(this)){
        Greenfoot.delay(8);
        Greenfoot.setWorld(new awal());
    }
    }    
}

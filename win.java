import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class win extends World
{

    /**
     * Constructor for objects of class win.
     * 
     */
    public win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(760, 500, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        restart restart = new restart();
        addObject(restart,73,449);
        restart.setLocation(68,441);
        restart.setLocation(67,443);
        home home = new home();
        addObject(home,704,448);
        home.setLocation(701,443);
        home.setLocation(697,440);
        home.setLocation(697,441);
    }
}

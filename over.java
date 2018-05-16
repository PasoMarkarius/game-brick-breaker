import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class over extends World
{

    /**
     * Constructor for objects of class over.
     * 
     */
    public over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 515, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        home home = new home();
        addObject(home,740,468);
        home.setLocation(732,462);
        restart restart = new restart();
        addObject(restart,76,471);
        restart.setLocation(69,462);
    }
}

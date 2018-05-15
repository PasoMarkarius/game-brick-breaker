import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class aturan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class aturan extends World
{

    /**
     * Constructor for objects of class aturan.
     * 
     */
    public aturan()
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
        back back = new back();
        addObject(back,747,461);
        back.setLocation(733,458);
    }
}

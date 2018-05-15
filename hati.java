import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hati here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hati extends World
{

    /**
     * Constructor for objects of class hati.
     * 
     */
    static int nyawa = 3;
    public hati()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    
    public static void nyawa_berkurang()
    {
        nyawa --;
        if(nyawa <=0){
            Greenfoot.setWorld(new over());
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menang extends World
{

    /**
     * Constructor for objects of class Menang.
     * 
     */
    public Menang()
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
        ulang ulang = new ulang();
        addObject(ulang,399,460);
        back_awal back_awal = new back_awal();
        addObject(back_awal,770,27);
        back_awal.setLocation(759,27);
    }
}

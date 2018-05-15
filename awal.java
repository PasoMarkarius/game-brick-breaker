import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class awal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class awal extends World
{

    /**
     * Constructor for objects of class awal.
     * 
     */
    public GreenfootSound music = new GreenfootSound ("backgroundMusic.mp3");
    public void started()
    {
        music.setVolume(60);
        music.play();
    }
    
    public void stopped()
    {
        music.setVolume(60);
        music.play();
    }
    
    public awal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        about about = new about();
        addObject(about,122,452);
        about.setLocation(125,441);
        about.setLocation(110,455);
        about.setLocation(107,461);
        mulai mulai = new mulai();
        addObject(mulai,710,380);
        keluar keluar = new keluar();
        addObject(keluar,722,500);
        keluar.setLocation(715,500);
        about.setLocation(68,292);
        about.setLocation(63,461);
        about.setLocation(42,564);
        about.setLocation(696,563);
        mulai.setLocation(715,357);
        keluar.setLocation(718,471);
        about.setLocation(729,566);
        about.setLocation(301,550);
        about.setLocation(100,498);
        about.setLocation(93,497);
    }
}

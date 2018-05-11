import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Smoke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class smoke extends Actor
{
    private GreenfootImage mOriginalImage;
    private int mFade;
    
    public smoke(){
        mOriginalImage = new GreenfootImage(getImage());
        mOriginalImage.setTransparency(100);
        
        mFade = Greenfoot.getRandomNumber(4) + 1;
        if (mFade > 3){
            mFade = mFade - 2;
        }
    }
    
    /**
     * Act - do whatever the Smoke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        shrink();
    }  
    
    public void shrink(){
        if (getImage().getWidth() < 10){
            getWorld().removeObject(this);
        }
        else{
            GreenfootImage img = new GreenfootImage(mOriginalImage);
        
            img.scale( getImage().getWidth() - mFade, getImage().getHeight() - mFade);
            setImage(img);
        }
    }
}

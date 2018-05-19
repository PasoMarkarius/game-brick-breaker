import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2 extends World
{
    private paddle paddle;
    /**
     * Constructor for objects of class lvl2.
     * 
     */
    public lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        paddle = new paddle();
    }
    
    private void paddle()
    {
        balok balok = new balok();
        addObject(balok, 326, 199);
        balok balok2 = new balok();
        addObject(balok2, 534, 248);
        balok balok3 = new balok();
        addObject(balok3, 531, 135);
        balok balok4 = new balok();
        addObject(balok4, 262, 392);
        balok balok5 = new balok();
        addObject(balok5, 458, 253);
        balok balok6 = new balok();
        addObject(balok6, 476, 248);
        balok6.setLocation(485, 319);
        balok.setLocation(398, 83);
        balok.setLocation(399, 52);
        balok3.setLocation(447, 75);
        balok5.setLocation(343, 74);
        balok3.setLocation(451, 75);
        balok5.setLocation(352, 75);
        balok4.setLocation(302, 99);
        balok2.setLocation(403, 100);
        balok2.setLocation(399, 99);
        balok6.setLocation(499, 99);
        balok6.setLocation(498, 98);
        balok6.setLocation(498, 99);
        balok balok7 = new balok();
        addObject(balok7, 259, 123);
        balok balok8 = new balok();
        addObject(balok8, 361, 123);
        balok7.setLocation(258, 122);
        balok8.setLocation(356, 122);
        balok balok9 = new balok();
        addObject(balok9, 459, 123);
        balok9.setLocation(459, 123);
        balok9.setLocation(455, 122);
        balok balok10 = new balok();
        addObject(balok10, 557, 120);
        balok10.setLocation(554, 122);
        balok balok11 = new balok();
        addObject(balok11, 206, 147);
        balok balok12 = new balok();
        addObject(balok12, 319, 153);
        balok balok13 = new balok();
        addObject(balok13, 419, 153);
        balok12.setLocation(313, 149);
        balok11.setLocation(206, 146);
        balok12.setLocation(305, 146);
        balok13.setLocation(404, 146);
        balok balok14 = new balok();
        addObject(balok14, 506, 147);
        balok14.setLocation(501, 147);
        balok14.setLocation(504, 145);
        balok14.setLocation(503, 146);
        balok block15 = new balok();
        addObject(block15, 604, 148);
        block15.setLocation(602, 146);
        balok balok16 = new balok();
        addObject(balok16, 168, 177);
        balok16.setLocation(161, 169);
        balok balok17 = new balok();
        addObject(balok17, 265, 169);
        balok17.setLocation(260, 169);
        balok balok18 = new balok();
        addObject(balok18, 363, 169);
        balok18.setLocation(359, 169);
        balok balok19 = new balok();
        addObject(balok19, 462, 168);
        balok19.setLocation(457, 169);
        balok balok20 = new balok();
        addObject(balok20, 558, 168);
        balok20.setLocation(557, 169);
        balok balok21 = new balok();
        addObject(balok21, 600, 170);
        balok21.setLocation(655, 169);
        nyawa hati = new nyawa();
        addObject(hati,710,580);
        nyawa hati2 = new nyawa();
        addObject(hati2,730,580);
        nyawa hati3 = new nyawa();
        addObject(hati3,750,580);
        Counter counter = new Counter();
        addObject(counter,55,25);
        counter.setLocation(52,18);
        back_awal back_awal = new back_awal();
        addObject(back_awal,765,29);
        back_awal.setLocation(760,25);
    }
}

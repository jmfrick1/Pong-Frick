import greenfoot.*;

// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clicks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clicks extends Actor
{
    private GreenfootImage background;
    private Color color;
    private Color transparent;

    private int count;
    /**
     * constructor 
     */
    public Clicks()
    {

        count=9;
        background=getImage();
        color = new Color(0,0,0,255);
        transparent = new Color(0,0,0,0);
        subPoint();

    }

    /**
     * Act - do whatever the Clicks wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(count>0)
            subPoint();

    }  

    /**
     * adds one point to counter
     */
    public void subPoint()
    {
        if(Greenfoot.mouseClicked(null))
            count = count-1;
        GreenfootImage image= new GreenfootImage(background);
        GreenfootImage textTime = new GreenfootImage("Balls Left "+count,16,color,transparent);
        image.drawImage(textTime,10,5);
        setImage(image);

    }

}

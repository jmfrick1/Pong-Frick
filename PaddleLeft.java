import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PaddleLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaddleLeft extends Paddle
{
    /**
     * Act - do whatever the PaddleLeft wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int yPos ;
    
    
    public PaddleLeft()
    {
        
        yPos = 176 ;
    }
    public void act() 
    {
        setLocation(40, yPos) ;
        checkKeys() ;
        
    }    
    
    
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("W"))
        yPos-=7;
        
        if(Greenfoot.isKeyDown("S"))
        yPos+=7;
        
    }
     
    
}

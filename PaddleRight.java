import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PaddleRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaddleRight extends Paddle
{
    private int yPos ;

    
    /**
     * Act - do whatever the PaddleRight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public PaddleRight()
    {
     
     yPos = 176 ;
    }
    public void act() 
    {
        setLocation(559, yPos) ;
        checkKeys() ;
    } 
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("up"))
        yPos-=7;
        
        if(Greenfoot.isKeyDown("down"))
        yPos+=7;
        
        
    }
}

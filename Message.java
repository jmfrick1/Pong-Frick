import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class displays messages. 
 * 
 * Jordan Frick
 * @version 1.2
 */
public class Message extends Actor
{
    private String message;
    private int fontSize;
    private Color textColor;
    private Color backgroundColor;
    private Color transparent = new Color(0, 0, 0, 0); // Fully transparent color
    
    public Message(String myMessage)
    {
        message = myMessage;
        fontSize = 28;
        textColor = Color.BLUE; // Use Color.BLUE instead of Color.blue
        backgroundColor = transparent;
        setImage(new GreenfootImage(" "+message+" ", fontSize, textColor, backgroundColor));
    }

    public Message(String myMessage, int size, Color wordColor, Color backColor)
    {
        message = myMessage;
        fontSize = size;
        textColor = wordColor;
        backgroundColor = backColor;
        setImage(new GreenfootImage(" "+message+" ", fontSize, textColor, backgroundColor));
    }

    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

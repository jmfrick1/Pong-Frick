import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Counts scroe and time
 * 
 * Jordan Frick
 * @version 1.2
 */
public class Timer extends Actor
{
    private GreenfootImage background;
    private Color color;
    private Color transparent;
    private int score;
    private int time; 
    private int count;
    private int stop;
    /**
     * the constructor
     */
    public Timer()
    {
        stop=200;
        score = 0;
        time=0;
        count=0;
        background=getImage();
        color = new Color(0,0,0,255);
        transparent = new Color(0,0,0,0);

        countTime();
    }

    public Timer(int startValue)
    {
        score = startValue;
        time=0;
        count=0;
        background=getImage();
        color = new Color(0,0,0,255);
        transparent = new Color(0,0,0,0);

        countTime();
    }

    /**
     * Does everything a counter can do
     */
    public void act() 
    {

        countTime();

    }    

    /**
     * adds one point to counter
     */
    public void addPoint()
    {
        score++;

    }

    /**
     * adds five points to counter
     */
    public void add5()
    {
        score = score+5;  
    }

    /**
     * counts time 
     */
    public void countTime()
    {
        time++;
        if(time%100==0)
        {
            count++;
        }

        if(count==stop)
            Greenfoot.stop();

        GreenfootImage image= new GreenfootImage(background);
        GreenfootImage textTime = new GreenfootImage("Time "+count,18,color,transparent);
        image.drawImage(textTime,10,5);
        setImage(image);

        

    }
    
}


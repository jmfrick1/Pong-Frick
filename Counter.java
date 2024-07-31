import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Counts scroe and time
 * 
 * Jordan Frick
 * @version 1.2
 */
public class Counter extends Actor
{
    private GreenfootImage background;
    private Color color;
    private Color transparent;
    public int score;
    private int time; 
    private int count;
    private int stop;
    private String title;

   
    /**
     * the constructor
     */
    public Counter(String name,int startValue)
    {
        title = name;
        stop=5;
        score = 0;
        time=0;
        count=0;
        background=getImage();
        color = new Color(255,255,255,255);
        transparent = new Color(0,0,0,0);

        countScore();
    }

    public Counter(int startValue)
    {
        score = startValue;
        time=0;
        count=0;
        background=getImage();
        color = new Color(255,255,255,255);
        transparent = new Color(0,0,0,0);

        countScore();
    }

    /**
     * Does everything a counter can do
     */
    public void act() 
    {
        if(score ==stop)
        {
         
        
            Greenfoot.stop();
            
            Greenfoot.playSound("pacman_intro1.wav");
        }
        

        countScore();
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
     * counts score
     */
    public void countScore()
    {

        GreenfootImage image= new GreenfootImage(background);
        GreenfootImage textScore = new GreenfootImage(title+score,18,color,transparent);
        image.drawImage(textScore,10,5);
        setImage(image);


    }
}

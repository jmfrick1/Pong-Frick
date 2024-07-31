import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int click;
    private GreenfootImage background;
    private Color backgroundColor;
    private MouseInfo mouse;
    private int count=0;
    private Clicks countclicks;
    private Counter leftCounter;
    private Counter rightCounter;
    Message xmessage = new Message("HelloPlayers");
    Message zmessage = new Message("welcome to the Game!" );
    Message wmessage = new Message("You have 9 balls" );
    Message ymessage = new Message("to get to 5");
    Timer timer= new Timer();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        click=10;
        addObject(xmessage,316,63);

        addObject(zmessage,316,86);

        addObject(wmessage,319,116);
        
        addObject(ymessage,307,141);


        setUpBackground();
        Populate() ;
        Credits() ;
        addCounter();
    
    
        prepare();
    }

    /**
     * Check for mouse clicks.
     */

    public void act()
    {
        if(Greenfoot.mouseClicked(null))

            click = click-1;

        if(click>0)
        {
            if (Greenfoot.mouseClicked(null)) {
                MouseInfo mouse = Greenfoot.getMouseInfo();

                addObject (new Ball(leftCounter,rightCounter), getWidth()/2, getHeight()/2 );
            }
        }
        removeMessage();
        winner();
    }

    /**
     * Add objects to the World
     */
    public void Populate() 
    {
        addObject(new PaddleLeft(), 40, 176) ;
        addObject(new PaddleRight(), 559, 176) ;
    }

    /**
     * Display Title, Author, and Date
     */
    public void Credits()
    {
    }

    public void setUpBackground()
    {
        getBackground().setColor(Color.RED);
        getBackground().fill();
        getBackground().setColor(Color.BLUE);
        getBackground().drawLine(1,20,1,380 );
        getBackground().drawLine(0,20, 600, 20);
        getBackground().drawLine(0,380, 600, 380);
        getBackground().drawLine(40,20,40 ,380 );
        getBackground().drawLine(80,20,80 ,380 );
        getBackground().drawLine(120,20,120 ,380 );
        getBackground().drawLine(160,20,160 ,380 );
        getBackground().drawLine(200,20,200 ,380 );
        getBackground().drawLine(240,20,240 ,380 );
        getBackground().drawLine(280,20,280 ,380 );
        getBackground().drawLine(320,20,320 ,380 );
        getBackground().drawLine(380,20,380 ,380 );

        getBackground().drawLine(440,20,440 ,380 );
        getBackground().drawLine(480,20,480 ,380 );
        getBackground().drawLine(520,20,520 ,380 );
        getBackground().drawLine(560,20,560 ,380 );
        getBackground().drawLine(599,20,599 ,380 );
        getBackground().drawString("w = up, d = down",10,395);
        
        getBackground().drawString("up key = up, down key = down",400,395);
        getBackground().drawString("by Jordan Frick 3/2014",200,395);


    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        
        Timer timer = new Timer();
        addObject(timer, 233, 19);
        timer.setLocation(382, 13);
        Timer timer2 = new Timer();
        addObject(timer2, 513, 19);
        removeObject(timer2);
        Clicks clicks = new Clicks();
        addObject(clicks, 442, 57);
        timer.setLocation(245, 12);
        clicks.setLocation(386, 13);
    }
    public void addCounter()
    {
        leftCounter= new Counter("Blue  ",0);
        addObject(leftCounter,559,13);
        
        rightCounter= new Counter("Red ",0);
        addObject(rightCounter,43,13);
        
        
    }
    public void removeMessage()

    {
        count++; 
        if (count>=50)
        {
            removeObject(xmessage);
            removeObject(zmessage);
            removeObject(wmessage);
            removeObject(ymessage);
            

        }
    }
    public void winner()
    {
        
       if(leftCounter.score > 4)
       {
           
           addObject(new Message("Blue Player Wins!"),200,200); 
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
       
           
       }
        if(rightCounter.score > 4)
        {
            addObject(new Message("Red Player Wins!"),310,160); 
            
            
        }
    }
}


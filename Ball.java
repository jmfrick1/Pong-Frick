import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private double deltaX  ; // change in x direction
    private int deltaY ;
    Counter pointsInHole;
    private Counter leftCounter, rightCounter;// change in y direction

    /**
     * Create a ball.
     */
    public Ball(Counter counter1,Counter counter2)
    {
        pointsInHole= new Counter("left",0);
        deltaX = Greenfoot.getRandomNumber(3)+1 ;
        deltaY = Greenfoot.getRandomNumber(3)+1;
        leftCounter = counter1;
        rightCounter = counter2;

    }

   
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        ballMove();
        
        

        if (missedPaddle())
        {
            getWorld().removeObject(this) ;
            
        }
        

    }  
    
    public void counterAddPoints()
    {
        
        { 
            setLocation(getX()+(int)deltaX, getY());
            if (getX()<10)
            {
                
                leftCounter.addPoint();
            }
            if (getX() >590)
            {
               
                rightCounter.addPoint();
            }
        }    

    }

    /**
     * this method moves the ball around the screen.
     */
    public void ballMove()
    {

        int xCoordinate = getX() +(int)deltaX ;
        int yCoordinate = getY() + deltaY ;

        setLocation(xCoordinate, yCoordinate);

        if (bouncedOffWall())
        {
            deltaY=-deltaY ;
            Greenfoot.playSound("gulp.wav");

        }
        if (bouncedOffPaddle())

        {
            deltaX=-deltaX*1.3;
            Greenfoot.playSound("pluck1.wav");
            
            

        }
    }

    /**
     * Test if we are close to one of the edges of the world. Return true is we are.
     */
    public boolean bouncedOffWall()
    {
        if(getY()<20 || getY()>380)
            return true;
        else
            return false;

    }

    public boolean bouncedOffPaddle()

    {
        Actor rightPaddle=getOneObjectAtOffset(getImage().getWidth()/2,0,Paddle.class);
        Actor leftPaddle=getOneObjectAtOffset(-getImage().getWidth()/2,0,Paddle.class);
        if(rightPaddle!=null || leftPaddle!=null)
            return true;
        else 
            return false;
    }

    /**
     * Test to see if the ball missed the paddle.  Return true if it does.
     */
    public boolean missedPaddle() 
    {
        if(getX()>590 || getX()<10)
        {
            counterAddPoints();
            getWorld().removeObject(this);
            Greenfoot.playSound("pacman1.wav");
            
        }

        return false ;

    }

}

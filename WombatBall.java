import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WombatBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WombatBall extends Actor
{
    private boolean directionUP;
    /**
     * Act - do whatever the WombatBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WombatBall(){
    super();
    getImage().scale(40,40);
    directionUP=false;
    }
    int dx = 4;
    int dy = 4;
<<<<<<< HEAD
    public void act()
    //Movement of the Ball(Wombat)
    {
        this.setLocation(this.getX() + dx, this.getY() + dy);
        //Bouncing Wombat Logic
    if(this.getX() < 10 || this.getX()>940){
        dx = dx * -1;
    }
      if(this.getY() < 10 || this.getY() > 590){
        dy = dy * -1;
    }
        Paddle p = (Paddle) getOneIntersectingObject(Paddle.class);
        if(p != null){
           dy = dy * -1;
        }
     //Killing the wombat after cross the lava   
    if(this.getY() > 590)
    getWorld().removeObject(this);
=======
    public void act(){
         directionUPDOWN();   
         gameStop();
    }
    
    
    public void directionUPDOWN(){
        this.setLocation(this.getX() + dx, this.getY() + dy);
        if(this.getX() < 10 || this.getX()>940){
            dx = dx * -1;
        }   
        if(this.getY() < 10 || this.getY() > 590){
            if(directionUP){
                directionUP=!directionUP;
            }
            dy = dy * -1;
        }
        Paddle p = (Paddle) getOneIntersectingObject(Paddle.class);
        ComputerPaddle cp = (ComputerPaddle) getOneIntersectingObject(ComputerPaddle.class);
        if(p != null || cp!=null){
           dy = dy * -1;
           directionUP=!directionUP;
        }
    }
    
    public void gameStop(){
        if(this.getY() > 590){
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
>>>>>>> 0d8b648381ff234982ef4772afc368214e8db862
    }
}


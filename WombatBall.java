import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WombatBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WombatBall extends Actor
{
    /**
     * Act - do whatever the WombatBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WombatBall(){
    super();
    getImage().scale(40,40);
    
    }
    int dx = 4;
    int dy = 4;
    public void act()
    {
        this.setLocation(this.getX() + dx, this.getY() + dy);
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
    if(this.getY() > 590){
            getWorld().removeObject(this);
            Greenfoot.stop();
    }
    }
}


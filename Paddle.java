import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Paddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paddle extends Actor
{
    /**
     * Act - do whatever the Paddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Paddle () {
         super();
         getImage().scale(220,35);
    }
     public void act() 
    {
       /* if(Greenfoot.mouseMoved(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(getX(),mouse.getY());
        }*/

    }  
}

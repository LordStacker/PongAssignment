import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ComputerPaddle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComputerPaddle extends Actor
{
    /**
     * Act - do whatever the ComputerPaddle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ComputerPaddle () {
         super();
         getImage().scale(320,100);
    }
    public void act(){
        move(5);
    }
}

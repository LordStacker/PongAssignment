import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Board()
    {    
        super(950, 600, 1); 
         LavaFloor lf = new LavaFloor();
        addObject(lf, 455, 650);
    }
}

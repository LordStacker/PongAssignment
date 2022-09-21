import greenfoot.*;
public class GameOver extends World
{
    Fire fr = new Fire();
    public GameOver()
    {    
        super(950, 600, 1); 
        addObject(fr, 455, 580);
    }
}

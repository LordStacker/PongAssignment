import greenfoot.*;
public class GameOver extends World
{
    Fire fr = new Fire();
    WombatSpit ws = new WombatSpit();
    public GameOver()
    {    
        super(950, 600, 1); 
        addObject(fr, 455, 580);
        addObject(ws, 475, 430);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("enter")){
        Greenfoot.setWorld(new Intro());
        }
    }
}

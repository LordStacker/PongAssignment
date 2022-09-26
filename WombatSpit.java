import greenfoot.*;  
public class WombatSpit extends Actor
{
    GifImage wombatSpit = new GifImage("wombatSpit.gif");
    public void act()
    {
        setImage( wombatSpit.getCurrentImage());
        getImage().scale(getX()*3,getY()*3);
    }
}

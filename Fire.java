import greenfoot.*; 
public class Fire extends Actor
{
    GifImage myFire = new GifImage("fire.gif");
    public void act()
    {
        setImage(myFire.getCurrentImage());
        getImage().scale(1100,100);
    }
}

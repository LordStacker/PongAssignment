import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class BananaSlice2 extends Actor
{
    int speed = 0;
    public BananaSlice2(){
        speed = Greenfoot.getRandomNumber(100);
    }
    
    public void act()
    {
        speed();
        remove();
    }
    
    public void speed(){
        turn(Greenfoot.getRandomNumber(10));
         if (speed < 25) {
        setLocation(getX(),getY()+6); 
        getImage().scale(130,130);
        } 
        else if (speed < 50) { 
        setLocation(getX(),getY()+7); 
        getImage().scale(110,110);
        } 
        else if (speed < 75) { 
        setLocation(getX(),getY()+9); 
        getImage().scale(90,90);
        } 
        else {
        setLocation(getX(),getY()+10); 
        getImage().scale(70,70);
        } 
    }
    
    public void remove(){
        if(getY()>590){
            getWorld().removeObject(this);
        }
    }
}

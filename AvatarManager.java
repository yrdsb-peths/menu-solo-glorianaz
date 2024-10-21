import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvatarManager here.
 * 
 * @author Gloriana Zheng
 * @version October 2024
 */
public class AvatarManager extends Actor
{
    // Create Queue of all the avatars 
    private Queue<Avatar> avatars = new Queue<>();

    // current avatar 
    private Avatar current;

    public AvatarManger()
    {
        setImage(getImage() null);
        avatars.enqueue(new Avatar("mario.png"));
        avatars.enqueue(new Avatar("luigi.png"));
        avatars.enqueue(new Avatar("bowser.png"));
    
        current = avatars.dequeue();

    }

    protected void addedToWorld(World world)
    {
        world.addObject(new Button(() -> nextAvatar()), world.getWidth() / 2, world.getHeight() / 2);
        updateAvatar();
    }

    public void updateAvatar()
    {
        int x = 300;
        int y = 100;

        if(current != null)
        {
            getWorld().removeObject(current);
        }
        world.addObject(current, x, y);
    }

    public void nextAvatar()
    {
        avatars.enqueue(current);
        getWorld().removeObject(current);
        current = avatars.dequeue;
        updateAvatar();
    }
    public void act()
    {
        // Add your action code here.
    }
}

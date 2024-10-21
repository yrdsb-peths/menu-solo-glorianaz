import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author Zheng
 * @version Oct 2024
 */
public class MenuScreen extends World
{
    public MenuScreen() {
        super(600, 400, 1);

        //addObject(new Button(this::goInstructions), 300, 340);
        addObject(new Button(() -> Greenfoot.setWorld(new InstructionScreen(this))), 300, 340);
    }

    public void goInstructions() {
        Greenfoot.setWorld(new InstructionScreen(this));
    }

    
    AvatarManager avatarManager = new AvatarManager();
    // addObject(avatarManager,300, 100);
}



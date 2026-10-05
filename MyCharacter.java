
public class MyCharacter
 {
    private String name;
    private String color;
    private int numberOfEyes;
    private int lives;

    public MyCharacter() 
    {
        name = "Unknown";
        color = "gray";
        numberOfEyes = 2;
        lives = 3;
    }
    public MyCharacter(String name, String color, int numberOfEyes, int lives) 
    {
        this.name = name;
        this.color = color;
        this.numberOfEyes = numberOfEyes;
        this.lives = lives;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getColor() 
    {
        return color;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }
    public int getNumberOfEyes() 
    {
        return numberOfEyes;
    }
    public void setNumberOfEyes(int numberOfEyes) 
    {
        this.numberOfEyes = numberOfEyes;
    }
    public int getLives() 
    {
        return lives;
    }
    public void setLives(int lives) 
    {
        this.lives = lives;
    }
}
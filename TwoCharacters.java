public class TwoCharacters
{
    public static void main(String[] args)
    {
        MyCharacter hero1 = new MyCharacter("Rachel", "red", 4, 3);
        MyCharacter hero2 = new MyCharacter();
        hero2.setName("Brittany");
        hero2.setColor("green");
        hero2.setNumberOfEyes(1);
        hero2.setLives(7);

        display(hero1);
        display(hero2);
    }
    public static void display(MyCharacter character)
    {
        System.out.println("Character: " + character.getName());
        System.out.println("   Color: " + character.getColor());
        System.out.println("   Number of eyes: " + character.getNumberOfEyes());
        System.out.println("   Lives: " + character.getLives());
    }
}
/**
 * This class represents a basic home with methods such as setting and rising the sun
 * and also allows the user to move the person back and forth once the sun is set.
 *
 * @author Maximus Vancaneghem
 * @version 2022.01.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle car;
    private Square door;
    private Circle door2;
    private Triangle roof;
    private Circle sun;
    private Circle wheel;
    private Circle wheel2;   
    private Person person;
    private Square chimney;
    private Square chimney2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        door = new Square();
        door2 = new Circle();
        car = new Triangle();
        roof = new Triangle();  
        sun = new Circle();
        wheel = new Circle();
        wheel2 = new Circle();
        person = new Person();
        chimney = new Square();
        chimney2 = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            chimney.changeColor("black");
            chimney.changeSize(20);
            chimney.moveVertical(-30);
            chimney.moveHorizontal(-45);
            chimney.makeVisible();
            
            chimney2.changeColor("black");
            chimney2.changeSize(30);
            chimney2.moveHorizontal(-50);
            chimney2.moveVertical(-20);
            chimney2.makeVisible();
            
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            door.changeColor("black");
            door.moveVertical(110);
            door.moveHorizontal(-60);
            door.changeSize(30);
            door.makeVisible();
            
            door2.changeColor("black");
            door2.moveVertical(130);
            door2.moveHorizontal(20);
            door2.changeSize(30);
            door2.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(-200);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            person.moveVertical(130);
            person.moveHorizontal(-130);
            person.makeVisible();
            
            wheel.changeColor("black");
            wheel.changeSize(20);
            wheel.moveHorizontal(80);
            wheel.moveVertical(180);
            wheel.makeVisible();
            
            wheel2.changeColor("black");
            wheel2.changeSize(20);
            wheel2.moveHorizontal(180);
            wheel2.moveVertical(180);
            wheel2.makeVisible();
            
            car.changeColor("blue");
            car.changeSize(30, 180);
            car.moveHorizontal(160);
            car.moveVertical(100);
            car.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        wheel.changeColor("black");
        wheel2.changeColor("black");
        car.changeColor("black");
        door.changeColor("white");
        door2.changeColor("white");
        chimney.changeColor("black");
        chimney2.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        wheel.changeColor("black");
        wheel2.changeColor("black");
        car.changeColor("blue");
        door.changeColor("black");
        door2.changeColor("black");
        chimney.changeColor("white");
        chimney2.changeColor("white");
    }
    
    /**
     * Change this picture to make the sun set 
     */
    public void sunSet()
    {
        sun.slowMoveVertical(250);
        person.slowMoveVertical(-65);
    }
    
    /**
     * Change this picture to make the sun rise
     */
    public void sunRise()
    {
        sun.slowMoveVertical(-250);
        person.slowMoveVertical(65);
    }
    
    /**
     * Change this picture to make a person walk to left
     */
    public void walk()
    {
        person.slowMoveHorizontal(-65);
    }
    
    /**
     * Change this picture to make a person walk to their previous position
     */
    public void walkBack()
    {
        person.slowMoveHorizontal(65);
    }
}

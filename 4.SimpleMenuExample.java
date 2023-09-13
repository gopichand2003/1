import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SimpleMenuExample extends Frame implements ActionListener
{
Menu kitchen,electronics,furniture;
public SimpleMenuExample()
{
MenuBar mb=new MenuBar();
setMenuBar(mb);

kitchen=new Menu("Kitchen");
electronics=new Menu("Electronics");
furniture=new Menu("Furniture");

mb.add(kitchen);
mb.add(electronics);
mb.add(furniture);

kitchen.addActionListener(this);
electronics.addActionListener(this);
furniture.addActionListener(this);

kitchen.add(new MenuItem("Dish washer"));
kitchen.add(new MenuItem("Chimney"));
kitchen.add(new MenuItem("Stove"));
kitchen.addSeparator();
kitchen.add(new MenuItem("Mcro oven"));
kitchen.add(new MenuItem("Grinder"));
kitchen.add(new MenuItem("Mixer"));

electronics.add(new MenuItem("DVD player"));
electronics.add(new MenuItem("Dryer"));
electronics.add(new MenuItem("TV"));
electronics.addSeparator();
electronics.add(new MenuItem("Refrigerator"));
electronics.add(new MenuItem("Replace"));
electronics.add(new MenuItem("GoTo"));

furniture.add(new MenuItem("Sofa set"));
furniture.add(new MenuItem("Table"));
furniture.add(new MenuItem("Chair"));
furniture.addSeparator();
furniture.add(new MenuItem("Dining Table"));
furniture.add(new MenuItem("Sofa set"));
furniture.add(new MenuItem("Sofa set"));
setTitle("Simple Menu Program");
setSize(300,300);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
String str = e.getActionCommand();
System.out.println("You selected "+ str);
}
public static void main(String args[])
{
new SimpleMenuExample();
}
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import javax.xml.bind.Element;

public class Draggable  extends TestBase{

   @Test
   public void testDraggable(){
       wd.get("http://localhost/test/drag.html");
       WebElement box = wd.findElement(By.id("draggable"));

       new Actions(wd).moveToElement(box).
               clickAndHold().pause(2000).
               moveByOffset(300,100).pause(2000).moveByOffset(300,100).
               pause(2000).release().perform();

   }


}


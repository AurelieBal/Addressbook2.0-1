import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;


public class firstSimpleTest extends TestBase {

  @Test
  public void searchElements(){

    openSite("https://jqueryui.com");
    List<WebElement> webelement= wd.findElements(By.xpath("//div[@id='sidebar']//aside[1]//ul[]"));
  //  for(int i=0, i<, i++)
    {
      wd.findElements(By.xpath("//div[@id='sidebar']//aside[1]//ul[]"));
      String actualText = wd.findElement(By.xpath("//h1[@class='entry-title'])")).getText().toLowerCase();
      System.out.println(actualText);

      Assert.assertEquals(actualText,"");
    }
  }


  @Test
  public void searchTestWithEnter(){

    openSite("https://jqueryui.com");
    type(By.name("s"), "button" + Keys.ENTER);
    //proceedToSearchClickEnter();

    String actualText = wd.findElement(By.cssSelector("h1 span")).getText().toLowerCase();
    System.out.println(actualText);

    Assert.assertEquals(actualText,"button");

  }

  @Test
  public void SearchTestWithLoupe(){

    openSite("https://jqueryui.com");
    type(By.name("s"), "button");
    proceedToSearch();

    String actualText = wd.findElement(By.cssSelector("h1 span")).getText().toLowerCase();
    System.out.println(actualText);

    Assert.assertEquals(actualText,"button");

  }

}
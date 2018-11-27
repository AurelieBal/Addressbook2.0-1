package com.telran.repeat.tests;

import com.telran.repeat.model.Contact;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ContactCreationTests extends TestBase {
  @Test(dataProvider = "validContacts", dataProviderClass = StaticProvider.class)
  public void createContactTest(Contact contact) {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().confirmContactCreation();

  }


  @Test
  public void createContactTest2() {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new Contact().setfName("John").setlName("Smith").setAddress("tel aviv")
            .setEmail("weqdew'k@gmail.com ")
            .setPhoneHome("21793127643")
            .setGroup("test1"));
          //  .setPhoto(new File("src/test/resources/Unknown.jpg")));
    app.getContactHelper().confirmContactCreation();

  }
}

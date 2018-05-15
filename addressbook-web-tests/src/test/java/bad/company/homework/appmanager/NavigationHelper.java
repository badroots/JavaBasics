package bad.company.homework.appmanager;

import bad.company.homework.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper {

  private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void fillContactData(ContactData contactData) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
    wd.findElement(By.name("middlename")).click();
    wd.findElement(By.name("middlename")).sendKeys(contactData.getMiddlename());
    wd.findElement(By.name("lastname")).click();
    wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
    wd.findElement(By.name("nickname")).click();
    wd.findElement(By.name("nickname")).sendKeys(contactData.getNickname());
    wd.findElement(By.name("title")).click();
    wd.findElement(By.name("title")).sendKeys(contactData.getTitle());
    wd.findElement(By.name("company")).click();
    wd.findElement(By.name("company")).sendKeys(contactData.getCompany());
    wd.findElement(By.name("address")).click();
    wd.findElement(By.name("address")).sendKeys(contactData.getAddress());
    wd.findElement(By.name("home")).click();
    wd.findElement(By.name("home")).sendKeys(contactData.getHomePhoneNumber());
    wd.findElement(By.name("mobile")).click();
    wd.findElement(By.name("mobile")).sendKeys(contactData.getMobilePhoneNumber());
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).sendKeys(contactData.getEmail());
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).sendKeys(contactData.getAddress2());
    wd.findElement(By.name("notes")).click();
    wd.findElement(By.name("notes")).sendKeys(contactData.getNotes());
  }

  public void goBackToHomePage() {
    wd.findElement(By.linkText("home page")).click();
  }

  public void goToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
  }
}

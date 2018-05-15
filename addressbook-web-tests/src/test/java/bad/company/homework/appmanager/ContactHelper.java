package bad.company.homework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper {
  private FirefoxDriver wd;

  public ContactHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void clickAddNewContact() {
    wd.findElement(By.linkText("add new")).click();
  }

  public void submitContact() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

}

package bad.company.homework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void clickAddNewContact() {
   click(By.name("add new"));
  }

  public void submitContact() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

}

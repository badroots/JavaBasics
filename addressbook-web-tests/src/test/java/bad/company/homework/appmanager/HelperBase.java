package bad.company.homework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperBase {

  protected FirefoxDriver wd;

  public HelperBase(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void click(By locator) {
    wd.findElement(locator).click();
  }

  public void type(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }
}

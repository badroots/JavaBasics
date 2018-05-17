package bad.company.homework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void goBackToHomePage() {
    click(By.linkText("home"));
  }

  public void goToGroupPage() {
    click(By.linkText("group page"));
  }
}

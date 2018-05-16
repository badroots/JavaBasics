package bad.company.homework.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {

  public SessionHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void login(String user, String password) {
    click(By.name("user"));
    type(By.name("user"), user);
    click(By.name("pass"));
    type(By.name("pass"), password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }

}

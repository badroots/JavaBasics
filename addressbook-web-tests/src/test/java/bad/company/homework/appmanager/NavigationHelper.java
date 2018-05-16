package bad.company.homework.appmanager;

import bad.company.homework.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void fillContactData(ContactData contactData) {
    click(By.name("firstname"));
    type(By.name("firstname"), contactData.getFirstname());

    click(By.name("middlename"));
    type(By.name("middlename"), contactData.getFirstname());

    click(By.name("lastname"));
    type(By.name("lastname"), contactData.getLastname());

    click(By.name("nickname"));
    type(By.name("nickname"), contactData.getLastname());

    click(By.name("title"));
    type(By.name("title"), contactData.getLastname());

    click(By.name("company"));
    type(By.name("company"), contactData.getLastname());

    click(By.name("address"));
    type(By.name("address"), contactData.getLastname());

    click(By.name("home"));
    type(By.name("home"), contactData.getLastname());

    click(By.name("mobile"));
    type(By.name("mobile"), contactData.getLastname());

    click(By.name("email"));
    type(By.name("email"), contactData.getLastname());

    click(By.name("address2"));
    type(By.name("address2"), contactData.getLastname());

    click(By.name("notes"));
    type(By.name("notes"), contactData.getLastname());

  }

  public void goBackToHomePage() {
    click(By.name("home page"));
  }

  public void goToGroupPage() {
    click(By.linkText("group page"));
  }
}

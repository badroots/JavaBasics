package bad.company.homework.appmanager;

import bad.company.homework.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper extends HelperBase {

  public GroupHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void submitGroupForm(String submit) {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
    click(By.name("group_name"));
  }

  public void goToGroups(String groups) {
    click(By.linkText(groups));
  }

  public void deleteGroup() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    if (!wd.findElement(By.name("selected[]")).isSelected()) {
      click(By.name("selected[]"));
    }
  }
}

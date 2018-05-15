package bad.company.homework.appmanager;

import bad.company.homework.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper {

  private FirefoxDriver wd;

  public GroupHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void submitGroupForm(String submit) {
      wd.findElement(By.name(submit)).click();
  }

  public void fillGroupForm(GroupData groupData) {
      wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
      wd.findElement(By.name("group_header")).click();
      wd.findElement(By.name("group_header")).clear();
      wd.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      wd.findElement(By.name("group_footer")).click();
      wd.findElement(By.name("group_footer")).clear();
      wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  public void initGroupCreation() {
      wd.findElement(By.name("new")).click();
      wd.findElement(By.name("group_name")).click();
      wd.findElement(By.name("group_name")).clear();
  }

  public void goToGroups(String groups) {
      wd.findElement(By.linkText(groups)).click();
  }

  public void deleteGroup() {
      wd.findElement(By.name("delete")).click();
  }

  public void selectGroup() {
      if (!wd.findElement(By.name("selected[]")).isSelected()) {
          wd.findElement(By.name("selected[]")).click();
      }
  }
}

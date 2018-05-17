package bad.company.homework.tests;

import bad.company.homework.model.GroupData;
import org.testng.annotations.Test;

public class GroupEditTest extends TestBase {

  @Test
  public void groupEditTest() {
    app.getGroupHelper().goToGroups("groups");
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().editGroupInit();
    app.getGroupHelper().fillGroupForm(new GroupData("Marie", "Jane", "Ostin"));
    app.getGroupHelper().editGroupUpdate();
    app.getGroupHelper().goToGroups("group page");
  }

}

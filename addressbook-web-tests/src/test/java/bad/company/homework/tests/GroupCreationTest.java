package bad.company.homework.tests;

import bad.company.homework.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() {
        app.getGroupHelper().goToGroups("groups");
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test", "tst", "test"));
        app.getGroupHelper().submitGroupForm("submit");
        app.getGroupHelper().goToGroups("group page");
    }

}

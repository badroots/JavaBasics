package bad.company.homework.tests;

import org.testng.annotations.Test;

public class GroupDeletionTest extends TestBase {

    @Test
    public void GroupDeletionTests() {
        app.getGroupHelper().goToGroups("groups");
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteGroup();
        app.getNavigationHelper().goToGroupPage();
    }

}

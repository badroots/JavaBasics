package bad.company.homework.tests;

import bad.company.homework.model.ContactData;
import org.testng.annotations.Test;

public class CreateNewContactTest extends TestBase {

    @Test
    public void testCreateNewContact() {
        app.contactHelper().clickAddNewContact();
        app.getNavigationHelper().fillContactData(new ContactData("test", "test", "test", "test", "test", "test", "test", "222-00-01", "+79607813536", "test@test.com", "street", "ok"));
        app.contactHelper().submitContact();
        app.getNavigationHelper().goBackToHomePage();
    }

}

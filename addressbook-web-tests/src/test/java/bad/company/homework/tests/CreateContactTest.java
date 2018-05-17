package bad.company.homework.tests;

import bad.company.homework.model.ContactData;
import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {

    @Test
    public void testCreateNewContact() {
        app.getContactHelper().clickAddNewContact();
        app.getContactHelper().fillContactData(new ContactData("test", "test", "test", "test", "test", "test", "test", "222-00-01", "+79607813536", "test@test.com", "street", "ok"));
        app.getContactHelper().submitContact();
        app.getNavigationHelper().goBackToHomePage();
    }

}

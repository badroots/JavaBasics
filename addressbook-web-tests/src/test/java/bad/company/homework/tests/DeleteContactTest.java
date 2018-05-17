package bad.company.homework.tests;

import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase {

  @Test

  public void deleteContactTest() {
    app.getContactHelper().activateCheckbox();
    app.getContactHelper().initDeleteContact();
    app.getContactHelper().acceptContactDeletion();
    app.getNavigationHelper().goBackToHomePage();
  }
}

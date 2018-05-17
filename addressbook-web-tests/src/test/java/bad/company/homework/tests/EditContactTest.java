package bad.company.homework.tests;

import bad.company.homework.model.ContactData;
import org.testng.annotations.Test;

public class EditContactTest extends TestBase {

  @Test
  public void editContsctTest () {
    app.getContactHelper().initEditContact();
    app.getContactHelper().fillContactData(new ContactData("Johny", "Cage", "Terry", "Bobo","dkdk","Google","NY","2227801","+796089292","terrytest@hhhfjf.com","UK", "Call me"));
    app.getContactHelper().updateContactForm();
    app.getNavigationHelper().goBackToHomePage();
  }

}

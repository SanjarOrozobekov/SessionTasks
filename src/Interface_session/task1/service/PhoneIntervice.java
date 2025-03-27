package Interface_session.task1.service;

import Interface_session.task1.models.Contact;
import Interface_session.task1.models.Phone;

public interface PhoneIntervice {

    String turnOn(String command, Phone phone);

    Contact call(String name);

    Contact call(long phoneNumber);

    Contact updateContact(String oldName,String newName);

    Contact[] getAllContact();

}

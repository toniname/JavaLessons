package java_core_grom.mateAkademi.treni.GetContact;
import java.util.List;
import java_core_grom.mateAkademi.treni.GetContact.ContactDAOFactory;
import java_core_grom.mateAkademi.treni.GetContact.Contact;

public interface ContactDAO {

    // Добавление контакта - возвращает ID добавленного контакта
    public Long addContact(Contact contact);
    // Редактирование контакта
    public void updateContact(Contact contact);
    // Удаление контакта по его ID
    public void deleteContact(Long contactId);
    // Получение контакта
    public Contact getContact(Long contactId);
    // Получение списка контактов
    public List<Contact> findContacts();

}


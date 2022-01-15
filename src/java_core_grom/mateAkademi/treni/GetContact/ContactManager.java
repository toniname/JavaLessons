package java_core_grom.mateAkademi.treni.GetContact;

import java_core_grom.mateAkademi.treni.GetContact.Contact;

import java.util.List;


public class ContactManager
{
    private ContactDAO dao;

    public ContactManager() {
        dao = ContactDAOFactory.getContactDAO();
    }

    // Добавление контакта - возвращает ID добавленного контакта
    public Long addContact(Contact contact) {
        return dao.addContact(contact);
    }

    // Редактирование контакта
    public void updateContact(Contact contact) {
        dao.updateContact(contact);
    }

    // Удаление контакта по его ID
    public void deleteContact(Long contactId) {
        dao.deleteContact(contactId);
    }

    // Получение одного контакта
    public Contact getContact(Long contactId) {
        return dao.getContact(contactId);
    }

    // Получение списка контактов
    public List<Contact> findContacts() {
        return (List<Contact>) dao.findContacts();
    }
}

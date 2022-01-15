package java_core_grom.mateAkademi.treni.GetContact;

public class ContactDAOFactory {

    public static ContactDAO getContactDAO() {
        return new ContactSimpleDAO();
    }
}


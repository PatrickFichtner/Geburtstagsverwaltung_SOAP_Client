package geburtstagsverwaltung.ws.soap_client;

import geburtstag.soap.AccessRestrictedException_Exception;
import geburtstag.soap.Category;
import geburtstag.soap.GeburtstagWebService;
import geburtstag.soap.GeburtstagWebServiceService;
import geburtstag.soap.Geburtstag;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import geburtstag.soap.Date;
import geburtstag.soap.InvalidCredentialsException_Exception;

/**
 * Aufruf des SOAP-Webservice der Geburtstagsverwaltung-Anwendung. Ausgabe von
 * Vorname, Nachname, Geburtsdatum und allen Kategorien nach erfolgreichem
 * Login.
 */
public class Main {

    public static void main(String[] args) throws IOException, InvalidCredentialsException_Exception, AccessRestrictedException_Exception {
        // Stub-Objekt zum entfernten Aufruf erstellen

        GeburtstagWebServiceService service = new GeburtstagWebServiceService();
        GeburtstagWebService geburtstagWs = service.getGeburtstagWebServicePort();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte geben Sie Ihren Benutzernamen: ");
        String username = br.readLine();
        System.out.println("Bitte geben Sie Ihr Passwort: ");
        String password = br.readLine();

        List<Geburtstag> geburtstage = geburtstagWs.getAllGeburtstage(username, password);
        System.out.println("===========================");
        System.out.println("Alle Geburstage:");
        System.out.println();

        for (Geburtstag geburtstag : geburtstage) {
            System.out.println("Vorname: " + geburtstag.getName());
            System.out.println("Nachname: " + geburtstag.getSurname());
            System.out.println("Geburtsdatum: " + geburtstag.getDate());
            System.out.println();
        }

        System.out.println("===========================");
        System.out.println("Alle Kategorien:");
        System.out.println();

        List<Category> categories = geburtstagWs.getAllCategories(username, password);

        for (Category category : categories) {
            System.out.println(category.getName());
        }
    }
}

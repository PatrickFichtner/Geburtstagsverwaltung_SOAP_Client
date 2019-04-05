package geburtstagsverwaltung.ws.soap_client;

import geburtstag.soap.GeburtstagWebService;
import geburtstag.soap.GeburtstagWebServiceService;
import geburtstag.soap.Geburtstag;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import geburtstag.soap.Date;

/**
 * Mini-Beispiel zum Aufruf eines SOAP-Webservices. Damit das funktioniert, muss
 * im Hintergrund das Projekt "SOAP_Server_Beispiel" ausgeführt werden.
 */
public class Main {

    public static void main(String[] args) {
        // Stub-Objekt zum entfernten Aufruf erstellen

        GeburtstagWebServiceService service = new GeburtstagWebServiceService();
        GeburtstagWebService geburtstagWs = service.getGeburtstagWebServicePort();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bitte geben Sie Ihren Benutzernamen: ");
        //String username = br.readLine();
        System.out.println("Bitte geben Sie Ihr Passwort: ");
        //String password = br.readLine ();

        //List<Geburtstag> geburtstage = geburtstagWs.getAllGeburtstage(username, password);
        System.out.println("===========================");
        System.out.println("Alle Geburstage:");
        System.out.println();

        /**
         * for (Geburtstag geburtstag : geburtstage){
         * System.out.println("Vorname" + geburtstag.getName());
         * System.out.println("Nachname" + geburtstag.getSurname());
         * System.out.println("Geburtsdatum" + geburtstag.getDate());
         * System.out.println(); }
         *
         * System.out.println("Die Geburtstage von heute");
    System.out.println();
         */
        /**
         * Date utilToday = new Date(); SimpleDateFormat DATE_FORMAT = new
         * SimpleDateFormat ("dd.MM"); String stringToday =
         * DATE_FORMAT.format(utilToday);
         *
         *
         *
         *
         * String stringToday = formatutildate (new Date());
         */
        //List<Geburtstag> heute = geburtstagWs.getGeburtstagByDate(username, password);
    }
}

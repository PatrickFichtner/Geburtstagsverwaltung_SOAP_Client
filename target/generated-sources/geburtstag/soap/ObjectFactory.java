
package geburtstag.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the geburtstag.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllCategories_QNAME = new QName("http://soap.geburtstag/", "getAllCategories");
    private final static QName _GetAllCategoriesResponse_QNAME = new QName("http://soap.geburtstag/", "getAllCategoriesResponse");
    private final static QName _GetAllGeburtstage_QNAME = new QName("http://soap.geburtstag/", "getAllGeburtstage");
    private final static QName _GetAllGeburtstageResponse_QNAME = new QName("http://soap.geburtstag/", "getAllGeburtstageResponse");
    private final static QName _GetAllUsers_QNAME = new QName("http://soap.geburtstag/", "getAllUsers");
    private final static QName _GetAllUsersResponse_QNAME = new QName("http://soap.geburtstag/", "getAllUsersResponse");
    private final static QName _GetGeburtstagByDate_QNAME = new QName("http://soap.geburtstag/", "getGeburtstagByDate");
    private final static QName _GetGeburtstagByDateResponse_QNAME = new QName("http://soap.geburtstag/", "getGeburtstagByDateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: geburtstag.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCategories }
     * 
     */
    public GetAllCategories createGetAllCategories() {
        return new GetAllCategories();
    }

    /**
     * Create an instance of {@link GetAllCategoriesResponse }
     * 
     */
    public GetAllCategoriesResponse createGetAllCategoriesResponse() {
        return new GetAllCategoriesResponse();
    }

    /**
     * Create an instance of {@link GetAllGeburtstage }
     * 
     */
    public GetAllGeburtstage createGetAllGeburtstage() {
        return new GetAllGeburtstage();
    }

    /**
     * Create an instance of {@link GetAllGeburtstageResponse }
     * 
     */
    public GetAllGeburtstageResponse createGetAllGeburtstageResponse() {
        return new GetAllGeburtstageResponse();
    }

    /**
     * Create an instance of {@link GetAllUsers }
     * 
     */
    public GetAllUsers createGetAllUsers() {
        return new GetAllUsers();
    }

    /**
     * Create an instance of {@link GetAllUsersResponse }
     * 
     */
    public GetAllUsersResponse createGetAllUsersResponse() {
        return new GetAllUsersResponse();
    }

    /**
     * Create an instance of {@link GetGeburtstagByDate }
     * 
     */
    public GetGeburtstagByDate createGetGeburtstagByDate() {
        return new GetGeburtstagByDate();
    }

    /**
     * Create an instance of {@link GetGeburtstagByDateResponse }
     * 
     */
    public GetGeburtstagByDateResponse createGetGeburtstagByDateResponse() {
        return new GetGeburtstagByDateResponse();
    }

    /**
     * Create an instance of {@link Geburtstag }
     * 
     */
    public Geburtstag createGeburtstag() {
        return new Geburtstag();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCategories }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCategories }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.geburtstag/", name = "getAllCategories")
    public JAXBElement<GetAllCategories> createGetAllCategories(GetAllCategories value) {
        return new JAXBElement<GetAllCategories>(_GetAllCategories_QNAME, GetAllCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCategoriesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllCategoriesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.geburtstag/", name = "getAllCategoriesResponse")
    public JAXBElement<GetAllCategoriesResponse> createGetAllCategoriesResponse(GetAllCategoriesResponse value) {
        return new JAXBElement<GetAllCategoriesResponse>(_GetAllCategoriesResponse_QNAME, GetAllCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGeburtstage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllGeburtstage }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.geburtstag/", name = "getAllGeburtstage")
    public JAXBElement<GetAllGeburtstage> createGetAllGeburtstage(GetAllGeburtstage value) {
        return new JAXBElement<GetAllGeburtstage>(_GetAllGeburtstage_QNAME, GetAllGeburtstage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGeburtstageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllGeburtstageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.geburtstag/", name = "getAllGeburtstageResponse")
    public JAXBElement<GetAllGeburtstageResponse> createGetAllGeburtstageResponse(GetAllGeburtstageResponse value) {
        return new JAXBElement<GetAllGeburtstageResponse>(_GetAllGeburtstageResponse_QNAME, GetAllGeburtstageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.geburtstag/", name = "getAllUsers")
    public JAXBElement<GetAllUsers> createGetAllUsers(GetAllUsers value) {
        return new JAXBElement<GetAllUsers>(_GetAllUsers_QNAME, GetAllUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllUsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.geburtstag/", name = "getAllUsersResponse")
    public JAXBElement<GetAllUsersResponse> createGetAllUsersResponse(GetAllUsersResponse value) {
        return new JAXBElement<GetAllUsersResponse>(_GetAllUsersResponse_QNAME, GetAllUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeburtstagByDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGeburtstagByDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.geburtstag/", name = "getGeburtstagByDate")
    public JAXBElement<GetGeburtstagByDate> createGetGeburtstagByDate(GetGeburtstagByDate value) {
        return new JAXBElement<GetGeburtstagByDate>(_GetGeburtstagByDate_QNAME, GetGeburtstagByDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGeburtstagByDateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGeburtstagByDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.geburtstag/", name = "getGeburtstagByDateResponse")
    public JAXBElement<GetGeburtstagByDateResponse> createGetGeburtstagByDateResponse(GetGeburtstagByDateResponse value) {
        return new JAXBElement<GetGeburtstagByDateResponse>(_GetGeburtstagByDateResponse_QNAME, GetGeburtstagByDateResponse.class, null, value);
    }

}

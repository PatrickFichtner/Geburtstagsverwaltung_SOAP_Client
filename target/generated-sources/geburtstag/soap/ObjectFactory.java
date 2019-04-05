
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
    private final static QName _InvalidCredentialsException_QNAME = new QName("http://soap.geburtstag/", "InvalidCredentialsException");
    private final static QName _AccessRestrictedException_QNAME = new QName("http://soap.geburtstag/", "AccessRestrictedException");

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
     * Create an instance of {@link InvalidCredentialsException }
     * 
     */
    public InvalidCredentialsException createInvalidCredentialsException() {
        return new InvalidCredentialsException();
    }

    /**
     * Create an instance of {@link AccessRestrictedException }
     * 
     */
    public AccessRestrictedException createAccessRestrictedException() {
        return new AccessRestrictedException();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidCredentialsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvalidCredentialsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.geburtstag/", name = "InvalidCredentialsException")
    public JAXBElement<InvalidCredentialsException> createInvalidCredentialsException(InvalidCredentialsException value) {
        return new JAXBElement<InvalidCredentialsException>(_InvalidCredentialsException_QNAME, InvalidCredentialsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessRestrictedException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessRestrictedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.geburtstag/", name = "AccessRestrictedException")
    public JAXBElement<AccessRestrictedException> createAccessRestrictedException(AccessRestrictedException value) {
        return new JAXBElement<AccessRestrictedException>(_AccessRestrictedException_QNAME, AccessRestrictedException.class, null, value);
    }

}

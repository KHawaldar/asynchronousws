
package com.poll;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.poll package. 
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

    private final static QName _GetCreditScoreAsync_QNAME = new QName("http://poll.com/", "getCreditScoreAsync");
    private final static QName _GetCreditScoreAsyncResponse_QNAME = new QName("http://poll.com/", "getCreditScoreAsyncResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.poll
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCreditScoreAsync }
     * 
     */
    public GetCreditScoreAsync createGetCreditScoreAsync() {
        return new GetCreditScoreAsync();
    }

    /**
     * Create an instance of {@link GetCreditScoreAsyncResponse }
     * 
     */
    public GetCreditScoreAsyncResponse createGetCreditScoreAsyncResponse() {
        return new GetCreditScoreAsyncResponse();
    }

    /**
     * Create an instance of {@link Score }
     * 
     */
    public Score createScore() {
        return new Score();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditScoreAsync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://poll.com/", name = "getCreditScoreAsync")
    public JAXBElement<GetCreditScoreAsync> createGetCreditScoreAsync(GetCreditScoreAsync value) {
        return new JAXBElement<GetCreditScoreAsync>(_GetCreditScoreAsync_QNAME, GetCreditScoreAsync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditScoreAsyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://poll.com/", name = "getCreditScoreAsyncResponse")
    public JAXBElement<GetCreditScoreAsyncResponse> createGetCreditScoreAsyncResponse(GetCreditScoreAsyncResponse value) {
        return new JAXBElement<GetCreditScoreAsyncResponse>(_GetCreditScoreAsyncResponse_QNAME, GetCreditScoreAsyncResponse.class, null, value);
    }

}

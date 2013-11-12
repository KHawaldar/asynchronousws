
package com.poll;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CreditRateServiceImplService", targetNamespace = "http://poll.com/", wsdlLocation = "file:/F:/development/workspace/asynchronousClient/web/META-INF/CreditRateServiceImplService.wsdl")
public class CreditRateServiceImplService
    extends Service
{

    private final static URL CREDITRATESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CREDITRATESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CREDITRATESERVICEIMPLSERVICE_QNAME = new QName("http://poll.com/", "CreditRateServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/F:/development/workspace/asynchronousClient/web/META-INF/CreditRateServiceImplService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CREDITRATESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CREDITRATESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CreditRateServiceImplService() {
        super(__getWsdlLocation(), CREDITRATESERVICEIMPLSERVICE_QNAME);
    }

    public CreditRateServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CREDITRATESERVICEIMPLSERVICE_QNAME, features);
    }

    public CreditRateServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CREDITRATESERVICEIMPLSERVICE_QNAME);
    }

    public CreditRateServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CREDITRATESERVICEIMPLSERVICE_QNAME, features);
    }

    public CreditRateServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CreditRateServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CreditRateServiceImpl
     */
    @WebEndpoint(name = "CreditRateServiceImplPort")
    public CreditRateServiceImpl getCreditRateServiceImplPort() {
        return super.getPort(new QName("http://poll.com/", "CreditRateServiceImplPort"), CreditRateServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CreditRateServiceImpl
     */
    @WebEndpoint(name = "CreditRateServiceImplPort")
    public CreditRateServiceImpl getCreditRateServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://poll.com/", "CreditRateServiceImplPort"), CreditRateServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CREDITRATESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CREDITRATESERVICEIMPLSERVICE_EXCEPTION;
        }
        return CREDITRATESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}

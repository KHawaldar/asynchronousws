Asynchronous web services: 

Asynchronous mode of invocation can be done  either using polling strategy or callback 

Polling strategy: Refer CreditScoreAsynchronousPollingTest.java

To enable the asynchronous mode at client side, add the following in wsdl(Refer CreditRateServiceImplService.wsdl in resource package)

<jaxws:bindings>
        <jaxws:enableAsyncMapping>true</jaxws:enableAsyncMapping>
    </jaxws:bindings>
    
    where jaxws is prefix for http://java.sun.com/xml/ns/jaxws



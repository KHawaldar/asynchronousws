Asynchronous web services: 

Asynchronous mode of invocation can be done  either using polling strategy or callback 

Polling strategy: Refer CreditScoreAsynchronousPollingTest.java

To enable the asynchronous mode at client side, add the following in wsdl(Refer CreditRateServiceImplService.wsdl in resource package)

<jaxws:bindings>
        <jaxws:enableAsyncMapping>true</jaxws:enableAsyncMapping>
    </jaxws:bindings>
    
    where jaxws is prefix for http://java.sun.com/xml/ns/jaxws

Callback strategy: Client will provide AsynchHandler interface for implementing the Callback model. Once the response is received,
the handleResponse() of AsynchHandler class will be invoked. Here the client will continue its work, until it gets response.
Refer: CreditScoreAsynchronousCallBackTest.java

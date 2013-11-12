/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poll.client;

import com.poll.CreditRateServiceImpl;
import com.poll.CreditRateServiceImplService;
import com.poll.Customer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.AsyncHandler;

/**
 *
 * @author Shivraj
 */
public class CreditScoreAsynchronousCallBackTest {
    
    public void main(String args[])
    {
        
        URL url = null;
        try {
            url = new URL("file:/F:/development/workspace/asynchronousClient/build/web/META-INF/CreditRateServiceImplService.wsdl");
        } catch (MalformedURLException ex) {
            Logger.getLogger(CreditScoreAsynchronousPollingTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        QName qName = new QName("http://poll.com/","CreditRateServiceImplService");
         CreditRateServiceImplService service =new CreditRateServiceImplService(url, qName);
         CreditRateServiceImpl creditRateServiceImpl = service.getCreditRateServiceImplPort();
          Customer customer = new Customer();
         creditRateServiceImpl.getCreditScoreAsyncAsync(customer, null);
         //Create the asynchronous handler
         AsyncHandler asyncHandler = null;
        
    }
}

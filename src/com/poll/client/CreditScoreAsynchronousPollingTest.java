/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poll.client;

import com.poll.CreditRateServiceImpl;
import com.poll.CreditRateServiceImplService;
import com.poll.Customer;
import com.poll.GetCreditScoreAsyncResponse;
import com.poll.Score;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Response;

/**
 *
 * @author Shivraj
 */
public class CreditScoreAsynchronousPollingTest {
    
    public static void main(String args[]) 
    {
        //Call the webservice client, which extends the service.
        //From the service, get the port. 
        //Once you get the port, you can get the binding service.
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
        
        Response<GetCreditScoreAsyncResponse> response=  creditRateServiceImpl.getCreditScoreAsyncAsync(customer);
        GetCreditScoreAsyncResponse creditScore = null;
      
      
    
       while( !response.isDone())
       {
          
          
           //Do your work.
       }
        try {
            creditScore=  response.get();
        } catch (InterruptedException ex) {
            Logger.getLogger(CreditScoreAsynchronousPollingTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(CreditScoreAsynchronousPollingTest.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("result--->"+creditScore.getReturn().getRate());
         
        
       
       
         
      
    }
}

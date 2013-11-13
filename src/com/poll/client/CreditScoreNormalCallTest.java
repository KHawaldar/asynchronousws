/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poll.client;

import com.poll.CreditRateServiceImpl;
import com.poll.CreditRateServiceImplService;
import com.poll.Customer;
import com.poll.Score;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;

/**
 *
 * @author Shivraj
 */
public class CreditScoreNormalCallTest {
     public static void main(String args[])
    {
        
        URL url = null;
        try {
            url = new URL("file:/F:\\development\\workspace\\asynchronousJavaApp\\asynchronousws\\src\\resources/CreditRateServiceImplService.wsdl");
        } catch (MalformedURLException ex) {
            Logger.getLogger(CreditScoreAsynchronousPollingTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        QName qName = new QName("http://poll.com/","CreditRateServiceImplService");
         CreditRateServiceImplService service =new CreditRateServiceImplService(url, qName);
         CreditRateServiceImpl creditRateServiceImpl = service.getCreditRateServiceImplPort();
          Customer customer = new Customer();
          Score score = creditRateServiceImpl.getCreditScoreAsync(customer);
          System.out.println("score is--->"+score.getRate());
    }
}

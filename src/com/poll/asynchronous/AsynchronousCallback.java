/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poll.asynchronous;

import com.poll.GetCreditScoreAsyncResponse;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;

/**
 *
 * @author Shivraj
 */
public class AsynchronousCallback implements AsyncHandler<GetCreditScoreAsyncResponse>{
    private GetCreditScoreAsyncResponse result;
    
    
    @Override
    public void handleResponse(Response<GetCreditScoreAsyncResponse> res) {
        try {
          
            result = res.get();
           
        } catch (InterruptedException ex) {
            Logger.getLogger(AsynchronousCallback.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ExecutionException ex) {
            Logger.getLogger(AsynchronousCallback.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public GetCreditScoreAsyncResponse getResult()
    {
        return result;
    }
    
}

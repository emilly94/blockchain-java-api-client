/*
 * Bitcoin API
 * Blockchain Facilities
 *
 * OpenAPI spec version: 2.0.0
 * Contact: contato@astarlabs.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.astarlabs.client.api;

import org.junit.Ignore;
import org.junit.Test;

import br.com.astarlabs.client.ApiException;
import br.com.astarlabs.client.model.BlockchainNetwork;
import br.com.astarlabs.client.model.SingleResult;
import br.com.astarlabs.util.Blockchain;

/**
 * API tests for SendApi
 */
public class SendApiTest {

    private final SendApi api = new SendApi();

    
    /**
     * Send file hash to bitcoin blockchain
     *
     * Send an OP_RETURN transaction with a base64 encoded file and return the API id for the blockchain transaction. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
    @Test
    public void sendFileTest() throws ApiException {
        
    	String token = null;
        Integer account = null;
        String user = null;
        String password = null;
        String base64 = null;
        BlockchainNetwork blockchainNetwork = null;
        Integer test = 1;
        SingleResult response = api.sendFile(token, account, user, password, base64, blockchainNetwork, test);

        // TODO: test validations
    }
    
    /**
     * Send a value for address
     *
     * Send a value for address by an blockchain transaction. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
    @Test
    public void sendPayAddressTest() throws ApiException {
        String token = null;
        Integer account = null;
        String user = null;
        String password = null;
        String address = null;
        BlockchainNetwork blockchainNetwork = null;
        Integer test = null;
        SingleResult response = api.sendPayAddress(token, account, user, password, address, blockchainNetwork, test);

        // TODO: test validations
    }
    
    /**
     * Send string to bitcoin blockchain
     *
     * Send an OP_RETURN transaction with a string and return the API id for the blockchain transaction. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Ignore
    @Test
    public void sendStringTest() throws ApiException {
        String token = null;
        Integer account = null;
        String user = null;
        String password = null;
        String string = null;
        BlockchainNetwork blockchainNetwork = null;
        Integer test = null;
        SingleResult response = api.sendString(token, account, user, password, string, blockchainNetwork, test);

        // TODO: test validations
    }
    
    @Ignore
    @Test
    public void sendHashTest() throws ApiException {
    	
    	Blockchain blockchain = new Blockchain("", 0, "", "");
    	
     	String reg = blockchain.registrarDocumento("registrodeText1231".getBytes(), BlockchainNetwork.ETHEREUM_CLASSIC, 0);
    	System.out.println(reg);
    	
    	
    	
    }
    
    
}

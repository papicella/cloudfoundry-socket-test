package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.Socket;

@RestController
public class SocketTestRest
{

    protected static Logger logger = Logger.getLogger(SocketTestRest.class);

    @RequestMapping ("/{host}/{port}")
    public Result testConnection
            (@PathVariable String host, @PathVariable String port)
    {
        Socket s = null;
        Result result;

        try
        {
            logger.info("Starting HTTP socket test ...");
            logger.info(String.format("Attempting to connect to host %s on port %s", host, port));

            InetAddress inetAddress = InetAddress.getByName(host);
            s = new Socket(inetAddress, Integer.parseInt(port));

            result = new Result("SUCCESS", "N/A", host, port);
        }
        catch (Exception e)
        {
            logger.info(String.format("Failed to connect to host %s on port %s", host, port));
            result = new Result("FAILED", e.getMessage(), host, port);
        }
        finally
        {
            if(s != null)
                try {s.close();}
                catch(Exception e) {
                }
        }

        return result;
    }
}

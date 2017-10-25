package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.Socket;

@RestController
public class SocketTestRest
{

    @RequestMapping ("/{host}/{port}")
    public Result testConnection
            (@PathVariable String host, @PathVariable String port)
    {
        Socket s = null;
        Result result;

        try
        {
            InetAddress inetAddress = InetAddress.getByName(host);
            s = new Socket(inetAddress, Integer.parseInt(port));

            result = new Result("SUCCESS", "N/A", host, port);
        }
        catch (Exception e)
        {
            result = new Result("FAILED", e.getMessage(), host, port);
        }
        finally
        {
            if(s != null)
                try {s.close();}
                catch(Exception e){}
        }

        return result;
    }
}

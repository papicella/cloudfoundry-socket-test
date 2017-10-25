## Cloud Foundry Socket Test

This app simply tests whether a host:port is accessible from a CF app instance. For example can my application
instance access my Oracle Database Instance running outside of PCF given application instances need network 
access to the database database for example.

This app can verify the networking connectiviy for you. 

Use:

```
http http://url/{hostname}/{port}

OR

curl http://url/{hostname}/{port}
```

Demo Output:

### Success

```
pasapicella@pas-macbook:~$ http http://pas-cf-sockettest.cfapps.io/www.google.com.au/80
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 81
Content-Type: application/json;charset=UTF-8
Date: Wed, 25 Oct 2017 08:38:33 GMT
X-Vcap-Request-Id: 8fd05c77-f680-4966-558b-c45e71825fa0

{
    "errorMessage": "N/A",
    "hostname": "www.google.com.au",
    "port": "80",
    "res": "SUCCESS"
}
```

### Failed

```
pasapicella@pas-macbook:~$ http http://pas-cf-sockettest.cfapps.io/10.0.0.10/8080
HTTP/1.1 200 OK
Connection: keep-alive
Content-Length: 110
Content-Type: application/json;charset=UTF-8
Date: Wed, 25 Oct 2017 11:52:18 GMT
X-Vcap-Request-Id: 91ad2359-7d95-49c6-4538-548e480b7820

{
    "errorMessage": "Connection refused (Connection refused)",
    "hostname": "10.0.0.10",
    "port": "8080",
    "res": "FAILED"
}
```

<hr />
Pas Apicella [papicella at pivotal.io] is a Senior Platform Architect at Pivotal Australia 
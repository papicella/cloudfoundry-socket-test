## Cloud Foundry Socket Test

This app simply tests whether a host:port is accessible from a CF app instance 

Use:

```
http http://url/{hostname}/{port}

OR

curl http://url/{hostname}/{port}
```

Demo Output:

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


package com.example.demo;

public class Result
{
    private String res;
    private String errorMessage;
    private String hostname;
    private String port;

    public Result(String res, String errorMessage, String hostname, String port) {
        this.res = res;
        this.errorMessage = errorMessage;
        this.hostname = hostname;
        this.port = port;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Result{" +
                "res='" + res + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                ", hostname='" + hostname + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}

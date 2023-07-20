package Structural_Pattern.Proxy;

public class Proxy_Demo {

    public static void main(String[] args) {

         Server server = new ProxyServer();

         server.request("1223");

         server.request("123");

    }
}

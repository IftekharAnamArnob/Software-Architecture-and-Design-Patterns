package Structural_Pattern.Proxy;

public class ProxyServer implements Server{

     private RealServer realServer;

    @Override
    public void request(String data) {
       if(Checkaccess(data))
       {

           if(realServer==null){
               realServer = new RealServer();
               realServer.request(data);

           }

       }

       else
           System.out.println("Access denied!"+data);


    }


    private boolean Checkaccess(String data)
    {
        if(data=="123")
            return true;

        else return false;



    }
}

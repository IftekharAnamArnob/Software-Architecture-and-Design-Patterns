package Structural_Pattern.Proxy;

public class RealServer implements Server{

    @Override
    public void request(String data) {
        System.out.println("Real Server is processing the data" +data);
    }
}

package exception.ex2;


public class NetworkServiceV2_3 {
    public void sendMessage(String data)  {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            client.disconnect();
        }catch (NetworkClientExceptionV2 e){
            System.out.println("오류 코드:" + e.getErrorCode() +"메세지"+ e.getMessage());
            // try,catch 가 실행이되어도 무조건 finally 코드블럭은 실행이 됨
            //catch에서 잡을 수없는 예외가 터져도 finally 코드블럭은 실행이 됨
        }finally {
            client.disconnect();

        }

    }
}

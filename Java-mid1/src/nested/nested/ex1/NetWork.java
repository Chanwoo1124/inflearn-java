package nested.nested.ex1;

public class NetWork {
    public void sendMessage(String text){
        NetWorkMessage netWorkMessage = new NetWorkMessage(text);
        netWorkMessage.print();
    }
}

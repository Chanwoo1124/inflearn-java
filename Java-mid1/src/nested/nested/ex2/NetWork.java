package nested.nested.ex2;



public class NetWork {
    public void sendMessage(String text) {
        NetWorkMessage netWorkMessage = new NetWorkMessage(text);
        netWorkMessage.print();
    }
    private static class NetWorkMessage {
            private String content;

            public NetWorkMessage(String content) {
                this.content = content;
            }
            public void print(){
                System.out.println("content = " + content);
            }
    }
}


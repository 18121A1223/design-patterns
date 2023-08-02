public class client {

    public static void main(String args[]){
        RemoteService remoteService = new RemoteService();
        RemoteProxy remoteProxy = new RemoteProxy(remoteService);
        System.out.println("original object");
        remoteService.operation();
        System.out.println("proxy object");
        remoteProxy.operation();
    }
}

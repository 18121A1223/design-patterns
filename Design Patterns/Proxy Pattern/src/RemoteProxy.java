public class RemoteProxy implements IRemoteService {

    IRemoteService iRemoteService;

    public RemoteProxy(IRemoteService iRemoteService) {
        this.iRemoteService = iRemoteService;
    }

    @Override
    public void operation() {
        //here we can do all kind object life cycle managements like implement logging,caching, lazy intialization etc
        System.out.println("before accesing original remote service");
        iRemoteService.operation();
        System.out.println("after accesing original remote service");
    }
}

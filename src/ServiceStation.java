public class ServiceStation {
    public void check(WheeledTransport transport) {
        for (int i = 0; i < transport.getWheelsCount(); i++){
            transport.updateTyre();
            System.out.println(" № " + (i+1));
            }
        transport.checkEngine();
        transport.checkTrailer();
        }
}

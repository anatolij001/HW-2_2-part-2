public class ServiceStation {
    public void check(WheeledTransport transport) {
        System.out.println("\n" + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
            System.out.println(" № " + (i + 1));
        }
        transport.checkEngine();
        transport.checkTrailer();
    }
}

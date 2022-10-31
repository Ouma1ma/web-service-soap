import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        Compte cp = stub.getCompte(2);
        System.out.println("le solde est:" +cp.getSolde());
    }
}

package src.MyTests.RemoteCalculator;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static final String UNIQUE_NAME = "server.calculator";

    public static void main(String[] args) throws RemoteException, NotBoundException {

        final Registry registry = LocateRegistry.getRegistry(1337);
        Calculator calc = (Calculator) registry.lookup(UNIQUE_NAME);
        int result = calc.multiply(10, 5);
        System.out.println(result);
    }
}

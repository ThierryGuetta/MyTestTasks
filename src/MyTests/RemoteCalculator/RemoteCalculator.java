package src.MyTests.RemoteCalculator;

import java.rmi.RemoteException;

public class RemoteCalculator implements Calculator {
    @Override
    public int multiply(int x, int y) throws RemoteException{
        return x * y;
    }
}

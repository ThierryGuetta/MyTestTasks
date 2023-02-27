package src.MyTests.RemoteCalculator;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    /* Создаем уникальное имя, по которому будет искаться наш сервер */
    public static final String UNIQUE_NAME = "server.calculator";

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, InterruptedException {
        /* Создаем объекут класса - программы */
        final Calculator calc = new RemoteCalculator();
        /* Создаем реестр объектов для удаленного доступа, него помещаем уникальный порт, по которому будет
        * доступ к реестру*/
        final Registry registry = LocateRegistry.createRegistry(1337);
        /* Создаем заглушку. Она прячет в себе весь процесс удаленного вызова. Это самый важный элемент RMI
        * Заглушка сериализует объекты, которые переданы в параметры */
        Remote stub = UnicastRemoteObject.exportObject(calc, 0);
        /* Регистрируем заглушку в реестре объектов под уникальным именем UNIQUE_NAME */
        registry.bind(UNIQUE_NAME, stub);
        /* Усыпляем поток, чтобы программа не завершилась досрочно */
        Thread.sleep(Integer.MAX_VALUE);
    }
}

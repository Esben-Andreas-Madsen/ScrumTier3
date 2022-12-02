package database.postgres;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Connection;

public interface DBConnectionInterface extends Remote {
    Connection getConnection() throws RemoteException;
}

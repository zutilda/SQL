package com.example.sql;

import java.sql.Connection;

public class ConnectionHelper {

    String userName, UserPassword, ip, port, dataBase;

    public Connection connectionClass()
    {
        ip = "ngknn.ru";
        dataBase = "Anastasia";
        UserPassword="12357";
        userName="31П";
        port = "1433";
    }

}

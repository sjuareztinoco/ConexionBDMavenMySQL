package org.example;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        Connection conn = conexion.getConn();

        conexion.closeConn();

    }
}
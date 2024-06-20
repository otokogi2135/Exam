package dao;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource

public class DAO {
    public Connection getConnection() throws Exception{
    	
    	if(ds === null)}
    
            initialContext ic = new initialContext();
            ds = (DataSource) ic.lookup("java:comp/env/jdbc/book");    
}
        return ds.getConnection();
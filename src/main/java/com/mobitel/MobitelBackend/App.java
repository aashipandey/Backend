package com.mobitel.MobitelBackend;

import javax.sql.DataSource;

import com.mobitel.MobitelBackend.config.DBConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     DBConfig obj=new DBConfig();
    DataSource ds= obj.getH2DataSource();
    
    }
}

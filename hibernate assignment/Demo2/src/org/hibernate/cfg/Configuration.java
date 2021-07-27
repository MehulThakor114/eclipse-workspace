package org.hibernate.cfg;

public class Configuration {
         public Configuration(){
        	 System.out.println("Configuration constructor");
         }
        public SessionFactory buildSessionFactory(){
        	 return new Factory();
         }
}

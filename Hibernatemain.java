//java hibernate youtube tutorial simplilearn

package com.control;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.to.Player;

public class Hibernatemain {

public static void main(String[] args)
{  try
   {
	Configuration configuration = new Configuration().configure();
	configuration.addAnnotatedClass(com.to.Player.class);
	StandardServiceRegistryBuilder builder = 
			new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	SessionFactory factory = configuration.buildSessionFactory(builder.build());
	Session session = factory.openSession();
	Transaction transaction = session.beginTransaction();
	Player p1 = new Player(10,"Amit",30,"India");
	session.save(p1);
	transaction.commit();
	session.close();
   }
  catch(Exception e)
  {
	  System.out.println(e.getMessage());
  }
}
}

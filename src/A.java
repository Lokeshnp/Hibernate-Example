import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class A {
public static void main(String[] args) {
	UserDetails user1=new UserDetails();
	user1.setUid(11);
	user1.setUsername("muri");
	SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session=sessionFactory.openSession();
	session.beginTransaction();
	session.save(user1);
	session.getTransaction().commit();
	session.close();
}
}

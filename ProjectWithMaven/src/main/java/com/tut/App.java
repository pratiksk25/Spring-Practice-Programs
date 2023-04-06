package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started!" );
        //SessionFactory factory = new org.hibernate.cfg.Configuration()
        
        		org.hibernate.cfg.Configuration cfg = new org.hibernate.cfg.Configuration();
        		cfg.configure("hibernate.cfg.xml");
        		SessionFactory factory = cfg.buildSessionFactory();
        		//creating of object of Student
        		Student st = new Student();
        		st.setId(102);
        		st.setName("Rahul");
        		st.setCity("Silvassa");
        		
        		System.out.println(st);
        		
        		//creating object of Address
        		Address ad = new Address();
        		ad.setStreet("street1");
        		ad.setCity("Pune");
        		ad.setOpen(true);
        		ad.setAddDate(new Date());
        		ad.setX(111.222);
        		
        		//reading image
        		FileInputStream fis = new FileInputStream("src/main/java/img.png");
        		byte[] data = new byte[fis.available()];
        		fis.read(data);
        		ad.setImage(data);
        		
        		
        		Session session = factory.openSession();
        		//its first time thats why we are using openSession() but once we created the table ater that we have to use getCurrentSession()
        		
        		Transaction tx = session.beginTransaction();
        		
        		session.save(st);
        		session.save(ad);
        		
        		tx.commit();
        		
        		session.close();
        		System.out.println("DONE.....");
    }
}


/*
 * @Entity -use to make any class as entity
 * @Tabe - use to change the table details
 * @Id - use ti mark column as primary key
 * @GeneratedValue - hibernate will automatically generate values for that using an internal sequence Therefore we dont have to set it manually
 * @Column - can be used to specify column mapping for eg. to chnage the column name inthe associated table in database
 * @Transient - This tells hibernate not to save this field
 * @Temporal - over a date field tells hibernate the format in which the date to be saved
 * @Lob @OntToOne @OneToMany @ManyToOne @JoinColumn etc 
 */

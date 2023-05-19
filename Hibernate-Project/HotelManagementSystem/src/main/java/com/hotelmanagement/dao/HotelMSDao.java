package com.hotelmanagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hotelmanagement.model.HotelMS;
import com.hotelmanagement.util.HibernateUtill;

public class HotelMSDao {
    public void saveHotel(HotelMS hotel) {
        Transaction transaction = null;
        try (Session session = HibernateUtill.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.save(hotel);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public void updateHotel(HotelMS hotel) {
        Transaction transaction = null;
        try (Session session = HibernateUtill.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.update(hotel);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public HotelMS getHotelById(long id) {
        Transaction transaction = null;
        HotelMS hotel = null;
        try (Session session = HibernateUtill.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            hotel = session.get(HotelMS.class, id);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return hotel;
    }

    public static List<HotelMS> getAllHotels() {
        Transaction transaction = null;
        List<HotelMS> hotels = null;
        try (Session session = HibernateUtill.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            hotels = session.createQuery("from HotelMS", HotelMS.class).list();

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return hotels;
    }

    public void deleteHotel(HotelMS hotel) {
        Transaction transaction = null;
        try (Session session = HibernateUtill.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.delete(hotel);

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                try {
                    // Check if the connection is closed before rollback
                    if (!transaction.getRollbackOnly()) {
                        transaction.rollback();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }


	public void sethotelName(String string) {
		// TODO Auto-generated method stub
		
	}
}

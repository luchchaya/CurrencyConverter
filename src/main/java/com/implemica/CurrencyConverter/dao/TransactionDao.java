package com.implemica.CurrencyConverter.dao;

import com.implemica.CurrencyConverter.model.Transaction;

import java.util.Date;
import java.util.List;

/**
 * Class for write {@link Transaction} into a storage
 *
 * @see Transaction
 * @see Date
 * @see List
 *
 * @author Dmytro K.
 * @version 25.12.2018 18:00
 */
public interface TransactionDao {

   /**
    * Write into a storage
    *
    * @param transaction info
    */
   void write(Transaction transaction);

   /**
    * Gets all {@link Transaction}s from storage
    *
    * @return list
    */
   List<Transaction> getAll();

   /**
    * Gets desired {@link Transaction} by date
    *
    * @param date date
    * @return instance
    */
   Transaction getByDate(Date date);
}
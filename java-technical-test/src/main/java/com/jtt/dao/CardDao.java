package com.jtt.dao;

import java.util.List;

import com.jtt.exception.CardException;
import com.jtt.model.Card;



/**
 * This is java-technical-test DAO layer, which is used to interact with
 * database.
 * 
 * @author Rihan Sharma
 * @date 11-September-2021
 */
public interface CardDao {

	/**
	 * This method is used to save/update card-details.
	 * 
	 * @param Card
	 * @return Card
	 * @author Rihan Sharma
	 * @date 11-September-2021
	 */
	public Card addUpdateCard(Card card) throws CardException;

	/**
	 * This method is used to remove card-details.
	 * 
	 * @param Long
	 * @return boolean
	 * @author Rihan Sharma
	 * @date 11-September-2021
	 */
	public boolean deleteCard(Long id) throws CardException;

	/**
	 * This method is used to get specific card-details.
	 * 
	 * @param Long
	 * @return Card
	 * @author Rihan Sharma
	 * @date 11-September-2021
	 */
	public Card getCard(Long id) throws CardException;

	/**
	 * This method is used to get list of card-details.
	 * 
	 * @return List<Card>
	 * @author Rihan Sharma
	 * @date 11-September-2021
	 */
	public List<Card> getCardList() throws CardException;
}

package ptithcm.dao;
import java.util.List;

import ptithcm.model.Transactions;

public interface TransactionDao {
 
    /**
     *
     * @param transaction
     */
        void insert(Transactions transaction); 
	 
	void edit(Transactions admin); 
	
	void delete(String id); 
        
	Transactions get(int id); 
	 
	Transactions get(String name); 
 
	List<Transactions> getAll(); 
        
	
	
}

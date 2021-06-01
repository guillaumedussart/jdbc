package fr.digi.jdbc.dal;

import java.sql.SQLException;
import java.util.Set;

public interface IDAO<T, ID> {
	
	void create(T o) throws SQLException;
	T findById(ID id);
	Set<T> findAll() throws SQLException;
	void update(T o);
	void delete(T o);
	void deleteById(ID id);
}

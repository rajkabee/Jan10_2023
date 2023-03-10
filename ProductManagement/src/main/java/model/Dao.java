package model;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {
	public void connect() throws ClassNotFoundException, SQLException;
	public void disconnect() throws ClassNotFoundException, SQLException;
	public int save(T t) throws ClassNotFoundException, SQLException;
	public T getOne(int id) throws ClassNotFoundException, SQLException;
	public List<T> getAll() throws ClassNotFoundException, SQLException;
	public int update(T t) throws ClassNotFoundException, SQLException;
	public int delete(int id) throws ClassNotFoundException, SQLException;
	
}

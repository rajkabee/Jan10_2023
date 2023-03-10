package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentDao extends AbstractDao<Student> {
	
	PreparedStatement pstm;
	String query;
	@Override
	public int save(Student st) throws ClassNotFoundException, SQLException {
		connect();
		query = "insert into students (name, email, active) "
				+ "values (?, ?, ?)";
		pstm = con.prepareStatement(query);
		pstm.setString(1, st.getName());
		pstm.setString(2, st.getEmail());
		pstm.setBoolean(3, st.isActive());
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public Student getOne(int id) throws ClassNotFoundException, SQLException {
		connect();
		query = "select * from students where id=?";
		pstm = con.prepareStatement(query); 
		pstm.setInt(1, id);
		ResultSet rs = pstm.executeQuery();
		Student st = new Student();
		if(rs.next()) {
			st.setId(rs.getInt("id"));
			st.setName(rs.getString("name"));
			st.setEmail(rs.getString("email"));
			st.setActive(rs.getBoolean("active"));
		}
		disconnect();
		return st;
		
	}

	@Override
	public List<Student> getAll() throws ClassNotFoundException, SQLException {
		connect();
		query = "select * from students";
		pstm = con.prepareStatement(query); 
		ArrayList<Student> students = new ArrayList<>();
		ResultSet rs = pstm.executeQuery();
		Student st;
		while(rs.next()) {
			st = new Student();
			st.setId(rs.getInt("id"));
			st.setName(rs.getString("name"));
			st.setEmail(rs.getString("email"));
			st.setActive(rs.getBoolean("active"));
			students.add(st);		
		}
		disconnect();
		return students;
	}

	@Override
	public int update(Student st) throws ClassNotFoundException, SQLException {
		connect();
		query = "update students set name=?, email=?, active=? where id=?";
		pstm = con.prepareStatement(query);
		pstm.setString(1, st.getName());
		pstm.setString(2, st.getEmail());
		pstm.setBoolean(3, st.isActive());
		pstm.setInt(4, st.getId());
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		connect();
		query = "delete from students where id=?";
		pstm = con.prepareStatement(query);
		pstm.setInt(1, id);
		int i = pstm.executeUpdate();
		disconnect();
		return i;
	}

}

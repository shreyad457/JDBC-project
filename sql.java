import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class sql {

	public static void main(String args[]) throws SQLException
	{
		Scanner sc=new Scanner(System.in);
		Jdbc j=new Jdbc();
		j.connecting();
		String sql="create table student(roll int,name varchar(30));";
		try{
			Jdbc.stat.execute(sql);
		}
		catch(Exception e){
			System.out.print("can't create table");
		}
		for(int i=0;i<5;i++)
		{
		int roll=sc.nextInt();
		String name=sc.next();
		Visitor v=new Visitor(roll,name);
		sql="insert into student values"+v.display();
		Jdbc.stat.executeUpdate(sql);
		}
		sql="select* from student";
		ResultSet rs= Jdbc.stat.executeQuery(sql);
		ArrayList <Visitor> v1=new ArrayList<Visitor>();
		while(rs.next()){
			Visitor R=new Visitor(rs.getInt("roll"),rs.getString("name"));
			v1.add(R);
			}
		Collections.sort(v1,new Roll());
		System.out.println("Sorted list entries: ");
		for(Visitor e:v1){
		System.out.println(e.display());
		}

		sc.close();

		}


	
}

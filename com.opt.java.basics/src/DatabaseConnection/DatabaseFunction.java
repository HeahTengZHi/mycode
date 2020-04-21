package DatabaseConnection;

import java.util.Map;

public interface DatabaseFunction {

		Map<Integer,Employee> getAllData();
		Map<Integer,Employee> updateData();
		Map<Integer,Employee> deleteData();
		Map<Integer,Employee> addData();
	
}

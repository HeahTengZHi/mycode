package DatabaseConnection;

import java.util.Map;

public interface DatabaseFunction<Integer,T> {
		Map<Integer,T> getAllData();
		Map<Integer,T> updateData();
		Map<Integer,T> deleteData();
		Map<Integer,T> addData();
}

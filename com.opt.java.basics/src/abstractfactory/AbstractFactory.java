package abstractfactory;

//Controller
public interface AbstractFactory<T> {
	
	T create(String type);
}

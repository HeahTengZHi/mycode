package com.opt.java.basics15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class User{
	String name;
	
	User(String name){
		this.name=name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<User> refArrayList=new ArrayList<>();
		refArrayList.add(new User("John"));
		refArrayList.add(new User("John"));
		refArrayList.add(new User("John"));
		refArrayList.add(new User("Hello"));
		refArrayList.add(new User("Hello"));
		
		List<User>list=refArrayList.stream().distinct().collect(Collectors.toList());
		list.forEach(System.out::println);

	}

}

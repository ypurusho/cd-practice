package designpatterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ImmutableClass {
	private final Long id;
	private final String name;
	private final List<Integer> marks;
	private final Map<String, String> address;
	
	public ImmutableClass(Long id, String name, List<Integer> marks, Map<String, String> address) {
		this.id = id;
		this.name = name;
		this.marks = new ArrayList<>(marks);
		
		Map<String, String> tempAddress = new HashMap<>();
		for(Map.Entry<String, String> map : address.entrySet()) {
			tempAddress.put(map.getKey(), map.getValue());
		}
		this.address = tempAddress;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Integer> getMarks(){
		return new ArrayList<>(this.marks);
	}
	
	public Map<String, String> getAddress(){
		Map<String, String> address = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : this.address.entrySet()) {
			address.put(entry.getKey(), entry.getValue());
		}
		return address;
	}

	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address +"]";
	}
	
}


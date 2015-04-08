package entities;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private String id;
	private String first;
	private String last;
	private String email;
	private String gender;
	private String password;
	private String age;
	private String type;
	private String pic;
	private List<entities.Conference> conferences;
	
	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<entities.Conference> getConferences() {
		return conferences;
	}

	public void setConferences(List<entities.Conference> conferences) {
		this.conferences = conferences;
	}
	
	
}

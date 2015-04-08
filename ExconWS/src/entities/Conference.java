package entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Conference {
	private String id;
	private String id_manager;
	private String name;
	private String category;
	private String general_details;
	private String address;
	private String imageLink;
	
	public String getId_manager() {
		return id_manager;
	}
	public void setId_manager(String id_manager) {
		this.id_manager = id_manager;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGeneral_details() {
		return general_details;
	}
	public void setGeneral_details(String general_details) {
		this.general_details = general_details;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
}

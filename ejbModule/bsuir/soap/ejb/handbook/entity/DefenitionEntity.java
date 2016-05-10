
package bsuir.soap.ejb.handbook.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "handbookjs")
public class DefenitionEntity implements Serializable {
	private int id;
	private String nameDefenition;
	private String bodyDefenition;

	public DefenitionEntity() {

	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNameDefenition(String nameDefenition) {
		this.nameDefenition = nameDefenition;
	}

	public void setBodyDefenition(String bodyDefenition) {
		this.bodyDefenition = bodyDefenition;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int getId() {
		return id;
	}

	@Column(name = "name_definition")
	public String getNameDefenition() {
		return nameDefenition;
	}

	@Column(name = "base_definition")
	public String getBodyDefenition() {
		return bodyDefenition;
	}

}

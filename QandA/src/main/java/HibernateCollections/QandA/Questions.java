/**
 * 
 */
package HibernateCollections.QandA;

import java.util.ArrayList;

import javax.persistence.CascadeType;
//import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
//import javax.persistence.OrderBy;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

//import antlr.collections.List;

/**
 * @author manu
 *
 */
@Entity
@Table(name="Questions")
public class Questions {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
    @Column
	private String qname;
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="qid")  
	@OrderColumn(name="type")  
	private ArrayList<Answers> answers;
	/**
	 * @return the qid
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param qid the qid to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the qname
	 */
	public String getQname() {
		return qname;
	}
	/**
	 * @param string the qname to set
	 */
	public void setQname(String qname) {
		this.qname = qname;
	}
	/**
	 * @return the answers
	 */
	public ArrayList<Answers> getAnswers() {
		return answers;
	}
	/**
	 * @param answers the answers to set
	 */
	public void setAnswers(ArrayList<Answers> answers) {
		this.answers = answers;
	}
	

}

/**
 * 
 */
package HibernateCollections.QandA;

import javax.persistence.CascadeType;
import javax.persistence.Column;
//import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author manu
 *
 */
@Entity
@Table(name="Answers")
public class Answers {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int qid;
	@Column
	private String answername;
	@Column
	private String postedby;
//	@ManyToOne(cascade=CascadeType.ALL)
//	private Questions questions;
	/**
	 * @return the qid
	 */
	public int getQid() {
		return qid;
	}
	/**
	 * @param qid the qid to set
	 */
	public void setQid(int qid) {
		this.qid = qid;
	}
	/**
	 * @return the answername
	 */
	public String getAnswername() {
		return answername;
	}
	/**
	 * @param answername the answername to set
	 */
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	/**
	 * @return the postedby
	 */
	public String getPostedby() {
		return postedby;
	}
	/**
	 * @param postedby the postedby to set
	 */
	public void setPostedby(String postedby) {
		this.postedby = postedby;
	}

}

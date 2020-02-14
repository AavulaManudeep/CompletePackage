/**
 * 
 */
package com.collections.course;

/**
 * @author manu
 *
 */
public class CourseInfo {
	private int course_id;
	private String majorabbr;
	private String subject;
	/**
	 * @param course_id
	 * @param majorabbr
	 * @param subject
	 */
	public CourseInfo(int course_id, String majorabbr, String subject) {
		super();
		this.course_id = course_id;
		this.majorabbr = majorabbr;
		this.subject = subject;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CourseInfo [course_id=" + course_id + ", majorabbr=" + majorabbr + ", subject=" + subject + "]";
	}
	/**
	 * @return the course_id
	 */
	public int getCourse_id() {
		return course_id;
	}
	/**
	 * @param course_id the course_id to set
	 */
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	/**
	 * @return the majorabbr
	 */
	public String getMajorabbr() {
		return majorabbr;
	}
	/**
	 * @param majorabbr the majorabbr to set
	 */
	public void setMajorabbr(String majorabbr) {
		this.majorabbr = majorabbr;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

}

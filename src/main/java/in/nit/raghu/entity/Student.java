package in.nit.raghu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "student_dtls")
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "student_id")
	private Integer studentId;
	@Column(name = "student_name")
	private String studentName;
	@Column(name = "student_course")
	private String studentCourse;
	@Column(name = "student_fee")
	private Double studentFee;

}

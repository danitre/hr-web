package it.objectway.hibernate.hr.model;

// Generated Jan 27, 2015 5:26:07 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Jobs generated by hbm2java
 */
public class Jobs implements java.io.Serializable {

	private String jobId;
	private String jobTitle;
	private Integer minSalary;
	private Integer maxSalary;
	private Set<Employees> employeeses = new HashSet<Employees>(0);
	private Set<JobHistory> jobHistories = new HashSet<JobHistory>(0);

	public Jobs() {
	}

	public Jobs(String jobId, String jobTitle) {
		this.jobId = jobId;
		this.jobTitle = jobTitle;
	}

	public Jobs(String jobId, String jobTitle, Integer minSalary,
			Integer maxSalary, Set<Employees> employeeses,
			Set<JobHistory> jobHistories) {
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.employeeses = employeeses;
		this.jobHistories = jobHistories;
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getMinSalary() {
		return this.minSalary;
	}

	public void setMinSalary(Integer minSalary) {
		this.minSalary = minSalary;
	}

	public Integer getMaxSalary() {
		return this.maxSalary;
	}

	public void setMaxSalary(Integer maxSalary) {
		this.maxSalary = maxSalary;
	}

	public Set<Employees> getEmployeeses() {
		return this.employeeses;
	}

	public void setEmployeeses(Set<Employees> employeeses) {
		this.employeeses = employeeses;
	}

	public Set<JobHistory> getJobHistories() {
		return this.jobHistories;
	}

	public void setJobHistories(Set<JobHistory> jobHistories) {
		this.jobHistories = jobHistories;
	}

}

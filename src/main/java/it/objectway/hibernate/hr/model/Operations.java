package it.objectway.hibernate.hr.model;

// Generated Jan 27, 2015 5:26:07 PM by Hibernate Tools 3.4.0.CR1

import java.io.Serializable;

/**
 * Operations generated by hbm2java
 */
public class Operations implements java.io.Serializable {

	private long idOperation;
	private double opA;
	private double opB;
	private String operation;
	private double result;
	private Serializable data;
	private String username;

	public Operations() {
	}

	public Operations(long idOperation, double opA, double opB, double result,
			Serializable data, String username) {
		this.idOperation = idOperation;
		this.opA = opA;
		this.opB = opB;
		this.result = result;
		this.data = data;
		this.username = username;
	}

	public Operations(long idOperation, double opA, double opB,
			String operation, double result, Serializable data, String username) {
		this.idOperation = idOperation;
		this.opA = opA;
		this.opB = opB;
		this.operation = operation;
		this.result = result;
		this.data = data;
		this.username = username;
	}

	public long getIdOperation() {
		return this.idOperation;
	}

	public void setIdOperation(long idOperation) {
		this.idOperation = idOperation;
	}

	public double getOpA() {
		return this.opA;
	}

	public void setOpA(double opA) {
		this.opA = opA;
	}

	public double getOpB() {
		return this.opB;
	}

	public void setOpB(double opB) {
		this.opB = opB;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResult() {
		return this.result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public Serializable getData() {
		return this.data;
	}

	public void setData(Serializable data) {
		this.data = data;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}

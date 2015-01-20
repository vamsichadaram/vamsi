package com.srusti.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="email_model")
public class EmailModel 
{
	@Id
	@GeneratedValue
	private int id;
	@Column
	@ElementCollection(targetClass=String.class)
	private List<String> toAddress;
	@Column
	private String fromAddress;
	@Column
	@ElementCollection(targetClass=String.class)
	private List<String> bcc;
	@Column
	@ElementCollection(targetClass=String.class)
	private List<String> cc;
	@Column
	private String subject;
	@Column
	private String message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getToAddress() {
		return toAddress;
	}
	public void setToAddress(List<String> toAddress) {
		this.toAddress = toAddress;
	}
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public List<String> getBcc() {
		return bcc;
	}
	public void setBcc(List<String> bcc) {
		this.bcc = bcc;
	}
	public List<String> getCc() {
		return cc;
	}
	public void setCc(List<String> cc) {
		this.cc = cc;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "EmailModel [id=" + id + ", toAddress=" + toAddress
				+ ", fromAddress=" + fromAddress + ", bcc=" + bcc + ", cc="
				+ cc + ", subject=" + subject + ", message=" + message + "]";
	}
}

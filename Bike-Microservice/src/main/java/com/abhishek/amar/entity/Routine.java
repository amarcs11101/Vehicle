/**
 * 
 */
package com.abhishek.amar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Abhishek Amar
 *
 */
@Entity
@Table(name = "weekly_routine")
public class Routine {
	@Id
	@GeneratedValue
	private Integer id;
	@Column(name = "work")
	private Integer work;
	@Column(name = "eat")
	private Integer eat;
	@Column(name = "tv")
	private Integer tv;
	@Column(name = "gym")
	private Integer gym;
	@Column(name = "sleep")
	private Integer sleep;
	@Column(name = "appName")
	private String appName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getWork() {
		return work;
	}

	public void setWork(Integer work) {
		this.work = work;
	}

	public Integer getEat() {
		return eat;
	}

	public void setEat(Integer eat) {
		this.eat = eat;
	}

	public Integer getTv() {
		return tv;
	}

	public void setTv(Integer tv) {
		this.tv = tv;
	}

	public Integer getGym() {
		return gym;
	}

	public void setGym(Integer gym) {
		this.gym = gym;
	}

	public Integer getSleep() {
		return sleep;
	}

	public void setSleep(Integer sleep) {
		this.sleep = sleep;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

}

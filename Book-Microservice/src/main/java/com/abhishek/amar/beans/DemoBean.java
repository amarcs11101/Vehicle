/**
 * 
 */
package com.abhishek.amar.beans;

import java.io.Serializable;

/**
 * @author Abhishek Amar
 *
 */
public class DemoBean implements Serializable {
	private Integer work;
	private Integer eat;
	private Integer tv;
	private Integer gym;
	private Integer sleep;
	private String appName;

	public DemoBean(Integer work, Integer eat, Integer tv, Integer gym, Integer sleep, String appName) {
		super();
		this.work = work;
		this.eat = eat;
		this.tv = tv;
		this.gym = gym;
		this.sleep = sleep;
		this.appName = appName;
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

	@Override
	public String toString() {
		return "DemoBean [work=" + work + ", eat=" + eat + ", tv=" + tv + ", gym=" + gym + ", sleep=" + sleep
				+ ", appName=" + appName + "]";
	}
	

}

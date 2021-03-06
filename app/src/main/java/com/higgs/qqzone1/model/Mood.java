package com.higgs.qqzone1.model;

import java.util.Date;

public class Mood {
	private int id;
	private String MoodContext;
	private int userId;
	private String fid;
	private Date postTime;
	private String userName;

	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            要设置的 userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMoodContext() {
		return MoodContext;
	}
	public void setMoodContext(String moodContext) {
		MoodContext = moodContext;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
}

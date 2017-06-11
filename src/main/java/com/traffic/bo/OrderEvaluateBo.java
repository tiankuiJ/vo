package com.traffic.bo;

public class OrderEvaluateBo {
	
	private String trailerName;
	
	private int sNum;
	
	private int uNum;
	
	private Double star;
	
	private int good;
	
	private int commonly;
	
	private int bad;

	public String getTrailerName() {
		return trailerName;
	}

	public void setTrailerName(String trailerName) {
		this.trailerName = trailerName;
	}

	public int getsNum() {
		return sNum;
	}

	public void setsNum(int sNum) {
		this.sNum = sNum;
	}

	public int getuNum() {
		return uNum;
	}

	public void setuNum(int uNum) {
		this.uNum = uNum;
	}

	public Double getStar() {
		return star;
	}

	public void setStar(Double star) {
		this.star = star;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public int getCommonly() {
		return commonly;
	}

	public void setCommonly(int commonly) {
		this.commonly = commonly;
	}

	public int getBad() {
		return bad;
	}

	public void setBad(int bad) {
		this.bad = bad;
	}

	@Override
	public String toString() {
		return "OrderEvaluateBo [trailerName=" + trailerName + ", sNum=" + sNum + ", uNum=" + uNum + ", star=" + star
				+ ", good=" + good + ", commonly=" + commonly + ", bad=" + bad + "]";
	}
	
	
	
}

package com.traffic.bo;

import java.util.List;

import com.traffic.vo.IllegalData;
import com.traffic.vo.IllegalReport;

public class IllegalReportBo extends IllegalReport{
	
	
	private String tpName;
	private String userName;
	
	
	private List<IllegalData> imgs;
	
	private List<IllegalData> videos;
	
	private List<IllegalData> sounds;

	public List<IllegalData> getImgs() {
		return imgs;
	}

	public void setImgs(List<IllegalData> imgs) {
		this.imgs = imgs;
	}

	public List<IllegalData> getVideos() {
		return videos;
	}

	public void setVideos(List<IllegalData> videos) {
		this.videos = videos;
	}

	public List<IllegalData> getSounds() {
		return sounds;
	}

	public void setSounds(List<IllegalData> sounds) {
		this.sounds = sounds;
	}


	public String getTpName() {
		return tpName;
	}

	public void setTpName(String tpName) {
		this.tpName = tpName;
	}

	
	
}

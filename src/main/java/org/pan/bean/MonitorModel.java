package org.pan.bean;

import lombok.Data;

@Data
public class MonitorModel extends JfaceModel {
	
	private String name;
	private String cameraIp;
	private String cameraType;
	private String screenIp;
	private String screenType;
	private String type;
	
	public void setName(String name) {
		changeSupport.firePropertyChange("name", this.name,  this.name = name);
	}
	public void setCameraIp(String cameraIp) {
		changeSupport.firePropertyChange("cameraIp", this.cameraIp,  this.cameraIp = cameraIp);
	}
	public void setCameraType(String cameraType) {
		changeSupport.firePropertyChange("cameraType", this.cameraType,  this.cameraType = cameraType);
	}
	public void setScreenIp(String screenIp) {
		changeSupport.firePropertyChange("screenIp", this.screenIp,  this.screenIp = screenIp);
	}
	public void setScreenType(String screenType) {
		changeSupport.firePropertyChange("screenType", this.screenType,  this.screenType = screenType);
	}
	public void setType(String type) {
		changeSupport.firePropertyChange("type", this.type,  this.type = type);
	}
	
}

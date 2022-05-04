package routeplanner;

public class RoutePojo {

	String fromcity;
	String tocity;
	int travelledkms;
	String time;
	String ruppess;
	public String getFromcity() {
		return fromcity;
	}
	public void setFromcity(String fromcity) {
		this.fromcity = fromcity;
	}
	public String getTocity() {
		return tocity;
	}
	public void setTocity(String tocity) {
		this.tocity = tocity;
	}
	public int getTravelledkms() {
		return travelledkms;
	}
	public void setTravelledkms(int travelledkms) {
		this.travelledkms = travelledkms;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getRuppess() {
		return ruppess;
	}
	public void setRuppess(String ruppess) {
		this.ruppess = ruppess;
	}
	public RoutePojo(String fromcity, String tocity, int travelledkms, String time, String ruppess) {
		super();
		this.fromcity = fromcity;
		this.tocity = tocity;
		this.travelledkms = travelledkms;
		this.time = time;
		this.ruppess = ruppess;
	}
	@Override
	public String toString() {
		return "RoutePojo [fromcity=" + fromcity + ", tocity=" + tocity + ", travelledkms=" + travelledkms + ", time="
				+ time + ", ruppess=" + ruppess + "]";
	}


	
	
	
	
}

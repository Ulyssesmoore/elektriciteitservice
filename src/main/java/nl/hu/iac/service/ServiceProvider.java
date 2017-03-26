package nl.hu.iac.service;


public class ServiceProvider {
	private static ElektriciteitServiceImpl trackService = new ElektriciteitServiceImpl();
	public static ElektriciteitServiceImpl getTrackService() {
		return trackService;
	}
}
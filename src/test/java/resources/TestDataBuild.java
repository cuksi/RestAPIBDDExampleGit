package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	
	
	public AddPlace addPlacePayLoad(String name, String language, String address) {
		
		AddPlace p = new AddPlace();
		
		p.setAccuracy(50);
		p.setAddress(address);		
		p.setLanguage(language);		
		p.setPhone_number("(+91) 983 893 3937");
		p.setWebsite("http://google.com");
		p.setName(name);		
		
		List<String> myList = new ArrayList<>();
		
		myList.add("shoe park");
		myList.add("shop");
		p.setTypes(myList);
		
		Location loc = new Location();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		p.setLocation(loc);
		
		return p;
		
	}
	
	public String deletePlacePayload(String placeId) {
		
		return "{\r\n\"place_id\": \"" + placeId + "\"\r\n}";
		
	}

}

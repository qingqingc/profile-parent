package profile.berry.web;

import com.berry.commonEntity;
import com.profile.service.ProfileService;

public class SimpleProfile {

	public static void main(String[] args) {
		ProfileService s = new ProfileService();
		commonEntity entity = s.doService();
		System.out.println(entity.toString());
		System.out.println("项目clone下来只需要调整jdk版本就可以跑了。");
	}

}

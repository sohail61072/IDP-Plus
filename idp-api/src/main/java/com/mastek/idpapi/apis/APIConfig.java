package com.mastek.idpapi.apis;

import com.mastek.idpapi.lookup.LookupService;
import com.mastek.idpapi.source.SourceService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/idp/")
public class APIConfig extends ResourceConfig {
	
	public APIConfig() {
		register(CORSFilter.class);
		register(SourceService.class);
		register(LookupService.class);
	}

}

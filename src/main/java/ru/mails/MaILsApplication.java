package ru.mails;

import com.google.appengine.api.appidentity.AppIdentityService;
import com.google.appengine.api.appidentity.AppIdentityServiceFactory;
import com.google.auth.Credentials;
import com.google.auth.appengine.AppEngineCredentials;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaILsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaILsApplication.class, args);

        AppIdentityService appIdentityService = AppIdentityServiceFactory.getAppIdentityService();

        Credentials credentials =
                AppEngineCredentials.newBuilder()
                                    .setScopes(...)
        .setAppIdentityService(appIdentityService)
                .build();
    }

}

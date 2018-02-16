package me.dmkube.couchbase;

import org.aerogear.mobile.core.MobileCore;
import org.aerogear.mobile.core.ServiceModule;
import org.aerogear.mobile.core.configuration.ServiceConfiguration;

/**
 * Created by dmartin on 16/02/18.
 */

public class CouchbaseLiteConfig implements ServiceModule {
    private String databaseName;
    private String serverDBUrl;

    @Override
    public String type() {
        return "couchbase";
    }

    @Override
    public void configure(MobileCore core, ServiceConfiguration serviceConfiguration) {
        databaseName = serviceConfiguration.getProperty("database-name");
        serverDBUrl = String.format("%s/%s", serviceConfiguration.getUrl(), databaseName);
    }

    @Override
    public void destroy() {

    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getServerDBUrl() {
        return serverDBUrl;
    }
}

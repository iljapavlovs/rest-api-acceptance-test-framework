package lv.neotech.tests.guice;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Mutable;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:config/base.properties"})
public interface EnvironmentConfig extends Mutable {

    @Key("book-service.baseUrl")
    String bookServiceBaseUrl();

    @Key("order-service.baseUrl")
    String orderServiceBaseUrl();

    @Key("schoolkid-service.baseUrl")
    String schoolkidServiceBaseUrl();

}

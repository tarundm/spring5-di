package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.example.FakeDataSource;
import guru.springframework.sfgdi.example.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
// @PropertySource("classpath:datasource.properties")
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jmsbroker.properties")
})
public class PropertyConfig {

    @Value("${tdm.username}")
    String userName;

    @Value("${tdm.jms.username}")
    String jmsUserName;

    @Value("${tdm.password}")
    String password;

    @Value("${tdm.url}")
    String dburl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(userName);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDbUrl(dburl);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUserName);
        return fakeJmsBroker;
    }



    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }


}

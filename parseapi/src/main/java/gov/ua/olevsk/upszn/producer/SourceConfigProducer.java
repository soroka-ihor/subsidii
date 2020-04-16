package gov.ua.olevsk.upszn.producer;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.ws.rs.Produces;
import java.io.*;
import java.util.Properties;

public class SourceConfigProducer {
    private Properties properties;

    @SourceConfig
    @Produces
    public String produceString(final InjectionPoint ip) {
        return this.properties.getProperty(getKey(ip));
    }

    @SourceConfig
    @Produces
    public int produceInt(final InjectionPoint ip) {
        return Integer.valueOf(this.properties.getProperty(getKey(ip)));
    }

    @SourceConfig
    @Produces
    public boolean produceBoolean(final InjectionPoint ip) {
        return Boolean.valueOf(this.properties.getProperty(getKey(ip)));
    }

    private String getKey(final InjectionPoint ip) {

        return (ip.getAnnotated().isAnnotationPresent(SourceConfig.class) && !ip.getAnnotated().getAnnotation(SourceConfig.class).value().isEmpty())
                ? ip.getAnnotated().getAnnotation(SourceConfig.class).value() : ip.getMember().getName();
    }

    @PostConstruct
    public void init() {
        this.properties = new Properties();
        InputStream stream = null;

        try {
            stream = new FileInputStream(new File("d:/conf.properties"));
            this.properties.load(stream);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}

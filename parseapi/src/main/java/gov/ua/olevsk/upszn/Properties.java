package gov.ua.olevsk.upszn;

import gov.ua.olevsk.upszn.producer.SourceConfig;

import javax.inject.Inject;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Properties {
    @Inject
    @SourceConfig("request.folder")
    private String configurationPath;

    private String getConfigurationPath() {
        return this.configurationPath;
    }
    public static void main(String[] args) {
        Properties p = new Properties();
        System.out.println(p.configurationPath);
    }
}

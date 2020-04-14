package gov.ua.olevsk.upszn.request;

import java.io.File;


public abstract class AbstractRequest {
    private File request;
    private RequestType type;

    public AbstractRequest(File request, RequestType type) {
        this.request = request;
        this.type = type;
    }
}

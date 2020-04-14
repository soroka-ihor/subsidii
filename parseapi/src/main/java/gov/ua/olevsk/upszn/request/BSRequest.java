package gov.ua.olevsk.upszn.request;

import java.io.File;

public class BSRequest extends AbstractRequest {
    File request;
    RequestType type;

    public BSRequest(File request, RequestType type) {
        super(request, type);
    }

    public File getRequest() {
        return this.request;
    }

    public RequestType getType() {
        return this.type;
    }
}

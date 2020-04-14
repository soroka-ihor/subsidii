package gov.ua.olevsk.upszn.request;

import gov.ua.olevsk.upszn.util.FolderWithRequestsService;

import java.io.File;
import java.util.List;

public class RequestFactory {
    private List<File> files = FolderWithRequestsService.extractRequestFromTheFolder();

    public void printRequests() {
        if (files.size() > 0) {

        }
    }


    public static void main(String[] args) {
        RequestFactory requestFactory = new RequestFactory();
        requestFactory.printRequests();
    }
}

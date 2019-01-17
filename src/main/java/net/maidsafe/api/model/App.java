package net.maidsafe.api.model;

public class App {
    private final String id;
    private final String name;
    private final String vendor;
    private final String version;

    public App(String id, String name, String vendor, String version) {
        this.id = id;
        this.name = name;
        this.vendor = vendor;
        this.version = version;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getVendor() {
        return this.vendor;
    }

    public String getVersion() {
        return this.version;
    }
}
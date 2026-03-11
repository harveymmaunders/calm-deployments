package calm.deployments.models;

public enum DecoratorType {
    GUIDE("guide"),
    BUSINESS("business"),
    THREAT_MODEL("threat-model"),
    SECURITY("security"),
    DEPLOYMENT("deployment");

    private final String value;

    DecoratorType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

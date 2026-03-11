package calm.deployments.models;

public enum DeploymentStatus {

    PENDING("pending"),
    IN_PROGRESS("in-progress"),
    FAILED("failed"),
    COMPLETED("completed"),
    ROLLED_BACK("rolled-back");

    private final String value;

    DeploymentStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

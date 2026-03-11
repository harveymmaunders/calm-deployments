package calm.deployments.decorator_data;

import calm.deployments.models.DeploymentStatus;

public abstract class DeploymentData implements DecoratorData {
    private final String architecture_link;
    private final String deployment_timestamp;
    private DeploymentStatus deploymentStatus;

    public DeploymentData(String architecture_link, String deployment_timestamp, DeploymentStatus deploymentStatus) {
        this.architecture_link = architecture_link;
        this.deployment_timestamp = deployment_timestamp;
        this.deploymentStatus = deploymentStatus
        ;
    }
}

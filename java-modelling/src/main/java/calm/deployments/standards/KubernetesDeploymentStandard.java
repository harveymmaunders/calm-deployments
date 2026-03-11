package calm.deployments.standards;

import calm.deployments.decorator_data.DeploymentData;
import calm.deployments.models.DeploymentStatus;

public class KubernetesDeploymentStandard extends DeploymentData {
    public final String namespace;
    public final String replicas;
    public final String helmChartVersion;

    public KubernetesDeploymentStandard(String architecture_link, String deployment_timestamp, DeploymentStatus deploymentStatus,
                                        String namespace, String replicas, String helmChartVersion) {
        super(architecture_link, deployment_timestamp, deploymentStatus);
        this.namespace = namespace;
        this.replicas = replicas;
        this.helmChartVersion = helmChartVersion;
    }
}

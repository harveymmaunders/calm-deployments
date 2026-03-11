package calm.deployments;

import calm.deployments.decorator_data.DeploymentData;
import calm.deployments.models.DeploymentStatus;
import calm.deployments.schemas.DecoratorBaseSchema;
import calm.deployments.schemas.DeploymentSchema;
import calm.deployments.standards.KubernetesDeploymentStandard;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public void createKubernetesDeployment() {
        String[] nodes = {
                "my-service",
                "my-db"
        };

        String[] relationships = {
                ""
        };

        String[] controls = {
                ""
        };


        DeploymentData kubernetesDeploymentData = new KubernetesDeploymentStandard(
                "https://calmhub/myarchitecture/1.0.2",
                "2026-01-29-16-02-34",
                DeploymentStatus.IN_PROGRESS,
                "my-kubernetes-namespace",
                "3",
                "my-helm-chart-23.32.1"
        );

        DecoratorBaseSchema deployment = new DeploymentSchema(
                "my-kubernetes-deployment-unique-id",
                nodes,
                relationships,
                controls,
                kubernetesDeploymentData
        );
    }
}
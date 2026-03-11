package calm.deployments.schemas;

import calm.deployments.decorator_data.DeploymentData;
import calm.deployments.models.DecoratorType;

public class DeploymentSchema extends DecoratorBaseSchema {

    public DeploymentSchema(String unique_id, String[] nodes, String[] relationships,
                            String[] controls, DeploymentData data) {
        super(unique_id, DecoratorType.DEPLOYMENT, nodes, relationships, controls, data);
    }
}

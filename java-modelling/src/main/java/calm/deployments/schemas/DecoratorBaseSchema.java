package calm.deployments.schemas;

import calm.deployments.decorator_data.DecoratorData;
import calm.deployments.models.DecoratorType;

abstract public class DecoratorBaseSchema {
    private final String unique_id;
    private final DecoratorType type;
    private final String[] nodes;
    private final String[] relationships;
    private final String[] controls;
    private final DecoratorData data;

    public DecoratorBaseSchema(String unique_id, DecoratorType type, String[] nodes, String[] relationships, String[] controls, DecoratorData data) {
        this.unique_id = unique_id;
        this.type = type;
        this.nodes = nodes;
        this.relationships = relationships;
        this.controls = controls;
        this.data = data;
    }
}

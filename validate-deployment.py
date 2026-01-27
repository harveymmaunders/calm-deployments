import json
import jsonschema
from jsonschema import Draft202012Validator

decorator_schema = json.load(open('decorators/decorator-schema.json'))
deployment_schema = json.load(open('decorators/deployment-schema.json'))
data = json.load(open('decorators/ui-deployment.json'))

# Step 1: Validate the decorator schema itself
print("Step 1: Validating decorator schema against JSON Schema specification...")
try:
    Draft202012Validator.check_schema(decorator_schema)
    print("✓ Schema is a valid JSON Schema (Draft 2020-12)!")
except jsonschema.SchemaError as e:
    print(f"✗ Schema error: {e.message}")
    exit(1)

# Step 2: Validate the deployment schema
print("\nStep 2: Validating deployment schema against JSON Schema specification...")
try:
    Draft202012Validator.check_schema(deployment_schema)
    print("✓ Schema is a valid JSON Schema (Draft 2020-12)!")
except jsonschema.SchemaError as e:
    print(f"✗ Schema error: {e.message}")
    exit(1)

# Step 3: Validate the data against the deployment schema
print("\nStep 3: Validating data against deployment schema...")
try:
    jsonschema.validate(data, deployment_schema)
    print("✓ Data validation successful!")
except jsonschema.ValidationError as e:
    print(f"✗ Validation failed: {e.message}")
    print(f"  Path: {list(e.path)}")
    exit(1)

print("\n✓ All validations passed!")
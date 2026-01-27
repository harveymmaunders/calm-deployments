# calm-deployments
Simple repo for looking at CALM deployments.

## CALM

Install CALM
```shell
npm install -g @finos/calm-cli
pnpm install -g @finos/calm-cli
```

Verify CALM version
```shell
calm --version
```

Use CALM chatmode
```shell
calm init-ai --provider copilot
```

## Validate patterns

Validate company policies with standards

```shell
calm validate -p patterns/company-base-pattern.json -u url-mapping.json
```

Validate google three tier pattern

```shell
calm validate -p patterns/google-three-tier-pattern.json
```

## Create architecture

Create architecture from the google three tier pattern.

```shell
calm generate -p patterns/google-three-tier-pattern.json -o architectures/my-test-architecture.json
```

## Validation

Validate against company standards pattern
```shell
calm validate -p patterns/company-base-pattern.json -a architectures/my-test-architecture.json -u url-mapping.json
```

Validate against google-three-tier pattern
```shell
calm validate -p patterns/google-three-tier-pattern.json -a architectures/my-test-architecture.json
```

## Custom validations

Set up python environment
```shell
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
```

Run validation on deployment

```shell
python validate-deployment.py
```

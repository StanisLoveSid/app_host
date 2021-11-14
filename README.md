[![Artifact Hub](https://img.shields.io/endpoint?url=https://artifacthub.io/badge/repository/chart-oracle-host-app)](https://artifacthub.io/packages/search?repo=chart-oracle-host-app)

## Description

Simple containerized java application using spring framework. Orchestrated by kubernetes. Can be deployed via helm.

### Dependencies

##### Kubernetes

Client Version: v1.22.3 \
Server Version: v1.22.3

##### Docker

v20.10.8

##### Helm

v3.7.1+g1d11fcb

## Usage

### Add repository

```
helm repo add your-release-name https://stanislovesid.github.io/app_host/charts
```
```
helm repo update
```

### Install packages

```
helm install your-release-name/Chart-Oracle-Host-App
```

### Run the minikube tunnel

```
minikube tunnel
```

### Access

Application can be available by default port(80) at http://127.0.0.1/app_host
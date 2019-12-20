oc apply -f deployment.yaml
oc expose deployment.apps/springboot-hello-deploy
oc expose service/springboot-hello-deploy
oc autoscale deploy/springboot-hello-deploy --min 1 --max 5 --cpu-percent=80
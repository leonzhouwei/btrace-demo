#!/bin/bash

################################################################################
# variables definitions
BasePath=$(cd `dirname $0`; pwd)
BTraceCmd=btrace
TargetClassName="AdminControllerBootstrap"
BTraceClassName="AdminControllerBTrace"

################################################################################
cd ${BasePath}
echo "now in ${BasePath}"
echo "target class name: ${TargetClassName}"
echo "btrace class name: ${BTraceClassName}"

################################################################################
# run btrace
pid=$(jps | grep ${TargetClassName} | awk '{print $1}')
echo "target process id is ${pid}"

${BTraceCmd} ${pid} ${BTraceClassName}.java

################################################################################
exit 0

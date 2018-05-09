#!/bin/sh
/usr/sbin/groupadd -f -r microservice 2> /dev/null || :
/usr/sbin/useradd -r -m -c "microservice user" microservice -g microservice 2> /dev/null || :
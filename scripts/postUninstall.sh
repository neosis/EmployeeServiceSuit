#!/bin/sh
/usr/sbin/userdel microservice 2> /dev/null || :
/usr/sbin/groupdel microservice 2> /dev/null || :
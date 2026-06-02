#!/bin/bash

PROCESS_NAME="nginx"

if pgrep -x "$PROCESS_NAME" > /dev/null
then
	echo "[$(date)] SUCCESS: $PROCESS_NAME is running"
else
	echo "[$(date)] ALERT: $PROCESS_NAME is Not running!"
fi

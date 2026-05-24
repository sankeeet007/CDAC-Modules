#!/bin/bash

FILE="/home/ac_163_184/Batch2/Assignment02/1.txt"

if [ -f "$FILE" ]; then
	echo "File Exists"
else 
	echo "File Not Exists"
fi

#!/bin/bash

SOURCE_DIR="/home/ac_163_184/Batch2/Assignment02"
DEST_DIR="/home/ac_163_184/Batch2/Backup/"

if [ -d "$SOURCE_DIR" ]; then

#	mkdir -p "$DEST_DIR"

	cp "$SOURCE_DIR"/* "$DEST_DIR"

	echo "Files copy from $SOURCE_DIR to $DEST_DIR"

else
	echo "Source directory does not exist"
fi

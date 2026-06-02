#!/bin/bash

USERNAME="$(whoami)"

HOSTNAME="$(hostname)"

DATE="$(date)"

CURR_DIR="$(pwd)"


FILE="/home/ac_163_184/Batch2/Assignment02/sys_report.txt"

echo "$USERNAME" >> "$FILE"
echo "$HOSTNAME" >> "$FILE"
echo "$DATE" >> "$FILE"
echo "$CURR_DIR" >> "$FILE"



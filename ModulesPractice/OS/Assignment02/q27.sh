#!/bin/bash

read -p "Enter text to append:  " text
FILE="1.txt"

echo "$text" >> "$FILE"

echo "Text appended successfully $FILE"

echo "$(cat 1.txt)"

#!/bin/bash

read -p "Enter number1:" num1
read -p "Enter number2:" num2

echo "Before swapping Num1=$num1, Num2=$num2"

temp=$num1
num1=$num2
num2=$temp

echo "After swapping: Number1=$num1, Number2=$num2"

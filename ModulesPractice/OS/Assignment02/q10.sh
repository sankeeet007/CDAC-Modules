#!/bin/bash

read -p "Enter number1:" num1
read -p "Enter number2:" num2

sub=$((num1-num2))

mul=$((num1*num2))

div=$((num1/num2))

echo "Subtraction=$sub"

echo "Multiplication=$mul"

echo "Division=$div"

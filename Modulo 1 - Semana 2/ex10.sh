#!/bin/bash

read -p "Enter value of i: " i

if [ $i -lt 16 ]
then
    echo "Voce ainda nao pode votar" 

elif [ $i -ge 16 ] && [ $i -le 18 ]
then
        echo "Voce ira votar pela primeira vez, vote com consciencia."

elif [ $i -gt 18 ] && [ $i -le 70 ]
then
        echo "Voce eh obrigado a votar"

else
        echo "Voce pode votar, mas nao eh obrigado"


fi


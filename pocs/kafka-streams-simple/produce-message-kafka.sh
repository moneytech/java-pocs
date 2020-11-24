#!/bin/bash

HERE=$(pwd)
KAFKA_HOME=/home/diego/bin/kafka_2.13-2.6.0/
cd $KAFKA_HOME 
echo "diego likes kafka" | bin/kafka-console-producer.sh --topic inputTopic --bootstrap-server localhost:9092
cd $HERE 

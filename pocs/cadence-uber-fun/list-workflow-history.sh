#!/bin/bash

docker run --network=host --rm ubercadence/cli:master --do test-domain workflow list

#!/bin/bash
# script to run update and upgrade
# install net-tools (see ip)
# install vim
# and run generate file for create tables
apt-get update && apt-get -yqq upgrade
apt-get install -yqq net-tools
apt-get install -yqq vim
mysql -h localhost -u pomodori -ppomodori pomodori < /sql/generate.sql
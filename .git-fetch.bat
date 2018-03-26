@echo off

git remote add upstream http://192.168.1.137/server/ln-gateway.git
git remote update upstream
git pull upstream master

pause
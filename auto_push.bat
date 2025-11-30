@echo off
cd "C:\IDEA Files\main\src"

echo Initializing auto git push...
git init

REM Set GitHub remote repo
git remote remove origin >nul 2>&1
git remote add origin https://github.com/Akriti1078/Java-Programs.git

git branch -M main

:loop
echo Checking for changes...

git add .

git commit -m "Auto-update on %date% %time%" >nul 2>&1

git push origin main >nul 2>&1

timeout /t 30 >nul

goto loop
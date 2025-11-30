@echo off
echo Auto Git Push Started...
:loop
REM Add all changes
git add .

REM Commit with timestamp
git commit -m "Auto-update on %date% %time%" >nul 2>&1

REM Push to GitHub
git push origin main >nul 2>&1

REM Wait for 30 seconds
timeout /t 30 >nul

goto loop
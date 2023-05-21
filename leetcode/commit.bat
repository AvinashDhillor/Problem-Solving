@echo off
setlocal

REM Get the current date
for /f "tokens=1-3 delims=/" %%A in ("%date%") do (
  set "current_date=%%C-%%A-%%B"
)

git add .
REM Perform the git commit with the current date
git commit -m "commited on %current_date%"
git push

endlocal


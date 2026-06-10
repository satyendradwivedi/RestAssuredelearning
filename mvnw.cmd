@echo off
setlocal
REM Lightweight Maven wrapper for Windows that downloads Maven if not available.
REM If mvn is on PATH, use it directly.
where mvn >nul 2>&1
if %ERRORLEVEL%==0 (
  mvn %*
  exit /b %ERRORLEVEL%
)

REM Determine script directory (project root)
set SCRIPT_DIR=%~dp0
set WRAPPER_DIR=%SCRIPT_DIR%.mvn\wrapper
set MAVEN_DIR=%SCRIPT_DIR%.mvn\apache-maven

if not exist "%MAVEN_DIR%\bin\mvn.cmd" (
  if not exist "%WRAPPER_DIR%" mkdir "%WRAPPER_DIR%"
  set "DIST_URL=https://archive.apache.org/dist/maven/maven-3/3.8.8/binaries/apache-maven-3.8.8-bin.zip"
  set "ZIP=%WRAPPER_DIR%\maven.zip"
  if not exist "%ZIP%" (
    echo Downloading Maven from %DIST_URL%...
    powershell -Command "Invoke-WebRequest -Uri '%DIST_URL%' -OutFile '%ZIP%'"
    if %ERRORLEVEL% neq 0 (
      echo Failed to download Maven. Please install Maven or check network.
      exit /b 1
    )
  )
  echo Extracting Maven...
  powershell -Command "Expand-Archive -Path '%ZIP%' -DestinationPath '%WRAPPER_DIR%' -Force"
  REM Move extracted folder to apache-maven
  for /f "delims=" %%i in ('dir /b "%WRAPPER_DIR%\apache-maven-*" 2^>nul') do (
    if exist "%WRAPPER_DIR%\%%i" (
      move /Y "%WRAPPER_DIR%\%%i" "%MAVEN_DIR%" >nul 2>&1
    )
  )
)

if exist "%MAVEN_DIR%\bin\mvn.cmd" (
  "%MAVEN_DIR%\bin\mvn.cmd" %*
  exit /b %ERRORLEVEL%
)

echo Maven runtime not available and download failed; please install Maven manually.
exit /b 1

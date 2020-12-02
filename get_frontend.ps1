$Path = Get-Location | Select -expand Path
Set-Location "..\HRDepartmentFront"
git pull
yarn install
quasar build

if (Test-Path ".\dist\spa\" -PathType Container) {
    Get-ChildItem "$Path\src\main\webapp" -Exclude "WEB-INF" | Remove-Item -Recurse
    Copy-Item -Path ".\dist\spa\*" -Destination "$Path\src\main\webapp\" -Recurse -Force -Exclude "index.html"

    Set-Location  "$Path\src\main\webapp\js"
    Dir "app.*.js" | rename-item -newname "app.js"
    Dir "vendor.*.js" | rename-item -newname "vendor.js"

    Set-Location  "$Path\src\main\webapp\css"
    Dir app.*.css | rename-item -newname "app.css"
    Dir vendor.*.css | rename-item -newname "vendor.css"
}
else {
    Write-Host
    Write-Host Building error -ForegroundColor Red
    pause
}
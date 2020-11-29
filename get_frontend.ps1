cd ..\HRDepartmentFront
git pull
yarn install
quasar build
Remove-Item "..\HRDepartamentBack\src\main\webapp\css" -Recurse
Remove-Item "..\HRDepartamentBack\src\main\webapp\fonts" -Recurse
Remove-Item "..\HRDepartamentBack\src\main\webapp\icons" -Recurse
Remove-Item "..\HRDepartamentBack\src\main\webapp\js" -Recurse
pause
Copy-Item -Path ".\dist\spa\*" -Destination "..\HRDepartamentBack\src\main\webapp\" -Recurse -Force -Exclude "index.html"
pause
cd ..\HRDepartmentFront
git pull
yarn install
quasar build
DEL / F / Q "..\HRDepartmentBack\src\main\webapp\css"
DEL / F / Q "..\HRDepartmentBack\src\main\webapp\fonts"
DEL / F / Q "..\HRDepartmentBack\src\main\webapp\icons"
DEL / F / Q "..\HRDepartmentBack\src\main\webapp\js"
Copy-Item -Path ".\dist\spa\*" -Destination "..\HRDepartamentBack\src\main\webapp\" -Recurse -Force -Exclude "index.html"
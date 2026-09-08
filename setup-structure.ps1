Write-Host "Creating project documentation structure..."

# ADR directory
New-Item -ItemType Directory -Force -Path "docs\adr" | Out-Null

# AI documentation directory
New-Item -ItemType Directory -Force -Path "docs\ai" | Out-Null

# Java source directories
New-Item -ItemType Directory -Force -Path "src\main\java\com\example\users\controller" | Out-Null
New-Item -ItemType Directory -Force -Path "src\main\java\com\example\users\domain" | Out-Null
New-Item -ItemType Directory -Force -Path "src\main\java\com\example\users\service" | Out-Null
New-Item -ItemType Directory -Force -Path "src\main\java\com\example\users\repository" | Out-Null

# Test directories
New-Item -ItemType Directory -Force -Path "src\test\java\com\example\users" | Out-Null

Write-Host ""
Write-Host "Project structure created successfully."
Write-Host ""
Write-Host "Created:"
Write-Host "  docs\adr"
Write-Host "  docs\ai"
Write-Host "  controller"
Write-Host "  domain"
Write-Host "  service"
Write-Host "  repository"
Write-Host "  test structure"


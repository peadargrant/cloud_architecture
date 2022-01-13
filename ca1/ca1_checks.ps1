# Cloud CA1 checks files
# Peadar Grant

# Zip file name
$zipFileName = '.\cloud_ca1.zip'

# check for ZIp file itself
Write-Host "checking for $zipFileName ... " -NoNewLine
if (-not( Test-Path -Path $zipFileName -PathType Leaf )) {
	Write-Host "does not exist" -ForegroundColor Red
	exit
}

# full path (needed for load)
$fullPath = (Get-ChildItem $zipFileName).FullName
 
[Void][Reflection.Assembly]::LoadWithPartialName('System.IO.Compression.FileSystem')


$zipFile = [IO.Compression.ZipFile]::OpenRead($fullPath)
$Entries = $zipFile.Entries
$zipFile.Dispose() # otherwise will stay open

# list of required files
$requiredFiles = @( 'system_setup.ps1', 'system_teardown.ps1', 'user_data.sh', 'system_demo.ps1', 'system_design.pdf')

# check for each file
$missingFiles = 0
foreach ( $requiredFile in $requiredFiles ) {
	Write-Host "checking for $requiredFile ... " -NoNewLine
	if ( $Entries.Name.Contains($requiredFile) ) {
		Write-Host "found" -ForegroundColor green
	}
	else {
		Write-Host "not found" -ForegroundColor red
		$missingFiles = $missingFiles + 1
	}
	}

# warning message for missing files
if ( $missingFiles -gt 0 ) {
	Write-Host "missing files: $missingFiles" -ForegroundColor Red
	Write-Host "fix and re-try before submission!" -ForegroundColor Red
	exit;
}

Write-Host "Ensure that you have added any additional required files."
Write-Host "Ready to submit to Moodle" -ForegroundColor Green

# Cloud Architecture CA1

**Weight:** 20/100

**Due:** as displayed on Moodle

## Introduction

This CA will showcase your skills developed in the Cloud Architecture module to date.

## Requirements

You are to design a simple cloud-based system consisting of PaaS and IaaS components.
Your system must contain 1 EC2 instance AND at least 1 PaaS service (SQS, S3, others). 
Setup, demonstration and teardown are to be done in a scripted fashion only.

### Design (20%)

You are to present your design in a file `system_design.pdf`.
Max 1 page, A4 sized.

### Cloud environment setup (20%)

You will set up cloud resources in a portably scripted fashion using PowerShell. 
Your script must be called `system_setup.ps1`. 

All values must be looked-up or derived at runtime. 

### Demonstration script (20%)

Demonstration of your system should be done using a script `system_demo.ps1`.
This might put a file in S3, send a message to SQS, make a web request, open a web-browser etc.

It may instruct a user what to do, e.g. a command to type elsewhere.
If so, it should look up specifics (e.g. IP address to type) 

### User-data script (20%)

Your EC2 instance must be fully set up using a script named `user_data.sh`.

### Teardown (20%)

You must remove ALL the resources you create.
Your script must be called `system_teardown.ps1`. 

## Submission

Place all files required above plus any additional needed for your solution in a ZIP folder named exactly `cloud_ca1.zip`.
Use `ca1_checks.ps1` to confirm your ZIP file meets requirements.

## Feedback

Summary written feedback will be given in Moodle.
Detailed verbal feedback is available on request in consultation.


Overview
========

For this project you should identify a problem that can be solved using
a combination of infrastructure (EC2, VPC, ...) and platform services
(S3, SNS, SQS, Lambda, ...). You should pick a topic that is useful to
you / relevant to your acedmic studies.

-   Your project should include multiple PaaS / IaaS components that
    must be interconnected in some way. Can also include local PC,
    server-based components, resources provisioned on Xen server etc.

-   CloudFormation must be used for setup.

-   Must incorporate at least one service not already studied in class.
    Non-trivial EC2 server configuration (e.g. cloud-init, EC2Launch,
    Ansible, CFEngine, Chef, Puppet) would suffice for this aspect.

Deliverables
============

In a single ZIP file named `repeatca.zip` you must provide:

Project aims (10%)
------------------

Identify the problem to be solved and the key functionality your system
will demonstrate in the file `aims.txt`.

Architectural design diagram (30%) {#sec:architectural-diagram}
----------------------------------

You are required to submit an architectural diagram of your system as a
single A4 PDF in the file `architecture.pdf`. In particular: services
used, components, policies and networking configuration.

CloudFormation template (30%) {#sec:cloudformation-template}
-----------------------------

Provide a CloudFormation template named `ca2_template.json` to setup
your resources. This should map to the items shown in .

Provide any additional files / resources that are required by
CloudFormation.

Self-identified service (20%)
-----------------------------

You are required to use at least one new service. This will be assessed
based on relevant code artefacts submitted for .

Verification (10%)
------------------

Provide a script (`ca2_demo.ps1`, `ca2_demo.sh`) or set of instructions
`ca2_demo.txt` to demonstrate your built architecture. Include any
screenshots / text output that you feel may help.

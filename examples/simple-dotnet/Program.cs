﻿using System.Collections.Generic;
using Pulumi;
using UnMango.Commandx;

return await Deployment.RunAsync(() =>
{
    var ca = new RootCa("simple", new RootCaArgs {
        Algorithm = Algorithm.RSA,
        ValidityPeriodHours = 256,
    });

    var cert = new Certificate("simple", new CertificateArgs {
        Algorithm = Algorithm.RSA,
        ValidityPeriodHours = 256,
        AllowedUses = new[] { AllowedUsage.CertSigning },
        CaCertPem = ca.CertPem,
        CaPrivateKeyPem = ca.PrivateKeyPem,
    });

    return new Dictionary<string, object?>
    {
        ["outputKey"] = cert.CertPem,
    };
});

# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .provider import *

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_commandx.remote as __remote
    remote = __remote
else:
    remote = _utilities.lazy_import('pulumi_commandx.remote')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "commandx",
  "mod": "remote",
  "fqn": "pulumi_commandx.remote",
  "classes": {
   "commandx:remote:Chmod": "Chmod",
   "commandx:remote:Curl": "Curl",
   "commandx:remote:Etcdctl": "Etcdctl",
   "commandx:remote:Hostnamectl": "Hostnamectl",
   "commandx:remote:Mkdir": "Mkdir",
   "commandx:remote:Mktemp": "Mktemp",
   "commandx:remote:Mv": "Mv",
   "commandx:remote:Rm": "Rm",
   "commandx:remote:Sed": "Sed",
   "commandx:remote:Systemctl": "Systemctl",
   "commandx:remote:Tar": "Tar",
   "commandx:remote:Tee": "Tee",
   "commandx:remote:Wget": "Wget"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "commandx",
  "token": "pulumi:providers:commandx",
  "fqn": "pulumi_commandx",
  "class": "Provider"
 }
]
"""
)

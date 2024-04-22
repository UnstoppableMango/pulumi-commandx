// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { ChmodArgs } from "./chmod";
export type Chmod = import("./chmod").Chmod;
export const Chmod: typeof import("./chmod").Chmod = null as any;
utilities.lazyLoad(exports, ["Chmod"], () => require("./chmod"));

export { CurlArgs } from "./curl";
export type Curl = import("./curl").Curl;
export const Curl: typeof import("./curl").Curl = null as any;
utilities.lazyLoad(exports, ["Curl"], () => require("./curl"));

export { EtcdctlArgs } from "./etcdctl";
export type Etcdctl = import("./etcdctl").Etcdctl;
export const Etcdctl: typeof import("./etcdctl").Etcdctl = null as any;
utilities.lazyLoad(exports, ["Etcdctl"], () => require("./etcdctl"));

export { HostnamectlArgs } from "./hostnamectl";
export type Hostnamectl = import("./hostnamectl").Hostnamectl;
export const Hostnamectl: typeof import("./hostnamectl").Hostnamectl = null as any;
utilities.lazyLoad(exports, ["Hostnamectl"], () => require("./hostnamectl"));

export { MkdirArgs } from "./mkdir";
export type Mkdir = import("./mkdir").Mkdir;
export const Mkdir: typeof import("./mkdir").Mkdir = null as any;
utilities.lazyLoad(exports, ["Mkdir"], () => require("./mkdir"));

export { MktempArgs } from "./mktemp";
export type Mktemp = import("./mktemp").Mktemp;
export const Mktemp: typeof import("./mktemp").Mktemp = null as any;
utilities.lazyLoad(exports, ["Mktemp"], () => require("./mktemp"));

export { MvArgs } from "./mv";
export type Mv = import("./mv").Mv;
export const Mv: typeof import("./mv").Mv = null as any;
utilities.lazyLoad(exports, ["Mv"], () => require("./mv"));

export { RmArgs } from "./rm";
export type Rm = import("./rm").Rm;
export const Rm: typeof import("./rm").Rm = null as any;
utilities.lazyLoad(exports, ["Rm"], () => require("./rm"));

export { SedArgs } from "./sed";
export type Sed = import("./sed").Sed;
export const Sed: typeof import("./sed").Sed = null as any;
utilities.lazyLoad(exports, ["Sed"], () => require("./sed"));

export { SystemctlArgs } from "./systemctl";
export type Systemctl = import("./systemctl").Systemctl;
export const Systemctl: typeof import("./systemctl").Systemctl = null as any;
utilities.lazyLoad(exports, ["Systemctl"], () => require("./systemctl"));

export { TarArgs } from "./tar";
export type Tar = import("./tar").Tar;
export const Tar: typeof import("./tar").Tar = null as any;
utilities.lazyLoad(exports, ["Tar"], () => require("./tar"));

export { TeeArgs } from "./tee";
export type Tee = import("./tee").Tee;
export const Tee: typeof import("./tee").Tee = null as any;
utilities.lazyLoad(exports, ["Tee"], () => require("./tee"));

export { WgetArgs } from "./wget";
export type Wget = import("./wget").Wget;
export const Wget: typeof import("./wget").Wget = null as any;
utilities.lazyLoad(exports, ["Wget"], () => require("./wget"));


// Export enums:
export * from "../types/enums/remote";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "commandx:remote:Chmod":
                return new Chmod(name, <any>undefined, { urn })
            case "commandx:remote:Curl":
                return new Curl(name, <any>undefined, { urn })
            case "commandx:remote:Etcdctl":
                return new Etcdctl(name, <any>undefined, { urn })
            case "commandx:remote:Hostnamectl":
                return new Hostnamectl(name, <any>undefined, { urn })
            case "commandx:remote:Mkdir":
                return new Mkdir(name, <any>undefined, { urn })
            case "commandx:remote:Mktemp":
                return new Mktemp(name, <any>undefined, { urn })
            case "commandx:remote:Mv":
                return new Mv(name, <any>undefined, { urn })
            case "commandx:remote:Rm":
                return new Rm(name, <any>undefined, { urn })
            case "commandx:remote:Sed":
                return new Sed(name, <any>undefined, { urn })
            case "commandx:remote:Systemctl":
                return new Systemctl(name, <any>undefined, { urn })
            case "commandx:remote:Tar":
                return new Tar(name, <any>undefined, { urn })
            case "commandx:remote:Tee":
                return new Tee(name, <any>undefined, { urn })
            case "commandx:remote:Wget":
                return new Wget(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("commandx", "remote", _module)
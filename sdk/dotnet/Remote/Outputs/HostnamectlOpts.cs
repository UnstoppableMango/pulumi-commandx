// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace UnMango.Commandx.Remote.Outputs
{

    /// <summary>
    /// Abstraction over the `hostnamectl` utility on a remote system.
    /// </summary>
    [OutputType]
    public sealed class HostnamectlOpts
    {
        /// <summary>
        /// The argument for the specified `command`.
        /// </summary>
        public readonly string? Arg;
        /// <summary>
        /// Corresponds to the {COMMAND} argument.
        /// </summary>
        public readonly UnMango.Commandx.Remote.HostnamectlCommand Command;
        /// <summary>
        /// Print a short help text and exit.
        /// </summary>
        public readonly bool? Help;
        /// <summary>
        /// Execute the operation remotely. Specify a hostname, or a username and hostname separated by '@', to connect to.
        /// </summary>
        public readonly string? Host;
        /// <summary>
        /// Shows output formatted as JSON.
        /// </summary>
        public readonly UnMango.Commandx.Remote.HostnamectlJsonMode? Json;
        /// <summary>
        /// Execute operation on a local container. Specify a container name to connect to, optionally prefixed by a user name to connect as and a separating '@' character.
        /// </summary>
        public readonly string? Machine;
        /// <summary>
        /// Do not query the user for authentication for privileged operations.
        /// </summary>
        public readonly bool? NoAskPassword;
        /// <summary>
        /// If status is invoked (or no explicit command is given) and one of these switches is specified, hostnamectl will print out just this selected hostname. Same as `static` and `transient`.
        /// </summary>
        public readonly bool? Pretty;
        /// <summary>
        /// If status is invoked (or no explicit command is given) and one of these switches is specified, hostnamectl will print out just this selected hostname. Same as `transient` and `pretty`.
        /// </summary>
        public readonly bool? Static;
        /// <summary>
        /// If status is invoked (or no explicit command is given) and one of these switches is specified, hostnamectl will print out just this selected hostname. Same as `static` and `pretty`.
        /// </summary>
        public readonly bool? Transient;
        /// <summary>
        /// Print a short version string and exit.
        /// </summary>
        public readonly bool? Version;

        [OutputConstructor]
        private HostnamectlOpts(
            string? arg,

            UnMango.Commandx.Remote.HostnamectlCommand command,

            bool? help,

            string? host,

            UnMango.Commandx.Remote.HostnamectlJsonMode? json,

            string? machine,

            bool? noAskPassword,

            bool? pretty,

            bool? @static,

            bool? transient,

            bool? version)
        {
            Arg = arg;
            Command = command;
            Help = help;
            Host = host;
            Json = json;
            Machine = machine;
            NoAskPassword = noAskPassword;
            Pretty = pretty;
            Static = @static;
            Transient = transient;
            Version = version;
        }
    }
}
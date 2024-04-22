// *** WARNING: this file was generated by pulumi. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.unmango.commandx.remote.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Abstraction over the `sed` utility on a remote system.
 * 
 */
public final class SedOptsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SedOptsArgs Empty = new SedOptsArgs();

    /**
     * annotate program execution.
     * 
     */
    @Import(name="debug")
    private @Nullable Output<Boolean> debug;

    /**
     * @return annotate program execution.
     * 
     */
    public Optional<Output<Boolean>> debug() {
        return Optional.ofNullable(this.debug);
    }

    /**
     * add the script to the commands to be executed.
     * 
     */
    @Import(name="expressions")
    private @Nullable Output<List<String>> expressions;

    /**
     * @return add the script to the commands to be executed.
     * 
     */
    public Optional<Output<List<String>>> expressions() {
        return Optional.ofNullable(this.expressions);
    }

    /**
     * add the contents of script-file to the commands to be executed.
     * 
     */
    @Import(name="files")
    private @Nullable Output<List<String>> files;

    /**
     * @return add the contents of script-file to the commands to be executed.
     * 
     */
    public Optional<Output<List<String>>> files() {
        return Optional.ofNullable(this.files);
    }

    /**
     * follow symlinks when processing in place
     * 
     */
    @Import(name="followSymlinks")
    private @Nullable Output<Boolean> followSymlinks;

    /**
     * @return follow symlinks when processing in place
     * 
     */
    public Optional<Output<Boolean>> followSymlinks() {
        return Optional.ofNullable(this.followSymlinks);
    }

    /**
     * display this help and exit.
     * 
     */
    @Import(name="help")
    private @Nullable Output<Boolean> help;

    /**
     * @return display this help and exit.
     * 
     */
    public Optional<Output<Boolean>> help() {
        return Optional.ofNullable(this.help);
    }

    /**
     * edit files in place (makes backup if SUFFIX supplied)
     * 
     */
    @Import(name="inPlace")
    private @Nullable Output<String> inPlace;

    /**
     * @return edit files in place (makes backup if SUFFIX supplied)
     * 
     */
    public Optional<Output<String>> inPlace() {
        return Optional.ofNullable(this.inPlace);
    }

    /**
     * corresponds to the [input-file]... argument(s).
     * 
     */
    @Import(name="inputFiles")
    private @Nullable Output<List<String>> inputFiles;

    /**
     * @return corresponds to the [input-file]... argument(s).
     * 
     */
    public Optional<Output<List<String>>> inputFiles() {
        return Optional.ofNullable(this.inputFiles);
    }

    /**
     * specify the desired line-wrap length for the `l&#39; command
     * 
     */
    @Import(name="lineLength")
    private @Nullable Output<Integer> lineLength;

    /**
     * @return specify the desired line-wrap length for the `l&#39; command
     * 
     */
    public Optional<Output<Integer>> lineLength() {
        return Optional.ofNullable(this.lineLength);
    }

    /**
     * separate lines by NUL characters
     * 
     */
    @Import(name="nullData")
    private @Nullable Output<Boolean> nullData;

    /**
     * @return separate lines by NUL characters
     * 
     */
    public Optional<Output<Boolean>> nullData() {
        return Optional.ofNullable(this.nullData);
    }

    /**
     * disable all GNU extensions.
     * 
     */
    @Import(name="posix")
    private @Nullable Output<Boolean> posix;

    /**
     * @return disable all GNU extensions.
     * 
     */
    public Optional<Output<Boolean>> posix() {
        return Optional.ofNullable(this.posix);
    }

    /**
     * suppress automatic printing of pattern space. Same as `silent`.
     * 
     */
    @Import(name="quiet")
    private @Nullable Output<Boolean> quiet;

    /**
     * @return suppress automatic printing of pattern space. Same as `silent`.
     * 
     */
    public Optional<Output<Boolean>> quiet() {
        return Optional.ofNullable(this.quiet);
    }

    /**
     * use extended regular expressions in the script (for portability use POSIX -E).
     * 
     */
    @Import(name="regexpExtended")
    private @Nullable Output<Boolean> regexpExtended;

    /**
     * @return use extended regular expressions in the script (for portability use POSIX -E).
     * 
     */
    public Optional<Output<Boolean>> regexpExtended() {
        return Optional.ofNullable(this.regexpExtended);
    }

    /**
     * operate in sandbox mode (disable e/r/w commands).
     * 
     */
    @Import(name="sandbox")
    private @Nullable Output<Boolean> sandbox;

    /**
     * @return operate in sandbox mode (disable e/r/w commands).
     * 
     */
    public Optional<Output<Boolean>> sandbox() {
        return Optional.ofNullable(this.sandbox);
    }

    /**
     * script only if no other script.
     * 
     */
    @Import(name="script")
    private @Nullable Output<String> script;

    /**
     * @return script only if no other script.
     * 
     */
    public Optional<Output<String>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * consider files as separate rather than as a single, continuous long stream.
     * 
     */
    @Import(name="separate")
    private @Nullable Output<Boolean> separate;

    /**
     * @return consider files as separate rather than as a single, continuous long stream.
     * 
     */
    public Optional<Output<Boolean>> separate() {
        return Optional.ofNullable(this.separate);
    }

    /**
     * suppress automatic printing of pattern space. Same as `quiet`.
     * 
     */
    @Import(name="silent")
    private @Nullable Output<Boolean> silent;

    /**
     * @return suppress automatic printing of pattern space. Same as `quiet`.
     * 
     */
    public Optional<Output<Boolean>> silent() {
        return Optional.ofNullable(this.silent);
    }

    /**
     * load minimal amounts of data from the input files and flush the output buffers more often.
     * 
     */
    @Import(name="unbuffered")
    private @Nullable Output<Boolean> unbuffered;

    /**
     * @return load minimal amounts of data from the input files and flush the output buffers more often.
     * 
     */
    public Optional<Output<Boolean>> unbuffered() {
        return Optional.ofNullable(this.unbuffered);
    }

    /**
     * output version information and exit.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Boolean> version;

    /**
     * @return output version information and exit.
     * 
     */
    public Optional<Output<Boolean>> version() {
        return Optional.ofNullable(this.version);
    }

    private SedOptsArgs() {}

    private SedOptsArgs(SedOptsArgs $) {
        this.debug = $.debug;
        this.expressions = $.expressions;
        this.files = $.files;
        this.followSymlinks = $.followSymlinks;
        this.help = $.help;
        this.inPlace = $.inPlace;
        this.inputFiles = $.inputFiles;
        this.lineLength = $.lineLength;
        this.nullData = $.nullData;
        this.posix = $.posix;
        this.quiet = $.quiet;
        this.regexpExtended = $.regexpExtended;
        this.sandbox = $.sandbox;
        this.script = $.script;
        this.separate = $.separate;
        this.silent = $.silent;
        this.unbuffered = $.unbuffered;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SedOptsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SedOptsArgs $;

        public Builder() {
            $ = new SedOptsArgs();
        }

        public Builder(SedOptsArgs defaults) {
            $ = new SedOptsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param debug annotate program execution.
         * 
         * @return builder
         * 
         */
        public Builder debug(@Nullable Output<Boolean> debug) {
            $.debug = debug;
            return this;
        }

        /**
         * @param debug annotate program execution.
         * 
         * @return builder
         * 
         */
        public Builder debug(Boolean debug) {
            return debug(Output.of(debug));
        }

        /**
         * @param expressions add the script to the commands to be executed.
         * 
         * @return builder
         * 
         */
        public Builder expressions(@Nullable Output<List<String>> expressions) {
            $.expressions = expressions;
            return this;
        }

        /**
         * @param expressions add the script to the commands to be executed.
         * 
         * @return builder
         * 
         */
        public Builder expressions(List<String> expressions) {
            return expressions(Output.of(expressions));
        }

        /**
         * @param expressions add the script to the commands to be executed.
         * 
         * @return builder
         * 
         */
        public Builder expressions(String... expressions) {
            return expressions(List.of(expressions));
        }

        /**
         * @param files add the contents of script-file to the commands to be executed.
         * 
         * @return builder
         * 
         */
        public Builder files(@Nullable Output<List<String>> files) {
            $.files = files;
            return this;
        }

        /**
         * @param files add the contents of script-file to the commands to be executed.
         * 
         * @return builder
         * 
         */
        public Builder files(List<String> files) {
            return files(Output.of(files));
        }

        /**
         * @param files add the contents of script-file to the commands to be executed.
         * 
         * @return builder
         * 
         */
        public Builder files(String... files) {
            return files(List.of(files));
        }

        /**
         * @param followSymlinks follow symlinks when processing in place
         * 
         * @return builder
         * 
         */
        public Builder followSymlinks(@Nullable Output<Boolean> followSymlinks) {
            $.followSymlinks = followSymlinks;
            return this;
        }

        /**
         * @param followSymlinks follow symlinks when processing in place
         * 
         * @return builder
         * 
         */
        public Builder followSymlinks(Boolean followSymlinks) {
            return followSymlinks(Output.of(followSymlinks));
        }

        /**
         * @param help display this help and exit.
         * 
         * @return builder
         * 
         */
        public Builder help(@Nullable Output<Boolean> help) {
            $.help = help;
            return this;
        }

        /**
         * @param help display this help and exit.
         * 
         * @return builder
         * 
         */
        public Builder help(Boolean help) {
            return help(Output.of(help));
        }

        /**
         * @param inPlace edit files in place (makes backup if SUFFIX supplied)
         * 
         * @return builder
         * 
         */
        public Builder inPlace(@Nullable Output<String> inPlace) {
            $.inPlace = inPlace;
            return this;
        }

        /**
         * @param inPlace edit files in place (makes backup if SUFFIX supplied)
         * 
         * @return builder
         * 
         */
        public Builder inPlace(String inPlace) {
            return inPlace(Output.of(inPlace));
        }

        /**
         * @param inputFiles corresponds to the [input-file]... argument(s).
         * 
         * @return builder
         * 
         */
        public Builder inputFiles(@Nullable Output<List<String>> inputFiles) {
            $.inputFiles = inputFiles;
            return this;
        }

        /**
         * @param inputFiles corresponds to the [input-file]... argument(s).
         * 
         * @return builder
         * 
         */
        public Builder inputFiles(List<String> inputFiles) {
            return inputFiles(Output.of(inputFiles));
        }

        /**
         * @param inputFiles corresponds to the [input-file]... argument(s).
         * 
         * @return builder
         * 
         */
        public Builder inputFiles(String... inputFiles) {
            return inputFiles(List.of(inputFiles));
        }

        /**
         * @param lineLength specify the desired line-wrap length for the `l&#39; command
         * 
         * @return builder
         * 
         */
        public Builder lineLength(@Nullable Output<Integer> lineLength) {
            $.lineLength = lineLength;
            return this;
        }

        /**
         * @param lineLength specify the desired line-wrap length for the `l&#39; command
         * 
         * @return builder
         * 
         */
        public Builder lineLength(Integer lineLength) {
            return lineLength(Output.of(lineLength));
        }

        /**
         * @param nullData separate lines by NUL characters
         * 
         * @return builder
         * 
         */
        public Builder nullData(@Nullable Output<Boolean> nullData) {
            $.nullData = nullData;
            return this;
        }

        /**
         * @param nullData separate lines by NUL characters
         * 
         * @return builder
         * 
         */
        public Builder nullData(Boolean nullData) {
            return nullData(Output.of(nullData));
        }

        /**
         * @param posix disable all GNU extensions.
         * 
         * @return builder
         * 
         */
        public Builder posix(@Nullable Output<Boolean> posix) {
            $.posix = posix;
            return this;
        }

        /**
         * @param posix disable all GNU extensions.
         * 
         * @return builder
         * 
         */
        public Builder posix(Boolean posix) {
            return posix(Output.of(posix));
        }

        /**
         * @param quiet suppress automatic printing of pattern space. Same as `silent`.
         * 
         * @return builder
         * 
         */
        public Builder quiet(@Nullable Output<Boolean> quiet) {
            $.quiet = quiet;
            return this;
        }

        /**
         * @param quiet suppress automatic printing of pattern space. Same as `silent`.
         * 
         * @return builder
         * 
         */
        public Builder quiet(Boolean quiet) {
            return quiet(Output.of(quiet));
        }

        /**
         * @param regexpExtended use extended regular expressions in the script (for portability use POSIX -E).
         * 
         * @return builder
         * 
         */
        public Builder regexpExtended(@Nullable Output<Boolean> regexpExtended) {
            $.regexpExtended = regexpExtended;
            return this;
        }

        /**
         * @param regexpExtended use extended regular expressions in the script (for portability use POSIX -E).
         * 
         * @return builder
         * 
         */
        public Builder regexpExtended(Boolean regexpExtended) {
            return regexpExtended(Output.of(regexpExtended));
        }

        /**
         * @param sandbox operate in sandbox mode (disable e/r/w commands).
         * 
         * @return builder
         * 
         */
        public Builder sandbox(@Nullable Output<Boolean> sandbox) {
            $.sandbox = sandbox;
            return this;
        }

        /**
         * @param sandbox operate in sandbox mode (disable e/r/w commands).
         * 
         * @return builder
         * 
         */
        public Builder sandbox(Boolean sandbox) {
            return sandbox(Output.of(sandbox));
        }

        /**
         * @param script script only if no other script.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script script only if no other script.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        /**
         * @param separate consider files as separate rather than as a single, continuous long stream.
         * 
         * @return builder
         * 
         */
        public Builder separate(@Nullable Output<Boolean> separate) {
            $.separate = separate;
            return this;
        }

        /**
         * @param separate consider files as separate rather than as a single, continuous long stream.
         * 
         * @return builder
         * 
         */
        public Builder separate(Boolean separate) {
            return separate(Output.of(separate));
        }

        /**
         * @param silent suppress automatic printing of pattern space. Same as `quiet`.
         * 
         * @return builder
         * 
         */
        public Builder silent(@Nullable Output<Boolean> silent) {
            $.silent = silent;
            return this;
        }

        /**
         * @param silent suppress automatic printing of pattern space. Same as `quiet`.
         * 
         * @return builder
         * 
         */
        public Builder silent(Boolean silent) {
            return silent(Output.of(silent));
        }

        /**
         * @param unbuffered load minimal amounts of data from the input files and flush the output buffers more often.
         * 
         * @return builder
         * 
         */
        public Builder unbuffered(@Nullable Output<Boolean> unbuffered) {
            $.unbuffered = unbuffered;
            return this;
        }

        /**
         * @param unbuffered load minimal amounts of data from the input files and flush the output buffers more often.
         * 
         * @return builder
         * 
         */
        public Builder unbuffered(Boolean unbuffered) {
            return unbuffered(Output.of(unbuffered));
        }

        /**
         * @param version output version information and exit.
         * 
         * @return builder
         * 
         */
        public Builder version(@Nullable Output<Boolean> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version output version information and exit.
         * 
         * @return builder
         * 
         */
        public Builder version(Boolean version) {
            return version(Output.of(version));
        }

        public SedOptsArgs build() {
            return $;
        }
    }

}
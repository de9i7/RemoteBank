package com.remote.bank.tools;

import com.remote.bank.context.ApplicationContext;
import org.apache.commons.cli.*;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

/**
 * @author DKachurovskiy
 * @version 1.0 12 17, 2012
 */
public class OptionsParser {

    private static final Logger LOG = Logger.getLogger(OptionsParser.class);

    public static final String OPTION_CONSOLE_MODE = "console";

    public static final String OPTION_FILE_INPUT = "src";


    public static List<Option> prepareOptions(String[] args) throws ParseException {
        final Options options = new Options();
        final Option optionMode = OptionBuilder.hasArg(false).create(OPTION_CONSOLE_MODE);
        final Option optionSource = OptionBuilder.hasArg(true).hasArgs(1).create(OPTION_FILE_INPUT);

        options.addOption(optionMode);
        options.addOption(optionSource);

        final CommandLineParser parser = new GnuParser();
        final CommandLine cmd = parser.parse(options, args);



        LOG.info("Cammand line options has been read.");

        return Arrays.asList(cmd.getOptions());
    }
}

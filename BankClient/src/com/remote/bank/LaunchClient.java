package com.remote.bank;

import com.remote.bank.tools.OptionsParser;
import org.apache.commons.cli.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

/**
 * @author DKachurovskiy
 * @version 1.0 12 17, 2012
 */
public class LaunchClient {

    private static final Logger LOG = Logger.getLogger(OptionsParser.class);

    private static final String OPTION_CONSOLE_MODE = "console";

    private static final String OPTION_FILE_INPUT = "src";

    /** Comman line arguments */
    private static Option optionMode;
    private static Option optionSource;

    public static void main(String[] args) throws ParseException {

        final List<Option> options = prepareOptions(args);

        LOG.info(options.toString());
        if (options.contains(optionSource)) {
            LOG.error("Source file has been set.");

            if (options.contains(optionMode)) {
                LOG.info("Console mode has been set.");


            } else {
                LOG.info("Gui mode has been set.");
		        // Some changes
                // Check ignore list
            }

        } else {
            LOG.error("Source file has not been set...");
        }
    }

    /**
     * Prepares the list of parsed Options instances.
     * @param args
     * @return
     * @throws ParseException
     */
    private static List<Option> prepareOptions(String[] args) throws ParseException {
        final Options options = new Options();
        optionMode = OptionBuilder.hasArg(false).create(OPTION_CONSOLE_MODE);
        optionSource = OptionBuilder.hasArg(true).hasArgs(1).create(OPTION_FILE_INPUT);

        options.addOption(optionMode);
        options.addOption(optionSource);

        final CommandLineParser parser = new GnuParser();
        final CommandLine cmd = parser.parse(options, args);

        LOG.info("Cammand line options has been read.");

        return Arrays.asList(cmd.getOptions());
    }
}

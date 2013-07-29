package de.softwareforge.tools;

import org.apache.hadoop.record.compiler.generated.Rcc;

public class MavenRcc
{
    public static void main(final String... args)
    {
        final int result = Rcc.driver(args);
        if (result != 0) {
            System.exit(result);
        }
    }
}

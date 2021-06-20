package de.b4ckf1sh.configtool;

public class ConfigLib {


    public static String createConfig() {
        StringBuilder s = new StringBuilder();

        s.append("""
                ;---------------------------------------------------------------------------------------------------------------------
                ; MWO User Config Tool by B4CKF1SH
                ;---------------------------------------------------------------------------------------------------------------------
                """);


        for (Option o : OptionsLibrary.getOptionList()) {
            s.append("\n");
            if (o instanceof RangeOption && ((RangeOption) o).getIsDouble())
                s.append(String.format("; %s%n%s = %.3f", o.description.replace("\n", "\n; "), o.name, o.getValue() / 1000d));
            else
                s.append(String.format("; %s%n%s = %d", o.description.replace("\n", "\n; "), o.name, o.getValue()));

        }


        return s.toString();
    }


}

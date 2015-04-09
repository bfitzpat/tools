package org.switchyard.tools.ui.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class EscapedPropertyUtil {
    protected static final Pattern INNER_DOLLAR_START_PATTERN = Pattern.compile("\\$\\{"); //$NON-NLS-1$
    protected static final Pattern OUTER_CURLY_PATTERN = Pattern.compile("\\}"); //$NON-NLS-1$

    public static boolean isEscapedString(String s) {
        int leftSides = 0;
        Matcher idc_start_mat = INNER_DOLLAR_START_PATTERN.matcher(s);
        boolean foundSingle = idc_start_mat.find();
        while (foundSingle) {
            leftSides++;
            foundSingle = idc_start_mat.find(idc_start_mat.end());
        }
        if (leftSides > 0) {
            return true;
        }
        return false;
    }
    
    public static boolean isValidEscapedString (String s) {
        int leftSides = 0;
        Matcher idc_start_mat = INNER_DOLLAR_START_PATTERN.matcher(s);
        boolean foundSingle = idc_start_mat.find();
        while (foundSingle) {
            leftSides++;
            foundSingle = idc_start_mat.find(idc_start_mat.end());
        }
        
        int rightSides = 0;
        Matcher idc_end_mat = OUTER_CURLY_PATTERN.matcher(s);
        boolean foundOuter = idc_end_mat.find();
        while (foundOuter) {
            rightSides++;
            foundOuter = idc_end_mat.find(idc_end_mat.end());
        }
        
        if (leftSides == rightSides && leftSides > 0) {
            return true;
        }
        return false;
    }
}

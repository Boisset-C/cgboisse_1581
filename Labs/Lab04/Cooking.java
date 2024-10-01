//Cosme Boisset - Lab04 - Problem 3: Cooking

/*
static double teaspoonsToTablespoons(double teaspoons)
              Returns number of TBSPs from TSP, 1 tablespoon = 3 teaspoons
 static double tablespoonsToTeaspoons(double tablespoons)
              Returns number of TSPs from TBSP, 1 tablespoon = 3 teaspoons
 static double tablespoonsToCups(double tablespoons)
              Returns number of CUPs from TBSP, 1 cup = 16 tablespoons
 static double cupsToTablespoons(double cups)
              Returns number of TBSPs from CUPs, 1 cup = 16 tablespoons
 static double ouncesToCups(double ounces)
              Returns number of CUPs from OUNCEs, 1 cup = 8 ounces
 static double cupsToOunces(double cups)
              Returns number of OUNCEs from CUPs, 1 cup = 8 ounces
 static double cupsToPints(double cups)
              Returns number of PINTs from CUPs, 1 pint = 2 cups
 static double pintsToCups(double pints)
              Returns number of CUPs from PINTs, 1 pint = 2 cups
 */


public class Cooking {
    public static double teaspoonsToTablespoons(double teaspoons) {
        return teaspoons / 3;
    }
    public static double tablespoonsToTeaspoons(double tablespoons) {
        return tablespoons * 3;
    }
    public static double tablespoonsToCups(double tablespoons) {
        return tablespoons / 16;
    }
    public static double cupsToTablespoons(double cups) {
        return cups * 16;
    }
    public static double ouncesToCups(double ounces) {
        return ounces / 8;
    }
    public static double cupsToOunces(double cups) {
        return cups * 8;
    }
    public static double cupsToPints(double cups) {
        return cups / 2;
    }
    public static double pintsToCups(double pints) {
        return pints * 2;
    }

}

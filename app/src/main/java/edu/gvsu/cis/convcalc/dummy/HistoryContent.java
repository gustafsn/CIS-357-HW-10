package edu.gvsu.cis.convcalc.dummy;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class HistoryContent {

    public static final List<HistoryItem> ITEMS = new ArrayList<HistoryItem>();

    public static void addItem(HistoryItem item) {
        ITEMS.add(item);
    }

    static {
        DateTime now = DateTime.now();
        addItem(new HistoryItem(2.0, 1.829, "Length", "Yards", "Meters", now.minusDays(1).toString()));
        addItem(new HistoryItem(1.0, 3.785, "Volume", "Gallons", "Liters", now.minusDays(1).toString()));
        addItem(new HistoryItem(2.0, 1.829, "Length", "Yards", "Meters", now.plusDays(1).toString()));
        addItem(new HistoryItem(1.0, 3.785, "Volume", "Gallons", "Liters", now.plusDays(1).toString()));
    }

    public static class HistoryItem {
        public String _key;
        public final Double fromVal;
        public final Double toVal;
        public final String mode;
        public final String fromUnits;
        public final String toUnits;

        public final String timestamp;

        public HistoryItem(Double fromVal, Double toVal, String mode,
                           String fromUnits, String toUnits, String timestamp) {
            this.fromVal = fromVal;
            this.toVal = toVal;
            this.mode = mode;
            this.fromUnits = fromUnits;
            this.toUnits = toUnits;
            this.timestamp = timestamp;
        }

        public HistoryItem() {
            DateTime now = DateTime.now();
            this.fromVal = 1.0;
            this.toVal = 2.0;
            this.mode = "Length";
            this.fromUnits = "Meters";
            this.toUnits = "Yards";
            this.timestamp = now.plusDays(1).toString();
        }

        @Override
        public String toString() {
            return this.fromVal + " " + this.fromUnits + " = " + this.toVal + " " + this.toUnits;
        }
    }
}


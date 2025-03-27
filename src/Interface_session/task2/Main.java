package Interface_session.task2;

import Interface_session.task2.models.LowerCaseFormatter;
import Interface_session.task2.models.UpperCaseFormatter;

public class Main {
    public static void main(String[] args) {
        UpperCaseFormatter upperCaseFormatter= new UpperCaseFormatter();
        upperCaseFormatter.formatMassege("sanjar");
        LowerCaseFormatter lowerCaseFormatter = new LowerCaseFormatter();
        lowerCaseFormatter.formatMassege("OROZOBEKOV");
    }
}

package de.suparv2exnerdjocokg.suparv2exnerdjo.dummy;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.suparv2exnerdjocokg.suparv2exnerdjo.Carer;
import de.suparv2exnerdjocokg.suparv2exnerdjo.Todo.Note;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyNotes {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Note> ITEMS = new ArrayList<>();
    public static final List<Note> ITEMS_Erna = new ArrayList<>();
    public static final List<Note> ITEMS_Ernst = new ArrayList<>();
    public static final List<Note> ITEMS_Helga = new ArrayList<>();
    public static final List<Note> ITEMS_Emma = new ArrayList<>();
    public static final List<Note> ITEMS_Hans = new ArrayList<>();
    public static final List<Note> ITEMS_Karl = new ArrayList<>();
    public static final List<Note> ITEMS_Irmgard = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Note> ITEM_MAP = new HashMap<>();


    static {

        fillErna();
        fillErnst();
        fillHelga();
        fillEmma();
        fillHans();
        fillKarl();
        fillIrmgard();

        ITEMS.add(new Note("Ganzwaschung", "Bitte immer den roten (weichen) Lappen benutzen.", new Carer("Jimmy"), new Timestamp(System.currentTimeMillis())));
        ITEMS.add(new Note("Teilwaschung", "Bitte immer den roten (weichen) Lappen benutzen.", new Carer("Jimmy"), new Timestamp(System.currentTimeMillis())));
        ITEMS.add(new Note("Hilfe bei der Nahrungsaufnahme", "Harte Speisen bitte zerkleinern", new Carer("Jimmy"), new Timestamp(System.currentTimeMillis())));
        ITEMS.add(new Note("Selbstständige Nahrungsaufnahme", "Harte Speisen bitte zerkleinern", new Carer("Jimmy"), new Timestamp(System.currentTimeMillis())));
        ITEMS.add(new Note("Nahrungsaufnahme", "Zahnschmerzen bei dem Kauen", new Carer("Timmy"), new Timestamp(getYesterday())));
        ITEMS.add(new Note("Haut", "Hautfarbe auffällig blass", new Carer("Timmy"), new Timestamp(getYesterday())));
        ITEMS.add(new Note("Wunden", "Wunde XY eitert stark", new Carer("Timmy"), new Timestamp(getYesterday())));
        ITEMS.add(new Note("Stimmung", "Sehr schlechte Laune", new Carer("Timmy"), new Timestamp(getYesterday())));
        ITEMS.add(new Note("Medikamenteneinnahme", "Problemlos", new Carer("Timmy"), new Timestamp(getYesterday())));
        Note first = new Note("Zähne putzen", "Ich habe dem Clienten die Zähne geputzt", new Carer("Olaf"),
                new Timestamp(1L));
        Note second = new Note("Eine Aufgabe", "Ich habe dem Clienten die Zähne geputzt", new Carer("not Olaf")
                , new Timestamp(3L));
        Note third = new Note("Keks", "Ich habe dem Clienten die Zähne geputzt",
                new Carer("Keksi"), new Timestamp(2L));
        ITEMS.add(first);
        ITEMS.add(second);
        ITEMS.add(third);

//        ITEMS.sort();
//        Collections.sort(ITEMS);
        // oder sort und dann Collections.reverse()

    }

    public static void fillErna(){};
    public static void fillErnst(){};
    public static void fillHelga(){};
    public static void fillEmma(){};
    public static void fillHans(){};
    public static void fillKarl(){};
    public static void fillIrmgard(){};

    public static long getYesterday() {
        GregorianCalendar yesterday = new GregorianCalendar();
        yesterday.add(Calendar.DATE, -1);
        return yesterday.getTime().getTime();
    }

    public static void sortList(List<Note> items){
        Collections.sort(items,Collections.<Note>reverseOrder());
    }
}

package de.suparv2exnerdjocokg.suparv2exnerdjo.dummy;

import java.util.ArrayList;
import java.util.List;

import de.suparv2exnerdjocokg.suparv2exnerdjo.Client;
import de.suparv2exnerdjocokg.suparv2exnerdjo.PhoneNumber;
import de.suparv2exnerdjocokg.suparv2exnerdjo.R;

/**
 * Created by dsfd on 19.12.2016.
 */

public class DummyClients {

    public static final List<Client> ITEMS = new ArrayList<>();


    static {
        ITEMS.add(createDummyClient());

        // Client 2 -> Ernst Meier

        ArrayList<PhoneNumber> phoneNumbers2 = new ArrayList<>();
        phoneNumbers2.add(new PhoneNumber("Holger Meier", "01786857658", "Sohn"));


        DummyVitalValues vital2 = new DummyVitalValues();
        DummyClientMedicine medicine2 = new DummyClientMedicine(DummyMedicine.ITEMS_PRESCRIBED_Ernst, DummyMedicine.ITEMS_TEMPORARY, DummyMedicine.ITEMS_SELF_ORDERED);

        ArrayList<Integer> pictograms2 = new ArrayList<>();

        ITEMS.add(new Client(1, R.drawable.ernst, "Ernst", "Meier", "25.11.1951", medicine2, DummyNotes.ITEMS_Ernst, DummyFixedNotes.ITEMS_Ernst, DummyToDos.ITEMS_Ernst, vital2.vitalValues, "COPD: chronisch obstruktive Lungenerkrankung, Bluthochdruck", 2, "Rosenthaler Weg 10B, 13159 Berlin", phoneNumbers2, pictograms2));
        /*
        // Client 3 ->  Helga Stern

        ArrayList<PhoneNumber> phoneNumbers3 = new ArrayList<>();
        phoneNumbers3.add(new PhoneNumber("Olaf Stern", "017855557658", "Sohn"));


        DummyVitalValues vital3 = new DummyVitalValues();
        DummyClientMedicine medicine3 = new DummyClientMedicine(DummyMedicine.ITEMS_PRESCRIBED_Helga, DummyMedicine.ITEMS_TEMPORARY, DummyMedicine.ITEMS_SELF_ORDERED);

        ArrayList<Integer> pictograms3 = new ArrayList<>();
        pictograms3.add(R.drawable.ear_);

        ITEMS.add(new Client(2, R.drawable.helga, "Helga", "Stern", "14.04.1958", medicine3, DummyNotes.ITEMS_Helga, DummyFixedNotes.ITEMS_Helga, DummyToDos.ITEMS_Helga, vital3.vitalValues, "Schwerhörig, Herzinsuffizienz, Bluthochdruck, Chronische Obstipation (Verstopfung), Schilddrüsenunterfunktion, Chronische Lungenentzündung", 3, "Schönerlinder Str. 56, 13127 Berlin", phoneNumbers3, pictograms3));
       
        // Client 4 ->  Emma Liesegang

        ArrayList<PhoneNumber> phoneNumbers4 = new ArrayList<>();
        phoneNumbers4.add(new PhoneNumber("Heinz Liesegang", "017833337658", "Ehemann"));


        DummyVitalValues vital4 = new DummyVitalValues();
        DummyClientMedicine medicine4 = new DummyClientMedicine(DummyMedicine.ITEMS_PRESCRIBED_Emma, DummyMedicine.ITEMS_TEMPORARY, DummyMedicine.ITEMS_SELF_ORDERED);

        ArrayList<Integer> pictograms4 = new ArrayList<>();
        pictograms4.add(R.drawable.brain);

        ITEMS.add(new Client(3, R.drawable.emma, "Emma", "Liesegang", "13.03.1957", medicine4, DummyNotes.ITEMS_Emma, DummyFixedNotes.ITEMS_Emma, DummyToDos.ITEMS_Emma, vital4.vitalValues, "Diabetis mellitus, Wunde am rechter Unterarm, Demenz, Herzinsuffizienz, Grundpflege durch die Tochter", 3, "Pankgrafenstraße 12D, 13125 Berlin", phoneNumbers4, pictograms4));

        // Client 5 -> Hans Rüdiger Schmidt

        ArrayList<PhoneNumber> phoneNumbers5 = new ArrayList<>();
        phoneNumbers5.add(new PhoneNumber("Thomas Reder", "017844447658", "Freund"));


        DummyVitalValues vital5 = new DummyVitalValues();
        DummyClientMedicine medicine5 = new DummyClientMedicine(DummyMedicine.ITEMS_PRESCRIBED_Hans, DummyMedicine.ITEMS_TEMPORARY, DummyMedicine.ITEMS_SELF_ORDERED);

        ArrayList<Integer> pictograms5 = new ArrayList<>();
        pictograms5.add(R.drawable.ear_);

        ITEMS.add(new Client(4, R.drawable.hans, "Hans Rüdiger", "Schmidt", "12.07.1949", medicine5, DummyNotes.ITEMS_Hans, DummyFixedNotes.ITEMS_Hans, DummyToDos.ITEMS_Hans, vital5.vitalValues, "Bluthochdruck, Schwerhörigkeit (Hörgerät beidseitig) -> langsam und deutlich reden!, Herzinsuffizienz", 2, "Kapellenweg 13, 13159 Berlin", phoneNumbers5, pictograms5));

        // Client 6 -> Karl Heinz Hufschmied

        ArrayList<PhoneNumber> phoneNumbers6 = new ArrayList<>();
        phoneNumbers6.add(new PhoneNumber("Hilde Hufschmied", "01656567658", "Ehefrau"));


        DummyVitalValues vital6 = new DummyVitalValues();
        DummyClientMedicine medicine6 = new DummyClientMedicine(DummyMedicine.ITEMS_PRESCRIBED_Karl, DummyMedicine.ITEMS_TEMPORARY, DummyMedicine.ITEMS_SELF_ORDERED);

        ArrayList<Integer> pictograms6 = new ArrayList<>();
        pictograms6.add(R.drawable.brain);


        ITEMS.add(new Client(5, R.drawable.karl, "Karl Heinz", "Hufschmied", "14.12.1939", medicine6, DummyNotes.ITEMS_Karl, DummyFixedNotes.ITEMS_Karl,  DummyToDos.ITEMS_Karl, vital6.vitalValues, "Demenz, Bettlägerig, Herzinsuffizienz, Inkontinenz, Karls Frau wohnt im selben Haushalt und übernimmt die Grundpflege", 3, "Hauptstraße 45, 13159 Berlin", phoneNumbers6, pictograms6));

        // Client 7 -> Irmgard Weber

        ArrayList<PhoneNumber> phoneNumbers7 = new ArrayList<>();
        phoneNumbers7.add(new PhoneNumber("Sandy Weber", "01656576658", "Tochter"));


        DummyVitalValues vital7 = new DummyVitalValues();
        DummyClientMedicine medicine7 = new DummyClientMedicine(DummyMedicine.ITEMS_PRESCRIBED_Irmgard, DummyMedicine.ITEMS_TEMPORARY, DummyMedicine.ITEMS_SELF_ORDERED);

        ArrayList<Integer> pictograms7 = new ArrayList<>();

        ITEMS.add(new Client(6, R.drawable.irmgard, "Irmgard", "Weber", "31.08.1927", medicine7, DummyNotes.ITEMS_Irmgard, DummyFixedNotes.ITEMS_Irmgard, DummyToDos.ITEMS_Irmgard, vital7.vitalValues, "COPD, Herzinsuffizienz", 2, "Buchholzer Str. 67, 13156 Berlin", phoneNumbers7, pictograms7));
        */
    }



    private static Client createDummyClient() {

        // Client 1 -> Erna Schubert

        PhoneNumber num1 = new PhoneNumber("Arnold Schubert","0151234567", "Ehemann");
        PhoneNumber num2 = new PhoneNumber("Helene Schubert","0171234567", "Tochter");
        ArrayList<PhoneNumber> phoneNumbers1 = new ArrayList<>();
        phoneNumbers1.add(num1);
        phoneNumbers1.add(num2);
        DummyVitalValues vital1 = new DummyVitalValues();

        ArrayList<Integer> pictograms1 = new ArrayList<>();

        DummyClientMedicine medicine1 = new DummyClientMedicine(DummyMedicine.ITEMS_PRESCRIBED_Erna, DummyMedicine.ITEMS_TEMPORARY, DummyMedicine.ITEMS_SELF_ORDERED);

        Client c = new Client(0,R.drawable.erna, "Erna","Schubert","17.08.1943",medicine1,DummyNotes.ITEMS_Erna, DummyFixedNotes.ITEMS_Erna, DummyToDos.ITEMS_Erna, vital1.vitalValues, "Diabetes mellitus, Adipositas, Schilddrüsenunterfuntion",1,"Blankenfelder Str. 82, 13127 Berlin",phoneNumbers1, pictograms1);

        return c;
    }
}

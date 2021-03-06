package de.suparv2exnerdjocokg.suparv2exnerdjo;

import android.support.v4.app.Fragment;
import android.util.Log;

import java.io.File;
import java.io.Serializable;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import de.suparv2exnerdjocokg.suparv2exnerdjo.Todo.Note;
import de.suparv2exnerdjocokg.suparv2exnerdjo.Todo.ToDo;
import de.suparv2exnerdjocokg.suparv2exnerdjo.Vital.VitalValues;
import de.suparv2exnerdjocokg.suparv2exnerdjo.dummy.DummyClientMedicine;

public class Client implements Serializable {
  private static final long serialVersionUID = -2163051469151804394L;
  private int id;
  private int imagePath;
  private String firstName;
  private Fragment frag;
  private String lastName;

  private String adress;

  private String birthDate;

  private int carelevel;

  private DummyClientMedicine medicineList;

  private List<Note> notes ;

  private List<Note> fixedNotes;

  private String concerns;

  private List<ToDo> toDoList;

  private VitalValues vital;

  private ArrayList<PhoneNumber> phoneNumber;
  private ArrayList<File> documentation;

  private ArrayList<Integer> pictograms;

  public Client(int id, int imagePath, String firstName, String lastName, String dateString, DummyClientMedicine medicineList,
                List<Note> notes, List<Note> fixed, List<ToDo> toDoList, VitalValues vital, String infodump, int carelevel, String adress, ArrayList<PhoneNumber> phoneNumber, ArrayList<Integer> pictograms){
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.imagePath = imagePath;

    String dateFormat = "dd/mm/yyyy";
    // this.birthDate = stringToDate(dateString, dateFormat);
    this.birthDate = dateString;
    this.medicineList = medicineList;
    this.notes = notes;
      this.fixedNotes = fixed;
    this.toDoList = toDoList;
    this.vital = vital;
    this.concerns= infodump;
    this.carelevel = carelevel;
    this.adress = adress;
    this.pictograms = pictograms;


  /*  PhoneNumber num1 = new PhoneNumber(context.getString(R.string.fam1),
            (context.getString(R.string.telephonenumber)));

    PhoneNumber num2 = new PhoneNumber(context.getString(R.string.fam2),
           (context.getString(R.string.telephonenumber2))); */
    this.phoneNumber = new ArrayList<>();
    this.phoneNumber = phoneNumber;
    String a = "" + phoneNumber.size();
    Log.println(Log.INFO, "test",a);
  }

    public List<Note> getFixedNotes() {
        return fixedNotes;
    }

    public void setFixedNotes(List<Note> fixedNotes) {
        this.fixedNotes = fixedNotes;
    }

    public ArrayList<Integer> getPictograms() {
    return pictograms;
  }

  public void setPictograms(ArrayList<Integer> pictograms) {
    this.pictograms = pictograms;
  }

  public int getImagePath() {
    return imagePath;
  }

  public ArrayList<File> getDocumentation() {
    return documentation;
  }

  public void setDocumentation(ArrayList<File> f){
    this.documentation = f;
  }
  public void addDocumentation(File documentation) {
    this.documentation.add(documentation);
  }

public String getFullName(){
  return (getFirstName()+" "+ getLastName());
}


  public int docsListLenghts(){
    int count =0;

    for (File e : documentation
         ) {
      count++;
    }
    return count;
  }
  public int getCarelevel() {
    return carelevel;
  }

  public void setCarelevel(int carelevel) {
    this.carelevel = carelevel;
  }
  private Date stringToDate(String aDate, String aFormat) {

    if(aDate==null) return null;
    ParsePosition pos = new ParsePosition(0);
    SimpleDateFormat simpledateformat = new SimpleDateFormat(aFormat);
    Date stringDate = simpledateformat.parse(aDate, pos);
    return stringDate;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public int getPhoneNumberlenght(){
    return phoneNumber.size();
  }

  public ArrayList<PhoneNumber> getPhoneNumber() {
    return phoneNumber;
  }

  public void addPhoneNumber(PhoneNumber phoneNumber){this.phoneNumber.add(phoneNumber);}

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public List<ToDo> getToDoList() {
    return toDoList;
  }

  public void setToDoList(List<ToDo> toDoList) {
    this.toDoList = toDoList;
  }

  public String getConcerns() {
    return concerns;
  }

  public void setConcerns(String concerns) {
    this.concerns = concerns;
  }

  public List<Note> getNotes() {
    return this.notes;
  }

  public void addErbrachteLeistung(Note notes) {
    this.notes.add(notes);
  }

  public DummyClientMedicine getMedicineList() {
    return medicineList;
  }

  public void setMedicineList(DummyClientMedicine medicine) {this.medicineList = medicine;}
/*
  public void deleteMedicine(String medicine){
    for (ClientMedicine med : medicineList) {
      if(med.getMedicine().getName() == medicine){
        medicineList.remove(med);
        break;
      }
    }
  }

  public deleteToDo(ToDo toDelete){

  }
*/

  public VitalValues getVital() {
    return vital;
  }

  public void setVital(VitalValues vital) {
    this.vital = vital;
  }

}
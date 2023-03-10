package services;

import adress.Adress;
import deliveryHistory.DeliveryHistory;
import deliveryHistory.Status;
import packageStation.PackageStation;
import packageStation.Post;
import packageStation.Volg;
import person.Person;
import person.Pronoun;
import shippingObject.Letter;
import shippingObject.ShippingPackage;
import shippingObject.envelopType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Storage {
    private Adress firstPostAddress = new Adress("Metallstrasse", "9 Laubenhof", 6300, "Zug");
    private Adress secondPostAddress = new Adress("Grabenstrasse", "5", 6300, "Zug");
    private Adress thirdPostAddress = new Adress("Herti", "Hertizentrum 10", 6300, "Zug");
    private Adress fourthPostAddress = new Adress("Dammstrasse", "22", 6300, "Zug");

    private Adress firstVolgAdress = new Adress("Albisstrasse", "19", 8915, "Hausen am Albis");
    private Adress secondVolgAdress = new Adress("Albisstrasse", "3", 8932, "Mettmenstetten");
    private Adress thirdVolgAdress = new Adress("Dorfp.", "1", 8911, "Rifferswil");

    private Adress janAdress = new Adress("Am Eulachpark", "12",8404, "Oberwinterthur");
    private Adress mikkaAdress = new Adress("Steinhaldenstrasse", "69", 8002, "Zürich");
    private Adress sophiaAdress = new Adress("Haslirainstrasse", "12A", 6035, "Perlen");

    private Person jan = new Person("Jan", "Schefer", Pronoun.Herr, janAdress);
    private Person mikka = new Person("Mikka", "Kummer", Pronoun.Herr, mikkaAdress);
    private Person sophia = new Person("Sophia", "Moos", Pronoun.Frau, sophiaAdress);

    private ShippingPackage firstPackage = new ShippingPackage("1", sophia, jan, "30cm x 50cm", false);
    private Letter firstLetter = new Letter("2", mikka, jan, envelopType.A3);

    private Post firstPost = new Post(new Date(2023, 1, 23), firstPostAddress, "Post", "Zug Metalli Post", false, true);
    private Post secondPost = new Post(new Date(2023, 1, 24), secondPostAddress, "Post", "Grabenpoststelle", true, false);
    private Volg firstVolg = new Volg(new Date(2023, 1, 16), firstVolgAdress, "Volg", "Volg Hausen am Albis", true, false);
    private Post thirdPost = new Post(new Date(2023, 1,14), thirdPostAddress, "Post", "Hertizentrum Post", false, true);
    private Volg secondVolg = new Volg(new Date(2023, 1, 13), secondVolgAdress, "Volg", "Volg Mettmestetten", false, true);

    private ArrayList<? extends PackageStation> listOne = new ArrayList<>(List.of(firstPost, secondPost));
    private ArrayList<? extends PackageStation> listTwo = new ArrayList<>(List.of(secondVolg, thirdPost, firstVolg));
    private DeliveryHistory firstHistory = new DeliveryHistory(Status.shipped, listOne, new Date(2023, 01, 25));
    private DeliveryHistory secondHistory = new DeliveryHistory(Status.shipped, listTwo, new Date(2023, 1, 16));

    public Storage(){
        this.firstPackage.setPackageStations(listOne);
        this.firstPackage.setStatus(Status.shipped);
        this.firstPackage.setDeliveryDate(new Date(2023, 01, 25));
        this.firstLetter.setPackageStations(listTwo);
        this.firstLetter.setStatus(Status.shipped);
        this.firstLetter.setDeliveryDate(new Date(2023, 01, 16));
    }

    public Letter getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(Letter firstLetter) {
        this.firstLetter = firstLetter;
    }

    public Volg getFirstVolg() {
        return firstVolg;
    }

    public void setFirstVolg(Volg firstVolg) {
        this.firstVolg = firstVolg;
    }

    public Post getThirdPost() {
        return thirdPost;
    }

    public void setThirdPost(Post thirdPost) {
        this.thirdPost = thirdPost;
    }

    public Volg getSecondVolg() {
        return secondVolg;
    }

    public void setSecondVolg(Volg secondVolg) {
        this.secondVolg = secondVolg;
    }

    public ArrayList<? extends PackageStation> getListTwo() {
        return listTwo;
    }

    public void setListTwo(ArrayList<? extends PackageStation> listTwo) {
        this.listTwo = listTwo;
    }

    public DeliveryHistory getSecondHistory() {
        return secondHistory;
    }

    public void setSecondHistory(DeliveryHistory secondHistory) {
        this.secondHistory = secondHistory;
    }

    public Adress getFirstPostAddress() {
        return firstPostAddress;
    }

    public void setFirstPostAddress(Adress firstPostAddress) {
        this.firstPostAddress = firstPostAddress;
    }

    public Adress getSecondPostAddress() {
        return secondPostAddress;
    }

    public void setSecondPostAddress(Adress secondPostAddress) {
        this.secondPostAddress = secondPostAddress;
    }

    public Adress getThirdPostAddress() {
        return thirdPostAddress;
    }

    public void setThirdPostAddress(Adress thirdPostAddress) {
        this.thirdPostAddress = thirdPostAddress;
    }

    public Adress getFourthPostAddress() {
        return fourthPostAddress;
    }

    public void setFourthPostAddress(Adress fourthPostAddress) {
        this.fourthPostAddress = fourthPostAddress;
    }

    public Adress getFirstVolgAdress() {
        return firstVolgAdress;
    }

    public void setFirstVolgAdress(Adress firstVolgAdress) {
        this.firstVolgAdress = firstVolgAdress;
    }

    public Adress getSecondVolgAdress() {
        return secondVolgAdress;
    }

    public void setSecondVolgAdress(Adress secondVolgAdress) {
        this.secondVolgAdress = secondVolgAdress;
    }

    public Adress getThirdVolgAdress() {
        return thirdVolgAdress;
    }

    public void setThirdVolgAdress(Adress thirdVolgAdress) {
        this.thirdVolgAdress = thirdVolgAdress;
    }

    public Adress getJanAdress() {
        return janAdress;
    }

    public void setJanAdress(Adress janAdress) {
        this.janAdress = janAdress;
    }

    public Adress getMikkaAdress() {
        return mikkaAdress;
    }

    public void setMikkaAdress(Adress mikkaAdress) {
        this.mikkaAdress = mikkaAdress;
    }

    public Adress getSophiaAdress() {
        return sophiaAdress;
    }

    public void setSophiaAdress(Adress sophiaAdress) {
        this.sophiaAdress = sophiaAdress;
    }

    public Person getJan() {
        return jan;
    }

    public void setJan(Person jan) {
        this.jan = jan;
    }

    public Person getMikka() {
        return mikka;
    }

    public void setMikka(Person mikka) {
        this.mikka = mikka;
    }

    public Person getSophia() {
        return sophia;
    }

    public void setSophia(Person sophia) {
        this.sophia = sophia;
    }

    public ShippingPackage getFirstPackage() {
        return firstPackage;
    }

    public void setFirstPackage(ShippingPackage firstPackage) {

        this.firstPackage = firstPackage;
    }

    public Post getFirstPost() {
        return firstPost;
    }

    public void setFirstPost(Post firstPost) {
        this.firstPost = firstPost;
    }

    public Post getSecondPost() {
        return secondPost;
    }

    public void setSecondPost(Post secondPost) {
        this.secondPost = secondPost;
    }

    public ArrayList<? extends PackageStation> getListOne() {
        return listOne;
    }

    public void setListOne(ArrayList<? extends PackageStation> listOne) {
        this.listOne = listOne;
    }

    public DeliveryHistory getFirstHistory() {
        return firstHistory;
    }

    public void setFirstHistory(DeliveryHistory firstHistory) {
        this.firstHistory = firstHistory;
    }
}

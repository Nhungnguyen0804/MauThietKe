package Cau1;

import java.util.ArrayList;
import java.util.List;

public class Family implements PersonComponent {
    private List<PersonComponent> per = new ArrayList<>();
    private List<Person> con = new ArrayList<>();

    public List<PersonComponent> getPer() {
        return per;
    }

    public List<Person> getListChild() {
        return con;
    }

    public void addPerson(Person p) {
        per.add(p);
    }

    public void removePerson(Person p) {
        per.remove(p);
    }

    public void addFamily(PersonComponent p) {
        per.add(p);
    }

    public void removeFamily(PersonComponent p) {
        per.remove(p);
    }

    public void addChild(Person p) {
        con.add(p);
    }

    public void remove(Person p) {
        con.remove(p);
    }

    @Override
    public void showPersonInfo() {
        for (PersonComponent pc : per) {
            pc.showPersonInfo();
        }
    }

    public List<Person> getPersonUnmarried() {
        List<Person> person = new ArrayList<>();
        for (PersonComponent pc : per) {
            if (pc instanceof Person) {
                Person ng = (Person) pc;
                if (ng.getKetHon() == false) {
                    person.add(ng);
                }
            }
        }
        return person;
    }
    public void showPersonUnmarried() {
        List<Person> listPersonUnmarried = getPersonUnmarried();
        for (Person p : listPersonUnmarried) {
            p.showPersonInfo();
        }
    }

    public void showListCon() {
        for (PersonComponent pc : con) {
            pc.showPersonInfo();
        }
    }
    public void showFamilyCo2Con() {
        for (PersonComponent p : per) {
            if (p instanceof Family) {
                Family fa = (Family) p;
                if (fa.getListChild().size() == 2) {
                    System.out.println("Cap vo chong:");
                    fa.showPersonInfo();
                    System.out.println("2 con cua ho la:");
                    fa.showListCon();
                }

            }
        }
    }

    /**
     * tim all tat ca thanh vien. neu bo me co con va con cua ho chua co con thi con ho la the he moi nhat.
     * neu bo me co con va con ho 1 trong so chung co con thi k la the he moi nhat.
     */

    public List<Person> getListTheHeMoiNhat() {
        List<Person> listTheHeMoiNhat = new ArrayList<>();
        for (PersonComponent pc : per) {
            if (pc instanceof Family) {
                Family fa = (Family) pc;
                List<Person> conOfFa = fa.getListChild();
                boolean coNguoiKetHonRoi = false;
                for (Person person : conOfFa) {
                    if (person.getKetHon() == true) {
                        coNguoiKetHonRoi = true;
                        break;
                    }
                }
                if (coNguoiKetHonRoi == false) {
                    listTheHeMoiNhat.addAll(conOfFa);
                }


            }
        }
        return listTheHeMoiNhat;
    }

    public void showTheHeMoiNhat() {
        List<Person> listTheHeMoiNhat = getListTheHeMoiNhat();
        for (Person p : listTheHeMoiNhat) {
            p.showPersonInfo();
        }
    }
}

package Cau1;

public class Client {
    public static void main(String[] args) {

        // cac ca nhan
        Person james = new Person("James", "1/1/1970", "nam");
        Person hana = new Person("Hana", "1/1/1975", "nu");

        // danh sach pha he
        Family listPhaHe = new Family();

        // james ket hon voi hana
        james.KetHon(hana);

        Family james_family = new Family();
        james_family.addPerson(james);
        james_family.addPerson(hana);

        listPhaHe.addFamily(james_family);

        // james va hana co 2 nguoi con la kai, ryan
        Person ryan = new Person("Ryan", "1/1/1995", "nam");
        Person kai = new Person("Kai", "1/1/1997", "nam");
        james_family.addChild(ryan);
        james_family.addChild(kai);
        // ryan k lay vo

        listPhaHe.addPerson(ryan);

        //kai lay jennifer va co bon nguoi con 2 nam 2 nu
        Family kai_family = new Family();
        kai_family.addPerson(kai);


        Person Jennifer = new Person("Jennifer", "1/1/1998", "nu");
        kai_family.addPerson(Jennifer);

        listPhaHe.addFamily(kai_family);

        kai.KetHon(Jennifer);


        // 4 nguoi con
        Person con1 = new Person("con 1", "1/1/1999","nam");
        Person con2 = new Person("con 2", "1/1/2000", "nam");
        Person con3 = new Person("con 3", "1/1/2001", "nu");
        Person con4 = new Person("con 4", "1/1/2002","nu");

        kai_family.addChild(con1);
        kai_family.addChild(con2);
        kai_family.addChild(con3);
        kai_family.addChild(con4);

        listPhaHe.addPerson(con1);
        listPhaHe.addPerson(con2);
        listPhaHe.addPerson(con3);
        listPhaHe.addPerson(con4);

        // hien thi danh sach pha he
        System.out.println("Danh sach pha he:");
        listPhaHe.showPersonInfo();

        // tim nguoi khong ket hon
        System.out.println("============");
        System.out.println("Tim nhung nguoi khong ket hon:");
        listPhaHe.showPersonUnmarried();


        // cap vo chong co 2 vo chong
        System.out.println("============");
        System.out.println("Tim cac cap vo chong co 2 con:");
        listPhaHe.showFamilyCo2Con();

        // the he moi nhat
        System.out.println("============");
        System.out.println("Tim tat ca the he moi nhat:");
        listPhaHe.showTheHeMoiNhat();

    }
}

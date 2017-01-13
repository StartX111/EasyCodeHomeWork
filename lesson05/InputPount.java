package EasyCodeHomeWork.lesson05;

public class InputPount {

    public static void main(String[] args) {
        String[] sender = {"Rubasovska", "7/2", "61004", "Kharkov", "Kharkovska", "Ukraine"};
        PackageAddressee pakAdr = new PackageAddressee(561613, sender);
        System.out.println(pakAdr.idPackage);
//        System.out.println("test");
    }

}

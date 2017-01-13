package EasyCodeHomeWork.lesson05;

public class PackageAddressee extends Package{
    enum AddressStringName {STREET, APARTMENT, ZIPCODE, CITY, REGION, COUNTRY};
    String[] sender = new String[6];
    String[] addressee = new String[6];

    public PackageAddressee(int idPackage, String[] sender) {
        super(idPackage);
        this.sender = sender;
    }

    public PackageAddressee(int idPackage, String[] sender, String[] addressee) {
        super(idPackage);
        this.sender = sender;
        this.addressee = addressee;
    }
}

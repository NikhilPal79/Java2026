package inclass.mar11.Encalpsulation;

public class FilePermissionMain {
    static void main(String[] args) {

        FilePermission filePermission = new FilePermission(true, true);

        System.out.println(" default o/p: " + filePermission.toString());


        ///  case1 = read only [ excluding setter ]

        filePermission.isReadOnly();



        ///  case 2 = write only

        ///  read and write
    }
}

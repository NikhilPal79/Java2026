package inclass.mar11.Encalpsulation;

public class FilePermission {

    private boolean readOnly;
    private boolean writeOnly;

    public FilePermission(boolean readOnly, boolean writeOnly) {
        this.readOnly = readOnly;
        this.writeOnly = writeOnly;
    }

    public boolean isReadOnly() {
        return readOnly;
    }

    /*public void setReadOnly(boolean readOnly) {
        this.readOnly = readOnly;
    }

    public boolean isWriteOnly() {
        return writeOnly;
    }

    public void setWriteOnly(boolean writeOnly) {
        this.writeOnly = writeOnly;
    }*/

    @Override
    public String toString() {
        return "FilePermission{" +
                "readOnly=" + readOnly +
                ", writeOnly=" + writeOnly +
                '}';
    }
}




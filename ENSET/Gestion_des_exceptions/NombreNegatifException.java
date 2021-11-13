package Gestion_des_exceptions;

public class NombreNegatifException extends Exception {
    private int valErr;
    public NombreNegatifException(int valErr) {
        this.valErr = valErr;
    }

    @Override
    public String getMessage() {
        return "Nombre negatif";
    }

    public int getValErr() {
        return valErr;
    }
}
